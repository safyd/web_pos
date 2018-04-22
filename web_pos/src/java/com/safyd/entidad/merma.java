package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class merma extends ORM<merma> {

    private Long mer_id;
    private Double mer_costo;
    private Double mer_precio;
    private Double mer_cantidad;
    private Double mer_subtotal;
    private Double mer_total;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;

    public merma() {
        super.setClass(this);
    }

    public merma(
            Long mer_id,
            Double mer_costo,
            Double mer_precio,
            Double mer_cantidad,
            Double mer_subtotal,
            Double mer_total,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usuarioModificacion
    ) {
        super.setClass(this);
        this.mer_id = mer_id;
        this.mer_costo = mer_costo;
        this.mer_precio = mer_precio;
        this.mer_cantidad = mer_cantidad;
        this.mer_subtotal = mer_subtotal;
        this.mer_total = mer_total;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    public Long getMer_id() {
        return mer_id;
    }

    public void setMer_id(Long mer_id) {
        this.mer_id = mer_id;
    }

    public Double getMer_costo() {
        return mer_costo;
    }

    public void setMer_costo(Double mer_costo) {
        this.mer_costo = mer_costo;
    }

    public Double getMer_precio() {
        return mer_precio;
    }

    public void setMer_precio(Double mer_precio) {
        this.mer_precio = mer_precio;
    }

    public Double getMer_cantidad() {
        return mer_cantidad;
    }

    public void setMer_cantidad(Double mer_cantidad) {
        this.mer_cantidad = mer_cantidad;
    }

    public Double getMer_subtotal() {
        return mer_subtotal;
    }

    public void setMer_subtotal(Double mer_subtotal) {
        this.mer_subtotal = mer_subtotal;
    }

    public Double getMer_total() {
        return mer_total;
    }

    public void setMer_total(Double mer_total) {
        this.mer_total = mer_total;
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
