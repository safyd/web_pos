package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class recepcion extends ORM<recepcion> {

    private Long rep_id;
    private Long pro_id;
    private Integer rep_estado;
    private Double rep_cantidad;
    private Double rep_subtotal;
    private Double rep_total;
    private Double rep_costo;
    private Double rep_descuento;
    private Double rep_impuesto;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;

    public recepcion() {
        super.setClass(this);
    }

    public recepcion(
            Long rep_id,
            Long pro_id,
            Integer rep_estado,
            Double rep_cantidad,
            Double rep_subtotal,
            Double rep_total,
            Double rep_costo,
            Double rep_descuento,
            Double rep_impuesto,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usuarioModificacion
    ) {

        super.setClass(this);
        this.rep_id = rep_id;
        this.pro_id = pro_id;
        this.rep_estado = rep_estado;
        this.rep_cantidad = rep_cantidad;
        this.rep_subtotal = rep_subtotal;
        this.rep_total = rep_total;
        this.rep_costo = rep_costo;
        this.rep_descuento = rep_descuento;
        this.rep_impuesto = rep_impuesto;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    public Long getRep_id() {
        return rep_id;
    }

    public void setRep_id(Long rep_id) {
        this.rep_id = rep_id;
    }

    public Long getPro_id() {
        return pro_id;
    }

    public void setPro_id(Long pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getRep_estado() {
        return rep_estado;
    }

    public void setRep_estado(Integer rep_estado) {
        this.rep_estado = rep_estado;
    }

    public Double getRep_cantidad() {
        return rep_cantidad;
    }

    public void setRep_cantidad(Double rep_cantidad) {
        this.rep_cantidad = rep_cantidad;
    }

    public Double getRep_subtotal() {
        return rep_subtotal;
    }

    public void setRep_subtotal(Double rep_subtotal) {
        this.rep_subtotal = rep_subtotal;
    }

    public Double getRep_total() {
        return rep_total;
    }

    public void setRep_total(Double rep_total) {
        this.rep_total = rep_total;
    }

    public Double getRep_costo() {
        return rep_costo;
    }

    public void setRep_costo(Double rep_costo) {
        this.rep_costo = rep_costo;
    }

    public Double getRep_descuento() {
        return rep_descuento;
    }

    public void setRep_descuento(Double rep_descuento) {
        this.rep_descuento = rep_descuento;
    }

    public Double getRep_impuesto() {
        return rep_impuesto;
    }

    public void setRep_impuesto(Double rep_impuesto) {
        this.rep_impuesto = rep_impuesto;
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

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

}
