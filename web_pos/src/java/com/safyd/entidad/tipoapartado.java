package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class tipoapartado extends ORM<tipoapartado> {

    private Integer tia_id;
    private String tia_clave;
    private String tia_descripcion;

    public tipoapartado() {
        super.setClass(this);
    }

    public tipoapartado(
            Integer tia_id,
            String tia_clave,
            String tia_descripcion
    ) {
        super.setClass(this);
        this.tia_id = tia_id;
        this.tia_clave = tia_clave;
        this.tia_descripcion = tia_descripcion;

    }

    public Integer getTia_id() {
        return tia_id;
    }

    public void setTia_id(Integer tia_id) {
        this.tia_id = tia_id;
    }

    public String getTia_clave() {
        return tia_clave;
    }

    public void setTia_clave(String tia_clave) {
        this.tia_clave = tia_clave;
    }

    public String getTia_descripcion() {
        return tia_descripcion;
    }

    public void setTia_descripcion(String tia_descripcion) {
        this.tia_descripcion = tia_descripcion;
    }

}
