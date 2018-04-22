package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class devolucionapartado extends ORM<devolucionapartado> {

    private Long dda_id;
    private Long cli_id;
    private Long apa_id;
    private Double dda_cantidad;
    private Double dda_subtotal;
    private Double dda_total;
    private Double dda_descuento;
    private Double dda_impuesto;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usauarioModificacion;

    public devolucionapartado() {
        super.setClass(this);
    }

    public devolucionapartado(
            Long dda_id,
            Long cli_id,
            Long apa_id,
            Double dda_cantidad,
            Double dda_subtotal,
            Double dda_total,
            Double dda_descuento,
            Double dda_impuesto,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usauarioModificacion
    ) {
        super.setClass(this);
        this.dda_id = dda_id;
        this.cli_id = cli_id;
        this.apa_id = apa_id;
        this.dda_cantidad = dda_cantidad;
        this.dda_subtotal = dda_subtotal;
        this.dda_total = dda_total;
        this.dda_descuento = dda_descuento;
        this.dda_impuesto = dda_impuesto;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usauarioModificacion = usauarioModificacion;

    }

    public Long getDda_id() {
        return dda_id;
    }

    public void setDda_id(Long dda_id) {
        this.dda_id = dda_id;
    }

    public Long getCli_id() {
        return cli_id;
    }

    public void setCli_id(Long cli_id) {
        this.cli_id = cli_id;
    }

    public Long getApa_id() {
        return apa_id;
    }

    public void setApa_id(Long apa_id) {
        this.apa_id = apa_id;
    }

    public Double getDda_cantidad() {
        return dda_cantidad;
    }

    public void setDda_cantidad(Double dda_cantidad) {
        this.dda_cantidad = dda_cantidad;
    }

    public Double getDda_subtotal() {
        return dda_subtotal;
    }

    public void setDda_subtotal(Double dda_subtotal) {
        this.dda_subtotal = dda_subtotal;
    }

    public Double getDda_total() {
        return dda_total;
    }

    public void setDda_total(Double dda_total) {
        this.dda_total = dda_total;
    }

    public Double getDda_descuento() {
        return dda_descuento;
    }

    public void setDda_descuento(Double dda_descuento) {
        this.dda_descuento = dda_descuento;
    }

    public Double getDda_impuesto() {
        return dda_impuesto;
    }

    public void setDda_impuesto(Double dda_impuesto) {
        this.dda_impuesto = dda_impuesto;
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

    public String getUsauarioModificacion() {
        return usauarioModificacion;
    }

    public void setUsauarioModificacion(String usauarioModificacion) {
        this.usauarioModificacion = usauarioModificacion;
    }

}
