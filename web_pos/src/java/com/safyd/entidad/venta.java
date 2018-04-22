package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class venta extends ORM<venta> {

    private Long ven_id;
    private Long cli_id;
    private Double ven_cantidad;
    private Double ven_subtotal;
    private Double ven_total;
    private Double ven_precio;
    private Double ven_descuento;
    private Double ven_impuesto;
    private Long ven_fac_id;
    private String ven_fac_uuid;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;

    public venta() {
        super.setClass(this);
    }

    public venta(
            Long ven_id,
            Long cli_id,
            Double ven_cantidad,
            Double ven_subtotal,
            Double ven_total,
            Double ven_precio,
            Double ven_descuento,
            Double ven_impuesto,
            Long ven_fac_id,
            String ven_fac_uuid,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usuarioModificacion
    ) {
        super.setClass(this);

        this.ven_id = ven_id;
        this.cli_id = cli_id;
        this.ven_cantidad = ven_cantidad;
        this.ven_subtotal = ven_subtotal;
        this.ven_total = ven_total;
        this.ven_precio = ven_precio;
        this.ven_descuento = ven_descuento;
        this.ven_impuesto = ven_impuesto;
        this.ven_fac_id = ven_fac_id;
        this.ven_fac_uuid = ven_fac_uuid;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;

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

    public Double getVen_cantidad() {
        return ven_cantidad;
    }

    public void setVen_cantidad(Double ven_cantidad) {
        this.ven_cantidad = ven_cantidad;
    }

    public Double getVen_subtotal() {
        return ven_subtotal;
    }

    public void setVen_subtotal(Double ven_subtotal) {
        this.ven_subtotal = ven_subtotal;
    }

    public Double getVen_total() {
        return ven_total;
    }

    public void setVen_total(Double ven_total) {
        this.ven_total = ven_total;
    }

    public Double getVen_precio() {
        return ven_precio;
    }

    public void setVen_precio(Double ven_precio) {
        this.ven_precio = ven_precio;
    }

    public Double getVen_descuento() {
        return ven_descuento;
    }

    public void setVen_descuento(Double ven_descuento) {
        this.ven_descuento = ven_descuento;
    }

    public Double getVen_impuesto() {
        return ven_impuesto;
    }

    public void setVen_impuesto(Double ven_impuesto) {
        this.ven_impuesto = ven_impuesto;
    }

    public Long getVen_fac_id() {
        return ven_fac_id;
    }

    public void setVen_fac_id(Long ven_fac_id) {
        this.ven_fac_id = ven_fac_id;
    }

    public String getVen_fac_uuid() {
        return ven_fac_uuid;
    }

    public void setVen_fac_uuid(String ven_fac_uuid) {
        this.ven_fac_uuid = ven_fac_uuid;
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
