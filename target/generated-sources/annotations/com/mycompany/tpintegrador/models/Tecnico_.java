package com.mycompany.tpintegrador.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-06T09:39:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tecnico.class)
public class Tecnico_ { 

    public static volatile SingularAttribute<Tecnico, Integer> id_tecnico;
    public static volatile SingularAttribute<Tecnico, String> nombre;
    public static volatile SingularAttribute<Tecnico, String> especialidad;
    public static volatile SingularAttribute<Tecnico, String> medio_notificacion;

}