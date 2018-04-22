package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class codigo extends ORM<codigo> {

    private Integer cod_id;
    private String cod_codigo;
    private Integer mom_id;

    public codigo() {
        super.setClass(this);
    }

    public codigo(
            Integer cod_id,
            String cod_codigo,
            Integer mom_id
    ) {
        super.setClass(this);
        this.cod_id = cod_id;
        this.cod_codigo = cod_codigo;
        this.mom_id = mom_id;

    }

    public Integer getCod_id() {
        return cod_id;
    }

    public void setCod_id(Integer cod_id) {
        this.cod_id = cod_id;
    }

    public String getCod_codigo() {
        return cod_codigo;
    }

    public void setCod_codigo(String cod_codigo) {
        this.cod_codigo = cod_codigo;
    }

    public Integer getMom_id() {
        return mom_id;
    }

    public void setMom_id(Integer mom_id) {
        this.mom_id = mom_id;
    }

}
