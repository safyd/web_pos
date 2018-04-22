
package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;


public class devolucioncompra extends ORM<devolucioncompra>{
 
    private Long dec_id;
    private Long com_id;
    private Double dec_cantidad;
    private Double dec_subtotal;
    private Double dec_total;
    private Double dec_descuento;
    private Double dec_impuesto;
    private Long dec_fac_id;
    private String dev_fac_uuid;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;
    
    
    public devolucioncompra(){
    super.setClass(this);
    }
    
    public devolucioncompra(
    
         Long dec_id,
     Long com_id,
     Double dec_cantidad,
     Double dec_subtotal,
     Double dec_total,
     Double dec_descuento,
     Double dec_impuesto,
     Long dec_fac_id,
     String dev_fac_uuid,
     Date fechaCreacion,
     Date fechaModificacion,
     String usuarioCreacion,
     String usuarioModificacion
            
    ){
    super.setClass(this);
     this. dec_id=dec_id;
     this. com_id=com_id;
     this. dec_cantidad=dec_cantidad;
     this. dec_subtotal=dec_subtotal;
     this. dec_total=dec_total;
     this. dec_descuento=dec_descuento;
     this. dec_impuesto=dec_impuesto;
     this. dec_impuesto=dec_impuesto;
     this. dev_fac_uuid=dev_fac_uuid;
     this. fechaCreacion=fechaCreacion;
     this. fechaModificacion=fechaModificacion;
     this. usuarioCreacion=usuarioCreacion;
     this. usuarioModificacion=usuarioModificacion;
    
    
    
    }

    public Long getDec_id() {
        return dec_id;
    }

    public void setDec_id(Long dec_id) {
        this.dec_id = dec_id;
    }

    public Long getCom_id() {
        return com_id;
    }

    public void setCom_id(Long com_id) {
        this.com_id = com_id;
    }

    public Double getDec_cantidad() {
        return dec_cantidad;
    }

    public void setDec_cantidad(Double dec_cantidad) {
        this.dec_cantidad = dec_cantidad;
    }

    public Double getDec_subtotal() {
        return dec_subtotal;
    }

    public void setDec_subtotal(Double dec_subtotal) {
        this.dec_subtotal = dec_subtotal;
    }

    public Double getDec_total() {
        return dec_total;
    }

    public void setDec_total(Double dec_total) {
        this.dec_total = dec_total;
    }

    public Double getDec_descuento() {
        return dec_descuento;
    }

    public void setDec_descuento(Double dec_descuento) {
        this.dec_descuento = dec_descuento;
    }

    public Double getDec_impuesto() {
        return dec_impuesto;
    }

    public void setDec_impuesto(Double dec_impuesto) {
        this.dec_impuesto = dec_impuesto;
    }

    public Long getDec_fac_id() {
        return dec_fac_id;
    }

    public void setDec_fac_id(Long dec_fac_id) {
        this.dec_fac_id = dec_fac_id;
    }

    public String getDev_fac_uuid() {
        return dev_fac_uuid;
    }

    public void setDev_fac_uuid(String dev_fac_uuid) {
        this.dev_fac_uuid = dev_fac_uuid;
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
