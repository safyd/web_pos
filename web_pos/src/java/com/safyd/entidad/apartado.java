
package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;


public class apartado extends ORM<apartado>{
    private Long apa_id;
    private Integer tia_id;
    private Double apa_cntidad;
    private Double apa_subtotal;
    private Double apa_total;
    private Double apa_precio;
    private  Double apa_descuento;
    private  String apa_impuesto;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private  String usuarioModificacion;
    
    public apartado(){   
    super.setClass(this);
  }
    
    public apartado(
    
    Long apa_id,
     Integer tia_id,
     Double apa_cntidad,
     Double apa_subtotal,
     Double apa_total,
     Double apa_precio,
      Double apa_descuento,
      String apa_impuesto,
     Date fechaCreacion,
     Date fechaModificacion,
     String usuarioCreacion,
      String usuarioModificacion
    
    
    ){
    super.setClass(this);
    this. apa_id=apa_id;
     this. tia_id=tia_id;
     this. apa_cntidad=apa_cntidad;
     this. apa_subtotal=apa_subtotal;
     this. apa_total=apa_total;
     this. apa_precio=apa_precio;
      this. apa_descuento=apa_descuento;
      this. apa_impuesto=apa_impuesto;
     this. fechaCreacion=fechaCreacion;
     this. fechaModificacion=fechaModificacion;
     this. usuarioCreacion=usuarioCreacion;
      this. usuarioModificacion=usuarioModificacion;
    
    
    }

    public Long getApa_id() {
        return apa_id;
    }

    public void setApa_id(Long apa_id) {
        this.apa_id = apa_id;
    }

    public Integer getTia_id() {
        return tia_id;
    }

    public void setTia_id(Integer tia_id) {
        this.tia_id = tia_id;
    }

    public Double getApa_cntidad() {
        return apa_cntidad;
    }

    public void setApa_cntidad(Double apa_cntidad) {
        this.apa_cntidad = apa_cntidad;
    }

    public Double getApa_subtotal() {
        return apa_subtotal;
    }

    public void setApa_subtotal(Double apa_subtotal) {
        this.apa_subtotal = apa_subtotal;
    }

    public Double getApa_total() {
        return apa_total;
    }

    public void setApa_total(Double apa_total) {
        this.apa_total = apa_total;
    }

    public Double getApa_precio() {
        return apa_precio;
    }

    public void setApa_precio(Double apa_precio) {
        this.apa_precio = apa_precio;
    }

    public Double getApa_descuento() {
        return apa_descuento;
    }

    public void setApa_descuento(Double apa_descuento) {
        this.apa_descuento = apa_descuento;
    }

    public String getApa_impuesto() {
        return apa_impuesto;
    }

    public void setApa_impuesto(String apa_impuesto) {
        this.apa_impuesto = apa_impuesto;
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
