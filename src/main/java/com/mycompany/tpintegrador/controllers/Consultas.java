
package com.mycompany.tpintegrador.controllers;

import com.mycompany.tpintegrador.models.Incidente;
import com.mycompany.tpintegrador.models.Tecnico;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Consultas {

    private final EntityManagerFactory entityManagerFactory;

    public Consultas() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("tp2JPAPU");
    }

    public Consultas(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    //consulta 1: Quién fue el técnico con más incidentes resueltos en los últimos N días
    
    public List<Object[]> obtenerTecnicoConMasIncidentesResueltos(int ultimosDias) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Tecnico> tecnicos = new ArrayList<>();

        List<Object[]> results = new ArrayList<>();
        try {
            LocalDateTime fechaLimite = LocalDateTime.now().minusDays(ultimosDias);

            TypedQuery<Object[]> query = entityManager.createQuery(
                    "SELECT i.tecnico, COUNT(i)  "
                    + "FROM Incidente i "
                    + "WHERE i.estado = 'resuelto' "
                    + "AND i.fecha_finalizacion >= :fechaLimite "
                    + "GROUP BY i.tecnico "
                    + "ORDER BY COUNT(i) DESC",
                    Object[].class)
                    .setParameter("fechaLimite", fechaLimite)
                    .setMaxResults(1);

            results = query.getResultList();
        } catch (Exception ex) {
            System.out.println("Error al obtener el técnico con más incidentes resueltos en los últimos " + ultimosDias + " días");
        } finally {
            entityManager.close();
        }

        return results;
    }

    //Consulta 2: Quién fue el técnico con más incidentes resueltos por especialidad en los últimos N días
    
   public List<Object[]> obtenerTecnicoConMasIncidentesResueltosDeTipo(int ultimosDias, String tipoIncidente) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    List<Object[]> results = new ArrayList<>();
    try {
        LocalDateTime fechaLimite = LocalDateTime.now().minusDays(ultimosDias);

        TypedQuery<Object[]> query = entityManager.createQuery(
                "SELECT i.tecnico, COUNT(i) " +
                "FROM Incidente i " +
                "WHERE i.estado = 'resuelto' " +
                "AND i.fecha_finalizacion >= :fechaLimite " +
                "AND i.tipo = :tipoIncidente " +
                "GROUP BY i.tecnico " +
                "ORDER BY COUNT(i) DESC",
                Object[].class)
                .setParameter("fechaLimite", fechaLimite)
                .setParameter("tipoIncidente", tipoIncidente)
                .setMaxResults(1);

        results = query.getResultList();
    } catch (Exception ex) {
        System.out.println("Error al obtener el técnico con más incidentes resueltos del tipo " + tipoIncidente + " en los últimos " + ultimosDias + " días");
    } finally {
        entityManager.close();
    }

    return results;
}

    //Consulta 3: Quién fue el técnico que más rápido resolvió los incidentes
    
    public Tecnico obtenerTecnicoMasRapido() {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Tecnico tecnico = null;
    try {
        TypedQuery<Tecnico> query = entityManager.createQuery(
                "SELECT i.tecnico " +
                "FROM Incidente i " +
                "WHERE i.estado = 'resuelto' " +
                "ORDER BY (i.fecha_finalizacion - i.fecha_incidente) ASC",
                Tecnico.class)
                .setMaxResults(1);

        tecnico = query.getSingleResult();
    } catch (Exception ex) {
        System.out.println("Error al obtener el técnico que más rápido resolvió los incidentes");
    } finally {
        entityManager.close();
    }

    return tecnico;
}
    
    //Consulta 4: Reporte diario con los incidentes asignados a cada técnico y el estado de los mismos
    
    public List<Incidente> reporteDiarioIncidentes(LocalDate fechaEspecifica) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Incidente> incidentes = new ArrayList<>();

        try {
            LocalDateTime fechaInicio = fechaEspecifica.atStartOfDay();
            LocalDateTime fechaFin = fechaInicio.plusDays(1).minusSeconds(1); // Establecer la fecha hasta el final del día

            String consulta = "SELECT i FROM Incidente i JOIN FETCH i.tecnico WHERE i.fecha_incidente >= :fechaInicio AND i.fecha_incidente <= :fechaFin ORDER BY i.tecnico";

            TypedQuery<Incidente> query = entityManager.createQuery(consulta, Incidente.class);
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);

            incidentes = query.getResultList();
        } catch (Exception ex) {
            System.out.println("Error al generar el reporte por técnico para la fecha especificada: " + ex.getMessage());
        } finally {
            entityManager.close();
        }
        System.out.println("************************************************");
        System.out.println("En el día de la fecha: " + fechaEspecifica);
        System.out.println("-------------------------------------------------");
        System.out.println("Se reportaron "+incidentes.size()+ " incidentes: ");
        System.out.println("-------------------------------------------------");
        return incidentes;

    }
    
    
}
