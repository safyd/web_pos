package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class detalleorden extends ORM<detalleorden> {

    private Long deo_id;
    private Long ord_id;
    private Integer art_id;
    private Double deo_cantidad;
    private Double deo_costo;
    private Double deo_subtotal;
    private Double deo_total;
    private Double deo_impuesto;

    public detalleorden() {
        super.setClass(this);
    }

    public detalleorden(
            Long deo_id,
            Long ord_id,
            Integer art_id,
            Double deo_cantidad,
            Double deo_costo,
            Double deo_subtotal,
            Double deo_total,
            Double deo_impuesto
    ) {
        super.setClass(this);

        this.deo_id = deo_id;
        this.ord_id = ord_id;
        this.art_id = art_id;
        this.deo_cantidad = deo_cantidad;
        this.deo_costo = deo_costo;
        this.deo_subtotal = deo_subtotal;
        this.deo_total = deo_total;
        this.deo_impuesto = deo_impuesto;
    }

    public Long getDeo_id() {
        return deo_id;
    }

    public void setDeo_id(Long deo_id) {
        this.deo_id = deo_id;
    }

    public Long getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(Long ord_id) {
        this.ord_id = ord_id;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Double getDeo_cantidad() {
        return deo_cantidad;
    }

    public void setDeo_cantidad(Double deo_cantidad) {
        this.deo_cantidad = deo_cantidad;
    }

    public Double getDeo_costo() {
        return deo_costo;
    }

    public void setDeo_costo(Double deo_costo) {
        this.deo_costo = deo_costo;
    }

    public Double getDeo_subtotal() {
        return deo_subtotal;
    }

    public void setDeo_subtotal(Double deo_subtotal) {
        this.deo_subtotal = deo_subtotal;
    }

    public Double getDeo_total() {
        return deo_total;
    }

    public void setDeo_total(Double deo_total) {
        this.deo_total = deo_total;
    }

    public Double getDeo_impuesto() {
        return deo_impuesto;
    }

    public void setDeo_impuesto(Double deo_impuesto) {
        this.deo_impuesto = deo_impuesto;
    }

}
