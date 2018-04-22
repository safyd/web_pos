package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class inventario extends ORM<inventario> {

    private Long inv_id;
    private Integer suc_id;
    private Integer art_id;
    private Double art_existencia_nueva;
    private Double art_existencia_anterior;

    public inventario() {
        super.setClass(this);
    }

    public inventario(
            Long inv_id,
            Integer suc_id,
            Integer art_id,
            Double art_existencia_nueva,
            Double art_existencia_anterior
    ) {

        super.setClass(this);
        this.inv_id = inv_id;
        this.suc_id = suc_id;
        this.art_id = art_id;
        this.art_existencia_nueva = art_existencia_nueva;
        this.art_existencia_anterior = art_existencia_anterior;
    }

    public Long getInv_id() {
        return inv_id;
    }

    public void setInv_id(Long inv_id) {
        this.inv_id = inv_id;
    }

    public Integer getSuc_id() {
        return suc_id;
    }

    public void setSuc_id(Integer suc_id) {
        this.suc_id = suc_id;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Double getArt_existencia_nueva() {
        return art_existencia_nueva;
    }

    public void setArt_existencia_nueva(Double art_existencia_nueva) {
        this.art_existencia_nueva = art_existencia_nueva;
    }

    public Double getArt_existencia_anterior() {
        return art_existencia_anterior;
    }

    public void setArt_existencia_anterior(Double art_existencia_anterior) {
        this.art_existencia_anterior = art_existencia_anterior;
    }

}
