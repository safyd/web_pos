package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class tipomerma extends ORM<tipomerma> {

    private Integer tpm_id;
    private String tpm_clave;
    private String tpm_descripcion;

    public tipomerma() {
        super.setClass(this);
    }

    public tipomerma(
            Integer tpm_id,
            String tpm_clave,
            String tpm_descripcion
    ) {
        super.setClass(this);
        this.tpm_id = tpm_id;
        this.tpm_clave = tpm_clave;
        this.tpm_descripcion = tpm_descripcion;
    }

    public Integer getTpm_id() {
        return tpm_id;
    }

    public void setTpm_id(Integer tpm_id) {
        this.tpm_id = tpm_id;
    }

    public String getTpm_clave() {
        return tpm_clave;
    }

    public void setTpm_clave(String tpm_clave) {
        this.tpm_clave = tpm_clave;
    }

    public String getTpm_descripcion() {
        return tpm_descripcion;
    }

    public void setTpm_descripcion(String tpm_descripcion) {
        this.tpm_descripcion = tpm_descripcion;
    }

}
