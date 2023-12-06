

package com.mycompany.tpintegrador;
import com.mycompany.tpintegrador.controllers.Consultas;
import com.mycompany.tpintegrador.controllers.Controller;
import com.mycompany.tpintegrador.models.Incidente;
import com.mycompany.tpintegrador.models.Tecnico;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TpIntegrador {

    private static String especialidad;

    public static void main(String[] args) {
        
        Controller control = new Controller();
        
        Consultas consultas6 = new Consultas();
                
        // Verificar si la tabla de incidentes está vacía
        if (consultas6.tablaIncidentesVacia()) {
            System.out.println("La tabla de incidentes está vacía. Cargando la base de datos...");
            // Llama al método para cargar la base de datos
            control.cargarBaseDatos();
        }else{
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\n*************************************************************************");
        System.out.println("                <<< ---------MENU PRINCIPAL---------- >>> ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Elija su consulta: \n1.Reporte de incidentes "
                + "diario \n2.Agregar colchón de horas para incidentes complejos \n3.Quién fue el técnico con más incidentes "
                + "resueltos en los últimos N días \n4. Quién fue el técnico con más incidentes resueltos de una determinada "
                + "especialidad en los últimos N días \n5. Quién fue el técnico que más rápido resolvió los incidentes \n6. Salir" );
        System.out.println("*************************************************************************");
        
        Consultas consultas = new Consultas();
        int ultimosDias = 20;
        
        String opcion;
        do{   
         opcion = leer.next();   
        switch(opcion){
            case "1": 
                LocalDate fecha1 = LocalDate.of(2023, Month.NOVEMBER, 17);

                List<Incidente> incidentes = consultas.reporteDiarioIncidentes(fecha1);

                for (Incidente incidente : incidentes) {
                    Tecnico tecnico = incidente.getTecnico();
                    System.out.println("-Id del incidente: "+ incidente.getId_incidente());
                    System.out.println(" Atendido por el técnico: " + tecnico.getNombre());
                    System.out.print(" Estado del incidente : " + incidente.getEstado());
                    System.out.println();
                }
                
                LocalDate fecha2 = LocalDate.of(2023, Month.NOVEMBER, 18);

                List<Incidente> incidentes2 = consultas.reporteDiarioIncidentes(fecha2);

                for (Incidente incidente : incidentes2) {
                    Tecnico tecnico = incidente.getTecnico();
                    System.out.println("-Id del incidente: "+ incidente.getId_incidente());
                    System.out.println(" Atendido por el técnico: " + tecnico.getNombre());
                    System.out.print(" Estado del incidente : " + incidente.getEstado());
                    System.out.println();
                }
                
                LocalDate fecha3 = LocalDate.of(2023, Month.NOVEMBER, 19);

                List<Incidente> incidentes3 = consultas.reporteDiarioIncidentes(fecha3);

                for (Incidente incidente : incidentes3) {
                    Tecnico tecnico = incidente.getTecnico();
                    System.out.println("-Id del incidente: "+ incidente.getId_incidente());
                    System.out.println(" Atendido por el técnico: " + tecnico.getNombre());
                    System.out.print(" Estado del incidente : " + incidente.getEstado());
                    System.out.println();
                }
                System.out.println("***********************************************");
            break;
            case "2": 
                
                    List<Object[]> incidentes4 = consultas.listarIncidentesPorDificultad();

                
                for (Object[] incidente : incidentes4) {
                    Integer idIncidente = (Integer) incidente[0];
                    String dificultad = (String) incidente[1];
                    LocalDateTime fechaIncidente = (LocalDateTime) incidente[2];
                    int colchonHorasExtras= 6;
                    int tiempo_estimado_resolucion= fechaIncidente.getHour()+ colchonHorasExtras;

                    
                    System.out.println("-ID Incidente: " + idIncidente);
                    System.out.println(" Fecha Incidente: " + fechaIncidente);
                    System.out.println(" Se agregaron "+ colchonHorasExtras+ " hs para que puedas resolver tu incidente");
                    System.out.println(" Horario estimado de resolución: " + tiempo_estimado_resolucion+ "hs del día de la fecha");
                    System.out.println("*************************************************************");
                }
                break;
            case "3":
                List<Tecnico> tecnicos = new ArrayList<>();

                List<Object[]> results = consultas.obtenerTecnicoConMasIncidentesResueltos(ultimosDias);

                if (!results.isEmpty()) {
                    Object[] result = results.get(0);
                    Tecnico tecnicoConMasIncidentes = (Tecnico) result[0];
                    Long cantidadIncidentes = (Long) result[1];

                    System.out.println("\n*************************************************************************");
                    System.out.println("-Técnico con más incidentes resueltos: " + tecnicoConMasIncidentes.getNombre());
                    System.out.println(" Incidentes resueltos: " + cantidadIncidentes);
                    System.out.println("*************************************************************************");
                } else {
                    System.out.println("\nNo se encontraron resultados para el técnico con más incidentes resueltos en los últimos días.");
                }
                break;
            case "4":
                String especialidad = "linux";
                List<Object[]> resultadosEspecialidad = consultas.obtenerTecnicoConMasIncidentesResueltosDeTipo(ultimosDias, especialidad);

                if (!resultadosEspecialidad.isEmpty()) {
                    Object[] resultado = resultadosEspecialidad.get(0);
                    Tecnico tecnicoMasIncidentes = (Tecnico) resultado[0];
                    Long cantidadIncidentes = (Long) resultado[1];

                    System.out.println("\n***************************************************************************************************************");
                    System.out.println("-Técnico con más incidentes resueltos de la especialidad '" + especialidad + "' en los últimos " + ultimosDias + " días: " + tecnicoMasIncidentes.getNombre());
                    System.out.println(" Cantidad de incidentes resueltos: " + cantidadIncidentes);
                } else {
                    System.out.println("\nNo se encontraron resultados para el técnico con más incidentes resueltos de la especialidad '" + especialidad + "' en los últimos " + ultimosDias + " días.");
                }

                String especialidad2 = "windows";
                List<Object[]> resultadosEspecialidad2 = consultas.obtenerTecnicoConMasIncidentesResueltosDeTipo(ultimosDias, especialidad2);

                if (!resultadosEspecialidad.isEmpty()) {
                    Object[] resultado = resultadosEspecialidad2.get(0);
                    Tecnico tecnicoMasIncidentes = (Tecnico) resultado[0];
                    Long cantidadIncidentes = (Long) resultado[1];

                    System.out.println("\n-Técnico con más incidentes resueltos de la especialidad '" + especialidad2 + "' en los últimos " + ultimosDias + " días: " + tecnicoMasIncidentes.getNombre());
                    System.out.println(" Cantidad de incidentes resueltos: " + cantidadIncidentes);
                } else {
                    System.out.println("\nNo se encontraron resultados para el técnico con más incidentes resueltos de la especialidad '" + especialidad2 + "' en los últimos " + ultimosDias + " días.");
                }

                String especialidad3 = "mac OS";
                List<Object[]> resultadosEspecialidad3 = consultas.obtenerTecnicoConMasIncidentesResueltosDeTipo(ultimosDias, especialidad3);

                if (!resultadosEspecialidad.isEmpty()) {
                    Object[] resultado = resultadosEspecialidad3.get(0);
                    Tecnico tecnicoMasIncidentes = (Tecnico) resultado[0];
                    Long cantidadIncidentes = (Long) resultado[1];

                    System.out.println("\n-Técnico con más incidentes resueltos de la especialidad '" + especialidad3 + "' en los últimos " + ultimosDias + " días: " + tecnicoMasIncidentes.getNombre());
                    System.out.println(" Cantidad de incidentes resueltos: " + cantidadIncidentes);
                    System.out.println("****************************************************************************************************************");
                } else {
                    System.out.println("\nNo se encontraron resultados para el técnico con más incidentes resueltos de la especialidad '" + especialidad3 + "' en los últimos " + ultimosDias + " días.");
                }
                break;
            case "5":
                Tecnico tecnicoMasRapido = consultas.obtenerTecnicoMasRapido();

                if (tecnicoMasRapido != null) {
                    
                    System.out.println("\n*************************************************************************");
                    System.out.println("-Técnico que más rápido resolvió los incidentes: " + tecnicoMasRapido.getNombre());
                    System.out.println("*************************************************************************");

                } else {
                    System.out.println("\nNo se encontraron resultados para el técnico que más rápido resolvió los incidentes.");
                }
                break;
            default:
                System.out.println("Opción  no válida, retornando al menu principal.");
                break;
        }
            System.out.println("\n---BIENVENIDO NUEVAMENTE AL MENU---\n Por favor escoja una opcion:\n1.Reporte de incidentes "
                + "diario \n2.Agregar colchón de horas para incidentes complejos \n3.Quién fue el técnico con más incidentes "
                + "resueltos en los últimos N días \n4. Quién fue el técnico con más incidentes resueltos de una determinada "
                + "especialidad en los últimos N días \n5. Quién fue el técnico que más rápido resolvió los incidentes \n6. Salir");
      
        } while (!opcion.equals("6"));

        System.out.println("---PROGRAMA FINALIZADO---");

        }
    }
}
    
    
    

       
        
        



        

      
    
       


