package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class devolucionventa extends ORM<devolucionventa> {

    private Long dev_id;
    private Long ven_id;
    private Long cli_id;
    private Double dev_cantidad;
    private Double dev_subtotal;
    private Double dev_total;
    private Double dev_descuento;
    private Double dev_impuesto;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public devolucionventa() {
        super.setClass(this);
    }

    public devolucionventa(
            Long dev_id,
            Long ven_id,
            Long cli_id,
            Double dev_cantidad,
            Double dev_subtotal,
            Double dev_total,
            Double dev_descuento,
            Date fechaCreacion,
            Date fechaModificacion
    ) {

        super.setClass(this);
        this.dev_id = dev_id;
        this.ven_id = ven_id;
        this.cli_id = cli_id;
        this.dev_cantidad = dev_cantidad;
        this.dev_subtotal = dev_subtotal;
        this.dev_total = dev_total;
        this.dev_descuento = dev_descuento;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;

    }

    public Long getDev_id() {
        return dev_id;
    }

    public void setDev_id(Long dev_id) {
        this.dev_id = dev_id;
    }

    public Long getVen_id() {
        return ven_id;
    }

    public void setVen_id(Long ven_id) {
        this.ven_id = ven_id;
    }

    public Long getCli_id() {
        return cli_id;
    }

    public void setCli_id(Long cli_id) {
        this.cli_id = cli_id;
    }

    public Double getDev_cantidad() {
        return dev_cantidad;
    }

    public void setDev_cantidad(Double dev_cantidad) {
        this.dev_cantidad = dev_cantidad;
    }

    public Double getDev_subtotal() {
        return dev_subtotal;
    }

    public void setDev_subtotal(Double dev_subtotal) {
        this.dev_subtotal = dev_subtotal;
    }

    public Double getDev_total() {
        return dev_total;
    }

    public void setDev_total(Double dev_total) {
        this.dev_total = dev_total;
    }

    public Double getDev_descuento() {
        return dev_descuento;
    }

    public void setDev_descuento(Double dev_descuento) {
        this.dev_descuento = dev_descuento;
    }

    public Double getDev_impuesto() {
        return dev_impuesto;
    }

    public void setDev_impuesto(Double dev_impuesto) {
        this.dev_impuesto = dev_impuesto;
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

}
