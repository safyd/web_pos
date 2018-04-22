package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class vigencia extends ORM<vigencia> {

    private Integer vig_id;
    private Date vig_inicio;
    private Date vig_fin;

    public vigencia() {
        super.setClass(this);
    }

    public vigencia(
            Integer vig_id,
            Date vig_inicio,
            Date vig_fin
    ) {

        super.setClass(this);
        this.vig_id = vig_id;
        this.vig_inicio = vig_inicio;
        this.vig_fin = vig_fin;
    }

    public Integer getVig_id() {
        return vig_id;
    }

    public void setVig_id(Integer vig_id) {
        this.vig_id = vig_id;
    }

    public Date getVig_inicio() {
        return vig_inicio;
    }

    public void setVig_inicio(Date vig_inicio) {
        this.vig_inicio = vig_inicio;
    }

    public Date getVig_fin() {
        return vig_fin;
    }

    public void setVig_fin(Date vig_fin) {
        this.vig_fin = vig_fin;
    }

}
