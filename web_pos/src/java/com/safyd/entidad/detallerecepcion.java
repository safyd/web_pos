package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class detallerecepcion extends ORM<detallerecepcion> {

    private Long der_id;
    private Long rep_id;
    private Integer art_id;
    private Double der_cantidad;
    private Double der_costo;
    private Double der_subtotal;
    private Double der_total;
    private Double der_impuesto;

    public detallerecepcion() {
        super.setClass(this);
    }

    public detallerecepcion(
            Long der_id,
            Long rep_id,
            Integer art_id,
            Double der_cantidad,
            Double der_costo,
            Double der_subtotal,
            Double der_total,
            Double der_impuesto
    ) {
        super.setClass(this);
        this.der_id = der_id;
        this.rep_id = rep_id;
        this.art_id = art_id;
        this.der_cantidad = der_cantidad;
        this.der_costo = der_costo;
        this.der_subtotal = der_subtotal;
        this.der_total = der_total;
        this.der_impuesto = der_impuesto;

    }

    public Long getDer_id() {
        return der_id;
    }

    public void setDer_id(Long der_id) {
        this.der_id = der_id;
    }

    public Long getRep_id() {
        return rep_id;
    }

    public void setRep_id(Long rep_id) {
        this.rep_id = rep_id;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Double getDer_cantidad() {
        return der_cantidad;
    }

    public void setDer_cantidad(Double der_cantidad) {
        this.der_cantidad = der_cantidad;
    }

    public Double getDer_costo() {
        return der_costo;
    }

    public void setDer_costo(Double der_costo) {
        this.der_costo = der_costo;
    }

    public Double getDer_subtotal() {
        return der_subtotal;
    }

    public void setDer_subtotal(Double der_subtotal) {
        this.der_subtotal = der_subtotal;
    }

    public Double getDer_total() {
        return der_total;
    }

    public void setDer_total(Double der_total) {
        this.der_total = der_total;
    }

    public Double getDer_impuesto() {
        return der_impuesto;
    }

    public void setDer_impuesto(Double der_impuesto) {
        this.der_impuesto = der_impuesto;
    }
    
}
