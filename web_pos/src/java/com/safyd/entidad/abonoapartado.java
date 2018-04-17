package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class abonoapartado extends ORM<abonoapartado> {

    private Long aba_id;
    private Double aba_importe_anterior;
    private Double aba_importe_nuevo;
    private Integer ab_estado;
    private Long apa_id;
    
    public abonoapartado(){
    super.setClass(this);
    }
    
    public abonoapartado(
     Long aba_id,
     Double aba_importe_anterior,
     Double aba_importe_nuevo,
     Integer ab_estado,
     Long apa_id
    
    ){
     super.setClass(this);
      
     this. aba_id=aba_id;
     this. aba_importe_anterior=aba_importe_anterior;
     this. aba_importe_nuevo=aba_importe_nuevo;
     this. ab_estado=ab_estado;
     this. apa_id=apa_id;
     
    }

    public Long getAba_id() {
        return aba_id;
    }

    public void setAba_id(Long aba_id) {
        this.aba_id = aba_id;
    }

    public Double getAba_importe_anterior() {
        return aba_importe_anterior;
    }

    public void setAba_importe_anterior(Double aba_importe_anterior) {
        this.aba_importe_anterior = aba_importe_anterior;
    }

    public Double getAba_importe_nuevo() {
        return aba_importe_nuevo;
    }

    public void setAba_importe_nuevo(Double aba_importe_nuevo) {
        this.aba_importe_nuevo = aba_importe_nuevo;
    }

    public Integer getAb_estado() {
        return ab_estado;
    }

    public void setAb_estado(Integer ab_estado) {
        this.ab_estado = ab_estado;
    }

    public Long getApa_id() {
        return apa_id;
    }

    public void setApa_id(Long apa_id) {
        this.apa_id = apa_id;
    }
    
}
