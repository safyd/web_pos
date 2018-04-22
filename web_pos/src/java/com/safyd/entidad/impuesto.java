package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class impuesto extends ORM<impuesto> {

    private Integer imp_id;
    private String imp_clave;
    private String imp_descripcion;
    private String imp_retencion;
    private String imp_traslado;
    private String imp_loscalFederal;
    private String imp_entidadenlaqueaplica;

    public impuesto() {
        super.setClass(this);
    }

    public impuesto(
            Integer imp_id,
            String imp_clave,
            String imp_descripcion,
            String imp_retencion,
            String imp_traslado,
            String imp_loscalFederal,
            String imp_entidadenlaqueaplica
    ) {

        super.setClass(this);
        this.imp_id = imp_id;
        this.imp_clave = imp_clave;
        this.imp_descripcion = imp_descripcion;
        this.imp_retencion = imp_retencion;
        this.imp_traslado = imp_traslado;
        this.imp_loscalFederal = imp_loscalFederal;
        this.imp_entidadenlaqueaplica = imp_entidadenlaqueaplica;

    }

    public Integer getImp_id() {
        return imp_id;
    }

    public void setImp_id(Integer imp_id) {
        this.imp_id = imp_id;
    }

    public String getImp_clave() {
        return imp_clave;
    }

    public void setImp_clave(String imp_clave) {
        this.imp_clave = imp_clave;
    }

    public String getImp_descripcion() {
        return imp_descripcion;
    }

    public void setImp_descripcion(String imp_descripcion) {
        this.imp_descripcion = imp_descripcion;
    }

    public String getImp_retencion() {
        return imp_retencion;
    }

    public void setImp_retencion(String imp_retencion) {
        this.imp_retencion = imp_retencion;
    }

    public String getImp_traslado() {
        return imp_traslado;
    }

    public void setImp_traslado(String imp_traslado) {
        this.imp_traslado = imp_traslado;
    }

    public String getImp_loscalFederal() {
        return imp_loscalFederal;
    }

    public void setImp_loscalFederal(String imp_loscalFederal) {
        this.imp_loscalFederal = imp_loscalFederal;
    }

    public String getImp_entidadenlaqueaplica() {
        return imp_entidadenlaqueaplica;
    }

    public void setImp_entidadenlaqueaplica(String imp_entidadenlaqueaplica) {
        this.imp_entidadenlaqueaplica = imp_entidadenlaqueaplica;
    }
    
}

