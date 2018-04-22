package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class compra extends ORM<compra> {

    private Long com_id;
    private Long ord_id;
    private Long pro_id;
    private Double com_cantidad;
    private Double com_subtotal;
    private Double com_total;
    private Double com_costo;
    private Double com_dscuento;
    private Double com_impuesto;
    private Long com_fac_id;
    private String com_fac_uudi;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;

    public compra() {
        super.setClass(this);
    }

    public compra(
            Long com_id,
            Long ord_id,
            Long pro_id,
            Double com_cantidad,
            Double com_subtotal,
            Double com_total,
            Double com_costo,
            Double com_dscuento,
            Double com_impuesto,
            Long com_fac_id,
            String com_fac_uudi,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usuarioModificacion
    ) {
        super.setClass(this);
        this.com_id = com_id;
        this.ord_id = ord_id;
        this.pro_id = pro_id;
        this.com_cantidad = com_cantidad;
        this.com_subtotal = com_subtotal;
        this.com_total = com_total;
        this.com_costo = com_costo;
        this.com_dscuento = com_dscuento;
        this.com_impuesto = com_impuesto;
        this.com_fac_id = com_fac_id;
        this.com_fac_uudi = com_fac_uudi;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;

    }

    public Long getCom_id() {
        return com_id;
    }

    public void setCom_id(Long com_id) {
        this.com_id = com_id;
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

    public Double getCom_cantidad() {
        return com_cantidad;
    }

    public void setCom_cantidad(Double com_cantidad) {
        this.com_cantidad = com_cantidad;
    }

    public Double getCom_subtotal() {
        return com_subtotal;
    }

    public void setCom_subtotal(Double com_subtotal) {
        this.com_subtotal = com_subtotal;
    }

    public Double getCom_total() {
        return com_total;
    }

    public void setCom_total(Double com_total) {
        this.com_total = com_total;
    }

    public Double getCom_costo() {
        return com_costo;
    }

    public void setCom_costo(Double com_costo) {
        this.com_costo = com_costo;
    }

    public Double getCom_dscuento() {
        return com_dscuento;
    }

    public void setCom_dscuento(Double com_dscuento) {
        this.com_dscuento = com_dscuento;
    }

    public Double getCom_impuesto() {
        return com_impuesto;
    }

    public void setCom_impuesto(Double com_impuesto) {
        this.com_impuesto = com_impuesto;
    }

    public Long getCom_fac_id() {
        return com_fac_id;
    }

    public void setCom_fac_id(Long com_fac_id) {
        this.com_fac_id = com_fac_id;
    }

    public String getCom_fac_uudi() {
        return com_fac_uudi;
    }

    public void setCom_fac_uudi(String com_fac_uudi) {
        this.com_fac_uudi = com_fac_uudi;
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
