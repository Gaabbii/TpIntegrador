
package com.mycompany.tpintegrador.controllers;

import com.mycompany.tpintegrador.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpintegrador.models.Cliente;
import com.mycompany.tpintegrador.models.Incidente;
import com.mycompany.tpintegrador.models.Servicio;
import com.mycompany.tpintegrador.models.Tecnico;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class PersistenceController {
    
    ClienteJpaController clienteJPA = new ClienteJpaController();
    ServicioJpaController servicioJPA = new ServicioJpaController();
    TecnicoJpaController tecnicoJPA = new TecnicoJpaController();
    IncidenteJpaController incidenteJPA = new IncidenteJpaController();

    void crearCliente(Cliente cliente) {
        clienteJPA.create(cliente);

    }

    void eliminarCliente(int id) {
        try {
            clienteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void editarCliente(Cliente cliente) {
        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    Cliente buscarCliente(int id) {
         return clienteJPA.findCliente(id);

    }

    ArrayList<Cliente> listaCliente() {
        List<Cliente> listaTemp = clienteJPA.findClienteEntities();
        ArrayList<Cliente> lista= new ArrayList(listaTemp);      
        return lista;

    }

    void crearServicio(Servicio servicio) {
        servicioJPA.create(servicio);

    }

    void eliminarServicio(int id) {
        try {
            servicioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void editarServicio(Servicio servicio) {
        try {
            servicioJPA.edit(servicio);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    Servicio buscarServicio(int id) {
         return servicioJPA.findServicio(id);
        
    }

    ArrayList<Servicio> listaServicio() {
        List<Servicio> listaTemp = servicioJPA.findServicioEntities();
        ArrayList<Servicio> lista= new ArrayList(listaTemp);      
        return lista;
        
    }

    void crearTecnico(Tecnico tecnico) {
        tecnicoJPA.create(tecnico);

    }

    void eliminarTecnico(int id) {
        try {
            tecnicoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void editarTecnico(Tecnico tecnico) {
        try {
            tecnicoJPA.edit(tecnico);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    Tecnico buscarTecnico(int id) {
         return tecnicoJPA.findTecnico(id);

    }

    ArrayList<Tecnico> listaTecnico() {
        List<Tecnico> listaTemp = tecnicoJPA.findTecnicoEntities();
        ArrayList<Tecnico> lista= new ArrayList(listaTemp);      
        return lista;

    }

    void crearIncidente(Incidente incidente) {
        incidenteJPA.create(incidente);

    }

    void eliminarIncidente(int id) {  
        try {
            incidenteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    void editarIncidente(Incidente incidente) {
        try {
            incidenteJPA.edit(incidente);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    Incidente buscarIncidente(int id) {
         return incidenteJPA.findIncidente(id);

    }

    ArrayList<Incidente> listaIncidente() {
        List<Incidente> listaTemp = incidenteJPA.findIncidenteEntities();
        ArrayList<Incidente> lista= new ArrayList(listaTemp);      
        return lista;

    }
    
    
        
}



