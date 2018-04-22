package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class transferencia extends ORM<transferencia> {

    private Long tra_id;
    private Integer art_id;
    private Integer suc_id;
    private Double tra_cantidad;

    public transferencia() {
        super.setClass(this);
    }

    public transferencia(
            Long tra_id,
            Integer art_id,
            Integer suc_id,
            Double tra_cantidad
    ) {

        super.setClass(this);
        this.tra_id = tra_id;
        this.art_id = art_id;
        this.suc_id = suc_id;
        this.tra_cantidad = tra_cantidad;
    }

    public Long getTra_id() {
        return tra_id;
    }

    public void setTra_id(Long tra_id) {
        this.tra_id = tra_id;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Integer getSuc_id() {
        return suc_id;
    }

    public void setSuc_id(Integer suc_id) {
        this.suc_id = suc_id;
    }

    public Double getTra_cantidad() {
        return tra_cantidad;
    }

    public void setTra_cantidad(Double tra_cantidad) {
        this.tra_cantidad = tra_cantidad;
    }

}
