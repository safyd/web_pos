package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class nomenclatura extends ORM<nomenclatura> {

    private Integer nom_id;
    private String nom_clave;
    private String nom_confiuracion;

    public nomenclatura() {

    }

    public nomenclatura(
            Integer nom_id,
            String nom_clave,
            String nom_confiuracion
    ) {

        super.setClass(this);
        this.nom_id = nom_id;
        this.nom_clave = nom_clave;
        this.nom_confiuracion = nom_confiuracion;
    }

    public Integer getNom_id() {
        return nom_id;
    }

    public void setNom_id(Integer nom_id) {
        this.nom_id = nom_id;
    }

    public String getNom_clave() {
        return nom_clave;
    }

    public void setNom_clave(String nom_clave) {
        this.nom_clave = nom_clave;
    }

    public String getNom_confiuracion() {
        return nom_confiuracion;
    }

    public void setNom_confiuracion(String nom_confiuracion) {
        this.nom_confiuracion = nom_confiuracion;
    }
    
}
