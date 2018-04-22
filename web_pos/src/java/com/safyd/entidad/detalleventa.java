package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class detalleventa extends ORM<detalleventa> {

    private Long dve_id;
    private Long ven_id;
    private Integer art_id;
    private Double dve_cantidad;
    private Double dve_precio;
    private Double dve_subtotal;
    private Double dve_total;
    private Double dve_impuesto;
    private Double dve_descuento;

    public detalleventa() {
        super.setClass(this);
    }

    public detalleventa(
            Long dve_id,
            Long ven_id,
            Integer art_id,
            Double dve_cantidad,
            Double dve_precio,
            Double dve_subtotal,
            Double dve_total,
            Double dve_impuesto,
            Double dve_descuento
    ) {
        super.setClass(this);
        this.dve_id = dve_id;
        this.ven_id = ven_id;
        this.art_id = art_id;
        this.dve_cantidad = dve_cantidad;
        this.dve_precio = dve_precio;
        this.dve_subtotal = dve_subtotal;
        this.dve_total = dve_total;
        this.dve_impuesto = dve_impuesto;
        this.dve_descuento = dve_descuento;

    }

    public Long getDve_id() {
        return dve_id;
    }

    public void setDve_id(Long dve_id) {
        this.dve_id = dve_id;
    }

    public Long getVen_id() {
        return ven_id;
    }

    public void setVen_id(Long ven_id) {
        this.ven_id = ven_id;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Double getDve_cantidad() {
        return dve_cantidad;
    }

    public void setDve_cantidad(Double dve_cantidad) {
        this.dve_cantidad = dve_cantidad;
    }

    public Double getDve_precio() {
        return dve_precio;
    }

    public void setDve_precio(Double dve_precio) {
        this.dve_precio = dve_precio;
    }

    public Double getDve_subtotal() {
        return dve_subtotal;
    }

    public void setDve_subtotal(Double dve_subtotal) {
        this.dve_subtotal = dve_subtotal;
    }

    public Double getDve_total() {
        return dve_total;
    }

    public void setDve_total(Double dve_total) {
        this.dve_total = dve_total;
    }

    public Double getDve_impuesto() {
        return dve_impuesto;
    }

    public void setDve_impuesto(Double dve_impuesto) {
        this.dve_impuesto = dve_impuesto;
    }

    public Double getDve_descuento() {
        return dve_descuento;
    }

    public void setDve_descuento(Double dve_descuento) {
        this.dve_descuento = dve_descuento;
    }

}
