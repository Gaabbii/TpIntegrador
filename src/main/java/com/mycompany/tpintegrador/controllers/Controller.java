
package com.mycompany.tpintegrador.controllers;

import com.mycompany.tpintegrador.models.Cliente;
import com.mycompany.tpintegrador.models.Incidente;
import com.mycompany.tpintegrador.models.Servicio;
import com.mycompany.tpintegrador.models.Tecnico;
import java.time.LocalDateTime;
import java.time.Month;
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
    
    public void cargarBaseDatos(){
        
        Cliente cli= new Cliente(1, "22222222222", "gabriela costa", "gabi@gamil.com");
        Cliente cli2= new Cliente(2, "33333333333", "raul perez", "rau@gamil.com");
        Cliente cli3= new Cliente(3, "44444444444", "jorge sanchez", "jor@gamil.com");
        Cliente cli4= new Cliente(4, "55555555555", "luis silva", "lucho@gamil.com");
        Cliente cli5= new Cliente(5, "66666666666", "diego montoya", "die@gmail.com");
        
        //CREAR CLIENTE
        control.crearCliente(cli);
        control.crearCliente(cli2);
        control.crearCliente(cli3);
        control.crearCliente(cli4);
        control.crearCliente(cli5);
        
        Servicio ser7 = new Servicio(7, "windows");
        Servicio ser8 = new Servicio(8, "linux");
        Servicio ser9 = new Servicio(9, "macOS");
        
        //CREAR SERVICIO
        control.crearServicio(ser7);
        control.crearServicio(ser8);
        control.crearServicio(ser9);
        
        Tecnico tec = new Tecnico(1, "sergio mora", "whatsapp", "windows");
        Tecnico tec2 = new Tecnico(2, "adrian castro", "whatsapp", "linux");
        Tecnico tec3 = new Tecnico(3, "antonio aime", "whatsapp", "debian");
        Tecnico tec4 = new Tecnico(4, "ariel cobos", "whatsapp", "mac OS");
        Tecnico tec5 = new Tecnico(5, "tomas alvarez", "whatsapp", "unix");
        Tecnico tec6 = new Tecnico(6, "roman rios", "email", "windows");
        Tecnico tec7 = new Tecnico(7, "fernando oliva", "email", "linux");
        Tecnico tec8 = new Tecnico(8, "sabastian ferro", "email", "mac OS");
        Tecnico tec9 = new Tecnico(9, "german capelli", "email", "mac OS");
        
       
        //CREAR TECNICO
        control.crearTecnico(tec);
        control.crearTecnico(tec2);
        control.crearTecnico(tec3);
        control.crearTecnico(tec4);
        control.crearTecnico(tec5);
        control.crearTecnico(tec6);
        control.crearTecnico(tec7);
        control.crearTecnico(tec8);
        control.crearTecnico(tec9);
        
        Incidente inc = new Incidente(1, "error 404",LocalDateTime.of(2023, Month.NOVEMBER, 17, 10, 34), LocalDateTime.of(2023,Month.NOVEMBER,17,12,34) , "resuelto", "windows", "simple", "", cli, ser8, tec6);
        Incidente inc2 = new Incidente(2, "error 404",LocalDateTime.of(2023, Month.NOVEMBER, 17, 14, 34), LocalDateTime.of(2023,Month.NOVEMBER,17,15,34) , "resuelto", "windows", "simple", "", cli4, ser7, tec6);
        Incidente inc3 = new Incidente(3, "error 404",LocalDateTime.of(2023, Month.NOVEMBER, 17, 16, 34), LocalDateTime.of(2023,Month.NOVEMBER,17,18,34) , "resuelto", "windows", "simple", "", cli5, ser9, tec6);
        Incidente inc4 = new Incidente(4, "error 404", LocalDateTime.of(2023, Month.NOVEMBER, 18, 10, 34), LocalDateTime.of(2023,Month.NOVEMBER, 18,17,34), "resuelto", "windows", "complejo", "", cli5, ser7, tec);
        Incidente inc5 = new Incidente(5, "pantalla azul", LocalDateTime.of(2023, Month.NOVEMBER, 19, 8, 34), LocalDateTime.of(2023,Month.NOVEMBER,19,13,34), "resuelto", "windows", "moderado", "", cli4, ser9, tec3);
        Incidente inc6 = new Incidente(6, "pantalla azul", LocalDateTime.of(2023, Month.NOVEMBER, 19, 14, 34), LocalDateTime.of(2023,Month.NOVEMBER,19,18,34), "resuelto", "windows", "moderado", "", cli2, ser7, tec3);
        Incidente inc7 = new Incidente(7, "pantalla azul", LocalDateTime.of(2023, Month.NOVEMBER, 17, 10, 34), LocalDateTime.of(2023, Month.NOVEMBER, 17, 18, 34), "resuelto", "mac OS", "complejo", "", cli3, ser9, tec4);
        Incidente inc8 = new Incidente(8, "no arranca el sistema", LocalDateTime.of(2023, Month.NOVEMBER, 18, 8, 34), LocalDateTime.of(2023, Month.NOVEMBER, 18, 12, 34), "resuelto", "mac OS", "moderado", "", cli5, ser7, tec8);
        Incidente inc9 = new Incidente(9, "no arranca el sistema", LocalDateTime.of(2023, Month.NOVEMBER, 18, 14, 34), LocalDateTime.of(2023, Month.NOVEMBER, 18, 18, 34), "resuelto", "mac OS", "moderado", "", cli4, ser9, tec8);
        Incidente inc10 = new Incidente(10, "no arranca el sistema", LocalDateTime.of(2023, Month.NOVEMBER, 19, 10, 34), LocalDateTime.of(2023, Month.NOVEMBER, 19, 12, 34), "resuelto", "mac OS", "simple", "", cli2, ser8, tec9);
        Incidente inc11 = new Incidente(11, "problemas con el servidor", LocalDateTime.of(2023, Month.NOVEMBER, 17, 8, 34), LocalDateTime.of(2023, Month.NOVEMBER, 17, 16, 34), "resuelto", "linux", "complejo", "", cli2, ser8, tec2);
        Incidente inc12 = new Incidente(12, "problemas con el servidor", LocalDateTime.of(2023, Month.NOVEMBER, 18, 10, 34), LocalDateTime.of(2023, Month.NOVEMBER, 18, 14, 34), "resuelto", "linux", "moderado", "", cli2, ser8, tec5);
        Incidente inc13 = new Incidente(13, "problemas con el servidor", LocalDateTime.of(2023, Month.NOVEMBER, 19, 10, 34), LocalDateTime.of(2023, Month.NOVEMBER, 19, 12, 34), "resuelto", "linux", "simple", "", cli4, ser9, tec7);
        Incidente inc14 = new Incidente(14, "problemas con el servidor", LocalDateTime.of(2023, Month.NOVEMBER, 19, 13, 34), LocalDateTime.of(2023, Month.NOVEMBER, 19, 15, 34), "resuelto", "linux", "simple", "", cli3, ser7, tec7);
        
        //CREAR INCIDENTE
        control.crearIncidente(inc);
        control.crearIncidente(inc2);
        control.crearIncidente(inc3);
        control.crearIncidente(inc4);
        control.crearIncidente(inc5);
        control.crearIncidente(inc6);
        control.crearIncidente(inc7);
        control.crearIncidente(inc8);
        control.crearIncidente(inc9);
        control.crearIncidente(inc10);
        control.crearIncidente(inc11);
        control.crearIncidente(inc12);
        control.crearIncidente(inc13);
        control.crearIncidente(inc14);
    
    }
}
