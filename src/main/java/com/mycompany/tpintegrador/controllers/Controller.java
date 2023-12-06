
package com.mycompany.tpintegrador.controllers;

import com.mycompany.tpintegrador.models.Cliente;
import com.mycompany.tpintegrador.models.Incidente;
import com.mycompany.tpintegrador.models.Servicio;
import com.mycompany.tpintegrador.models.Tecnico;
import java.util.ArrayList;


public class Controller {
    
    PersistenceController control= new PersistenceController();
    
    public void crearCliente(Cliente cliente){
        control.crearCliente(cliente);
    
    }
    
    public void eliminarCliente(int id){
        control.eliminarCliente(id);
    
    }
    
    public void editarCliente(Cliente cliente){
        control.editarCliente(cliente);
    
    }
    
    public Cliente buscarCliente(int id){
        Cliente cli= new Cliente();
        cli = control.buscarCliente(id);
        return cli;
    
    }
    
    public ArrayList<Cliente> listaCliente(){
        ArrayList<Cliente> clientes= new ArrayList<>();
        clientes = control.listaCliente();
        return clientes;
    }
    
    public void crearServicio(Servicio servicio){
        control.crearServicio(servicio);
    
    }
    
    public void eliminarServicio(int id){
        control.eliminarServicio(id);
    
    }
    
    public void editarServicio(Servicio servicio){
        control.editarServicio(servicio);
    
    }
    
    public Servicio buscarServicio(int id){
        Servicio serv= new Servicio();
        serv = control.buscarServicio(id);
        return serv;
    
    }
    
    public ArrayList<Servicio> listaServicio(){
        ArrayList<Servicio> servicios= new ArrayList<>();
        servicios = control.listaServicio();
        return servicios;
    }
    
    public void crearTecnico(Tecnico tecnico){
        control.crearTecnico(tecnico);
    
    }
    
    public void eliminarTecnico(int id){
        control.eliminarTecnico(id);
    
    }
    
    public void editarTecnico(Tecnico tecnico){
        control.editarTecnico(tecnico);
    
    }
    
    public Tecnico buscarTecnico(int id){
        Tecnico tec= new Tecnico();
        tec = control.buscarTecnico(id);
        return tec;
    
    }
    
    public ArrayList<Tecnico> listaTecnico(){
        ArrayList<Tecnico> tecnicos= new ArrayList<>();
        tecnicos = control.listaTecnico();
        return tecnicos;
    }
    
    public void crearIncidente(Incidente incidente){
        control.crearIncidente(incidente);
    
    }
    
    public void eliminarIncidente(int id){
        control.eliminarIncidente(id);
    
    }
    
    public void editarIncidente(Incidente incidente){
        control.editarIncidente(incidente);
    
    }
    
    public Incidente buscarIncidente(int id){
        Incidente inc= new Incidente();
        inc = control.buscarIncidente(id);
        return inc;
    
    }
    
    public ArrayList<Incidente> listaIncidente(){
        ArrayList<Incidente> incidentes= new ArrayList<>();
        incidentes = control.listaIncidente();
        return incidentes;
    }
}
