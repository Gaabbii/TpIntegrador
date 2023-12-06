
package com.mycompany.tpintegrador.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "incidente")
public class Incidente implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_incidente;
    @Basic
    private String descripcion;
    @Basic
    private LocalDateTime fecha_incidente;
    @Basic
    private LocalDateTime fecha_finalizacion;
    @Basic
    private String estado;
    @Basic
    private String tipo;
    @Basic
    private String dificultad;
    @Basic
    private String consideraciones;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Servicio servicio;
    @OneToOne
    private Tecnico tecnico;

    public Incidente() {
    }

    public Incidente(int id_incidente, String descripcion, LocalDateTime fecha_incidente, LocalDateTime fecha_finalizacion, String estado, String tipo, String dificultad, String consideraciones, Cliente cliente, Servicio servicio, Tecnico tecnico) {
        this.id_incidente = id_incidente;
        this.descripcion = descripcion;
        this.fecha_incidente = fecha_incidente;
        this.fecha_finalizacion = fecha_finalizacion;
        this.estado = estado;
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.consideraciones = consideraciones;
        this.cliente = cliente;
        this.servicio = servicio;
        this.tecnico = tecnico;
    }

    public Incidente(String descripcion, LocalDateTime fecha_incidente, LocalDateTime fecha_finalizacion, String estado, String tipo, String dificultad, String consideraciones, Cliente cliente, Servicio servicio, Tecnico tecnico) {
        this.descripcion = descripcion;
        this.fecha_incidente = fecha_incidente;
        this.fecha_finalizacion = fecha_finalizacion;
        this.estado = estado;
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.consideraciones = consideraciones;
        this.cliente = cliente;
        this.servicio = servicio;
        this.tecnico = tecnico;
    }

    public int getId_incidente() {
        return id_incidente;
    }

    public void setId_incidente(int id_incidente) {
        this.id_incidente = id_incidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha_incidente() {
        return fecha_incidente;
    }

    public void setFecha_incidente(LocalDateTime fecha_incidente) {
        this.fecha_incidente = fecha_incidente;
    }

    public LocalDateTime getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(LocalDateTime fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getConsideraciones() {
        return consideraciones;
    }

    public void setConsideraciones(String consideraciones) {
        this.consideraciones = consideraciones;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Incidente{" + "id_incidente=" + id_incidente + ", descripcion=" + descripcion + ", fecha_incidente=" + fecha_incidente + ", fecha_finalizacion=" + fecha_finalizacion + ", estado=" + estado + ", tipo=" + tipo + ", dificultad=" + dificultad + ", consideraciones=" + consideraciones + ", cliente=" + cliente + ", servicio=" + servicio + ", tecnico=" + tecnico + '}';
    }
    
    public void agregarColchonDeHoras(int colchonHoras) {

        if (dificultad.equals("complejo")) {
            System.out.println("Fechas estimada de resolucion estimada: " + fecha_incidente.plusHours(6+ colchonHoras));

           // System.out.println("Fechas estimada de resolucion despues: " + fecha_incidente.plusHours(10));
        }

    }
}
