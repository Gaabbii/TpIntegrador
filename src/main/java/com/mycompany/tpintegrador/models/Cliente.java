
package com.mycompany.tpintegrador.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "cliente")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_cliente;
    @Basic
    private String cuit;
    @Basic
    private String razon_social;
    @Basic
    private String email;

    public Cliente() {
    }

    public Cliente(int id_cliente, String cuit, String razon_social, String email) {
        this.id_cliente = id_cliente;
        this.cuit = cuit;
        this.razon_social = razon_social;
        this.email = email;
    }

    public Cliente(String cuit, String razon_social, String email) {
        this.cuit = cuit;
        this.razon_social = razon_social;
        this.email = email;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", cuit=" + cuit + ", razon_social=" + razon_social + ", email=" + email + '}';
    }
    
}
