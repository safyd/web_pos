
package com.safyd.entidad;

import Safyd.System.DataBase.ORM;


public class detallecompra extends ORM<detallecompra>{
    
    private Long dco_id;
    private  Integer art_id;
    private Long com_id;
    private Double dco_cantidad;
    private  Double dco_costo;
    private  Double dco_subtotal;
    private Double dco_total;
    private  Double dco_impuesto;
    private Double dco_descuento;
    
    
    
    public detallecompra(){
        super.setClass(this);
    }
    
    public detallecompra(
    
    
     Long dco_id,
      Integer art_id,
     Long com_id,
     Double dco_cantidad,
      Double dco_costo,
      Double dco_subtotal,
     Double dco_total,
      Double dco_impuesto,
     Double dco_descuento
    
    ){
         super.setClass(this);
    
        this. dco_id=dco_id;
        this. art_id=art_id;
       this. com_id=com_id;
       this. dco_cantidad=dco_cantidad;
        this. dco_costo=dco_costo;
        this. dco_subtotal=dco_subtotal;
       this. dco_total=dco_total;
        this. dco_impuesto=dco_impuesto;
       this. dco_descuento=dco_descuento;
    }

    public Long getDco_id() {
        return dco_id;
    }

    public void setDco_id(Long dco_id) {
        this.dco_id = dco_id;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Long getCom_id() {
        return com_id;
    }

    public void setCom_id(Long com_id) {
        this.com_id = com_id;
    }

    public Double getDco_cantidad() {
        return dco_cantidad;
    }

    public void setDco_cantidad(Double dco_cantidad) {
        this.dco_cantidad = dco_cantidad;
    }

    public Double getDco_costo() {
        return dco_costo;
    }

    public void setDco_costo(Double dco_costo) {
        this.dco_costo = dco_costo;
    }

    public Double getDco_subtotal() {
        return dco_subtotal;
    }

    public void setDco_subtotal(Double dco_subtotal) {
        this.dco_subtotal = dco_subtotal;
    }

    public Double getDco_total() {
        return dco_total;
    }

    public void setDco_total(Double dco_total) {
        this.dco_total = dco_total;
    }

    public Double getDco_impuesto() {
        return dco_impuesto;
    }

    public void setDco_impuesto(Double dco_impuesto) {
        this.dco_impuesto = dco_impuesto;
    }

    public Double getDco_descuento() {
        return dco_descuento;
    }

    public void setDco_descuento(Double dco_descuento) {
        this.dco_descuento = dco_descuento;
    }
    
    
    
}
