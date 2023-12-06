
package com.mycompany.tpintegrador.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tecnico")
public class Tecnico implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_tecnico;
    @Basic
    private String nombre;
    @Basic
    private String medio_notificacion;
    @Basic
    private String especialidad;

    public Tecnico() {
    }

    public Tecnico(int id_tecnico, String nombre, String medio_notificacion, String especialidad) {
        this.id_tecnico = id_tecnico;
        this.nombre = nombre;
        this.medio_notificacion = medio_notificacion;
        this.especialidad = especialidad;
    }

    public Tecnico(String nombre, String medio_notificacion, String especialidad) {
        this.nombre = nombre;
        this.medio_notificacion = medio_notificacion;
        this.especialidad = especialidad;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedio_notificacion() {
        return medio_notificacion;
    }

    public void setMedio_notificacion(String medio_notificacion) {
        this.medio_notificacion = medio_notificacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "id_tecnico=" + id_tecnico + ", nombre=" + nombre + ", medio_notificacion=" + medio_notificacion + ", especialidad=" + especialidad + '}';
    }
    
    
}
