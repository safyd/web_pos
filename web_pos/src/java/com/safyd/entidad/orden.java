package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class orden extends ORM<orden> {

    private Long ord_id;
    private Long pro_id;
    private Integer ord_estado;
    private Double ord_cantidad;
    private Double ord_subtotal;
    private Double ord_total;
    private Double ord_costo;
    private Double ord_descuento;
    private Double ord_impuesto;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificaion;

    public orden() {
        super.setClass(this);
    }

    public orden(
            Long ord_id,
            Long pro_id,
            Integer ord_estado,
            Double ord_cantidad,
            Double ord_subtotal,
            Double ord_total,
            Double ord_costo,
            Double ord_descuento,
            Double ord_impuesto,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usuarioModificaion
    ) {

        super.setClass(this);

        this.ord_id = ord_id;
        this.pro_id = pro_id;
        this.ord_estado = ord_estado;
        this.ord_cantidad = ord_cantidad;
        this.ord_subtotal = ord_subtotal;
        this.ord_total = ord_total;
        this.ord_costo = ord_costo;
        this.ord_descuento = ord_descuento;
        this.ord_impuesto = ord_impuesto;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificaion = usuarioModificaion;
    }

    public Long getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(Long ord_id) {
        this.ord_id = ord_id;
    }

    public Long getPro_id() {
        return pro_id;
    }

    public void setPro_id(Long pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getOrd_estado() {
        return ord_estado;
    }

    public void setOrd_estado(Integer ord_estado) {
        this.ord_estado = ord_estado;
    }

    public Double getOrd_cantidad() {
        return ord_cantidad;
    }

    public void setOrd_cantidad(Double ord_cantidad) {
        this.ord_cantidad = ord_cantidad;
    }

    public Double getOrd_subtotal() {
        return ord_subtotal;
    }

    public void setOrd_subtotal(Double ord_subtotal) {
        this.ord_subtotal = ord_subtotal;
    }

    public Double getOrd_total() {
        return ord_total;
    }

    public void setOrd_total(Double ord_total) {
        this.ord_total = ord_total;
    }

    public Double getOrd_costo() {
        return ord_costo;
    }

    public void setOrd_costo(Double ord_costo) {
        this.ord_costo = ord_costo;
    }

    public Double getOrd_descuento() {
        return ord_descuento;
    }

    public void setOrd_descuento(Double ord_descuento) {
        this.ord_descuento = ord_descuento;
    }

    public Double getOrd_impuesto() {
        return ord_impuesto;
    }

    public void setOrd_impuesto(Double ord_impuesto) {
        this.ord_impuesto = ord_impuesto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificaion() {
        return usuarioModificaion;
    }

    public void setUsuarioModificaion(String usuarioModificaion) {
        this.usuarioModificaion = usuarioModificaion;
    }
    
}
