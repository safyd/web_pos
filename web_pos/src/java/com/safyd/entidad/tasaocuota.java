package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class tasaocuota extends ORM<tasaocuota> {

    private Integer tsc_id;
    private String tsc_rango;
    private String tsc_valor_minimo;
    private String tsc_valor_maximo;
    private String tsc_impuesto;
    private String tsc_factor;
    private String tsc_traslado;
    private String tsc_retencion;
    private String tsc_fechainiciovigencia;
    private String tsc_fechafinvigencia;

    public tasaocuota() {
        super.setClass(this);
    }

    public tasaocuota(
            Integer tsc_id,
            String tsc_rango,
            String tsc_valor_minimo,
            String tsc_valor_maximo,
            String tsc_impuesto,
            String tsc_factor,
            String tsc_traslado,
            String tsc_retencion,
            String tsc_fechainiciovigencia,
            String tsc_fechafinvigencia
    ) {

        super.setClass(this);
        this.tsc_id = tsc_id;
        this.tsc_rango = tsc_rango;
        this.tsc_valor_minimo = tsc_valor_minimo;
        this.tsc_valor_maximo = tsc_valor_maximo;
        this.tsc_impuesto = tsc_impuesto;
        this.tsc_factor = tsc_factor;
        this.tsc_traslado = tsc_traslado;
        this.tsc_retencion = tsc_retencion;
        this.tsc_fechainiciovigencia = tsc_fechainiciovigencia;
        this.tsc_fechafinvigencia = tsc_fechafinvigencia;

    }

    public Integer getTsc_id() {
        return tsc_id;
    }

    public void setTsc_id(Integer tsc_id) {
        this.tsc_id = tsc_id;
    }

    public String getTsc_rango() {
        return tsc_rango;
    }

    public void setTsc_rango(String tsc_rango) {
        this.tsc_rango = tsc_rango;
    }

    public String getTsc_valor_minimo() {
        return tsc_valor_minimo;
    }

    public void setTsc_valor_minimo(String tsc_valor_minimo) {
        this.tsc_valor_minimo = tsc_valor_minimo;
    }

    public String getTsc_valor_maximo() {
        return tsc_valor_maximo;
    }

    public void setTsc_valor_maximo(String tsc_valor_maximo) {
        this.tsc_valor_maximo = tsc_valor_maximo;
    }

    public String getTsc_impuesto() {
        return tsc_impuesto;
    }

    public void setTsc_impuesto(String tsc_impuesto) {
        this.tsc_impuesto = tsc_impuesto;
    }

    public String getTsc_factor() {
        return tsc_factor;
    }

    public void setTsc_factor(String tsc_factor) {
        this.tsc_factor = tsc_factor;
    }

    public String getTsc_traslado() {
        return tsc_traslado;
    }

    public void setTsc_traslado(String tsc_traslado) {
        this.tsc_traslado = tsc_traslado;
    }

    public String getTsc_retencion() {
        return tsc_retencion;
    }

    public void setTsc_retencion(String tsc_retencion) {
        this.tsc_retencion = tsc_retencion;
    }

    public String getTsc_fechainiciovigencia() {
        return tsc_fechainiciovigencia;
    }

    public void setTsc_fechainiciovigencia(String tsc_fechainiciovigencia) {
        this.tsc_fechainiciovigencia = tsc_fechainiciovigencia;
    }

    public String getTsc_fechafinvigencia() {
        return tsc_fechafinvigencia;
    }

    public void setTsc_fechafinvigencia(String tsc_fechafinvigencia) {
        this.tsc_fechafinvigencia = tsc_fechafinvigencia;
    }

}
