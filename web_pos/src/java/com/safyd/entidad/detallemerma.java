
package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class detallemerma extends ORM<detallemerma>{
    
    private Long dme_id;
    private Integer art_id;
    private Integer tpm_id;
    private Long mer_id;
    private Double dme_cantidad;
    private Double dme_costo;
    private Double dme_precio;
    private Double dme_total_costo;
    private Double dme_total_precio;
    
    
    public detallemerma(){
      super.setClass(this);
    }
    
    
    public detallemerma(
      Long dme_id,
     Integer art_id,
     Integer tpm_id,
     Long mer_id,
     Double dme_cantidad,
     Double dme_costo,
     Double dme_precio,
     Double dme_total_costo,
     Double dme_total_precio
    
    
    
    
    ){
      super.setClass(this);
    this. dme_id=dme_id;
     this. art_id=art_id;
     this. tpm_id=tpm_id;
     this. mer_id=mer_id;
     this. dme_cantidad=dme_cantidad;
     this. dme_costo=dme_costo;
     this. dme_precio=dme_precio;
     this. dme_total_costo=dme_total_costo;
     this. dme_total_precio=dme_total_precio;
    
    
    
    }

    public Long getDme_id() {
        return dme_id;
    }

    public void setDme_id(Long dme_id) {
        this.dme_id = dme_id;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Integer getTpm_id() {
        return tpm_id;
    }

    public void setTpm_id(Integer tpm_id) {
        this.tpm_id = tpm_id;
    }

    public Long getMer_id() {
        return mer_id;
    }

    public void setMer_id(Long mer_id) {
        this.mer_id = mer_id;
    }

    public Double getDme_cantidad() {
        return dme_cantidad;
    }

    public void setDme_cantidad(Double dme_cantidad) {
        this.dme_cantidad = dme_cantidad;
    }

    public Double getDme_costo() {
        return dme_costo;
    }

    public void setDme_costo(Double dme_costo) {
        this.dme_costo = dme_costo;
    }

    public Double getDme_precio() {
        return dme_precio;
    }

    public void setDme_precio(Double dme_precio) {
        this.dme_precio = dme_precio;
    }

    public Double getDme_total_costo() {
        return dme_total_costo;
    }

    public void setDme_total_costo(Double dme_total_costo) {
        this.dme_total_costo = dme_total_costo;
    }

    public Double getDme_total_precio() {
        return dme_total_precio;
    }

    public void setDme_total_precio(Double dme_total_precio) {
        this.dme_total_precio = dme_total_precio;
    }
    
}
