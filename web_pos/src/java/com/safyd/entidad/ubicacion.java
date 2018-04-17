package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class ubicacion extends ORM<ubicacion> {

    private Integer ubi_id;
    private Integer ubi_clave;
    private String ubi_descripcion;

    public ubicacion() {
        super.setClass(this);
    }

    public ubicacion(
            Integer ubi_id,
            Integer ubi_clave,
            String ubi_descripcion
    ) {
        super.setClass(this);
        this.ubi_id = ubi_id;

        this.ubi_clave = ubi_clave;

        this.ubi_descripcion = ubi_descripcion;
    }

    public Integer getUbi_id() {
        return ubi_id;
    }

    public void setUbi_id(Integer ubi_id) {
        this.ubi_id = ubi_id;
    }

    public Integer getUbi_clave() {
        return ubi_clave;
    }

    public void setUbi_clave(Integer ubi_clave) {
        this.ubi_clave = ubi_clave;
    }

    public String getUbi_descripcion() {
        return ubi_descripcion;
    }

    public void setUbi_descripcion(String ubi_descripcion) {
        this.ubi_descripcion = ubi_descripcion;
    }

}
