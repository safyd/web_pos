package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class unidadmedida extends ORM<unidadmedida> {

    private Integer uni_id;
    private String uni_clave;
    private String uni_nombre;
    private String uni_descripcion;
    private String uni_nota;
    private String uni_fechainiciovigencia;
    private String uni_fechafinvigencia;
    private String uni_simbolo;

    public unidadmedida() {
        super.setClass(this);
    }

    public unidadmedida(
            Integer uni_id,
            String uni_clave,
            String uni_nombre,
            String uni_descripcion,
            String uni_nota,
            String uni_fechainiciovigencia,
            String uni_fechafinvigencia,
            String uni_simbolo
    ) {
        super.setClass(this);
        this.uni_id = uni_id;
        this.uni_clave = uni_clave;
        this.uni_nombre = uni_nombre;
        this.uni_descripcion = uni_descripcion;
        this.uni_nota = uni_nota;
        this.uni_fechainiciovigencia = uni_fechainiciovigencia;
        this.uni_fechafinvigencia = uni_fechafinvigencia;
        this.uni_simbolo = uni_simbolo;
    }

    public Integer getUni_id() {
        return uni_id;
    }

    public void setUni_id(Integer uni_id) {
        this.uni_id = uni_id;
    }

    public String getUni_clave() {
        return uni_clave;
    }

    public void setUni_clave(String uni_clave) {
        this.uni_clave = uni_clave;
    }

    public String getUni_nombre() {
        return uni_nombre;
    }

    public void setUni_nombre(String uni_nombre) {
        this.uni_nombre = uni_nombre;
    }

    public String getUni_descripcion() {
        return uni_descripcion;
    }

    public void setUni_descripcion(String uni_descripcion) {
        this.uni_descripcion = uni_descripcion;
    }

    public String getUni_nota() {
        return uni_nota;
    }

    public void setUni_nota(String uni_nota) {
        this.uni_nota = uni_nota;
    }

    public String getUni_fechainiciovigencia() {
        return uni_fechainiciovigencia;
    }

    public void setUni_fechainiciovigencia(String uni_fechainiciovigencia) {
        this.uni_fechainiciovigencia = uni_fechainiciovigencia;
    }

    public String getUni_fechafinvigencia() {
        return uni_fechafinvigencia;
    }

    public void setUni_fechafinvigencia(String uni_fechafinvigencia) {
        this.uni_fechafinvigencia = uni_fechafinvigencia;
    }

    public String getUni_simbolo() {
        return uni_simbolo;
    }

    public void setUni_simbolo(String uni_simbolo) {
        this.uni_simbolo = uni_simbolo;
    }

}
