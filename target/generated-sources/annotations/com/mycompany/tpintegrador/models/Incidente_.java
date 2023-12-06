package com.mycompany.tpintegrador.models;

import com.mycompany.tpintegrador.models.Cliente;
import com.mycompany.tpintegrador.models.Servicio;
import com.mycompany.tpintegrador.models.Tecnico;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-06T10:21:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Incidente.class)
public class Incidente_ { 

    public static volatile SingularAttribute<Incidente, String> descripcion;
    public static volatile SingularAttribute<Incidente, Cliente> cliente;
    public static volatile SingularAttribute<Incidente, String> estado;
    public static volatile SingularAttribute<Incidente, String> tipo;
    public static volatile SingularAttribute<Incidente, String> consideraciones;
    public static volatile SingularAttribute<Incidente, Integer> id_incidente;
    public static volatile SingularAttribute<Incidente, Servicio> servicio;
    public static volatile SingularAttribute<Incidente, LocalDateTime> fecha_incidente;
    public static volatile SingularAttribute<Incidente, Tecnico> tecnico;
    public static volatile SingularAttribute<Incidente, LocalDateTime> fecha_finalizacion;
    public static volatile SingularAttribute<Incidente, String> dificultad;

}