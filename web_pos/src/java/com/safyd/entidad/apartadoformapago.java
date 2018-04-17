package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class apartadoformapago extends ORM<apartadoformapago> {

    private Long par_id;
    private Integer fdp_id;
    private Long apa_id;

    public apartadoformapago() {
        super.setClass(this);
    }

    public apartadoformapago(
            Long par_id,
            Integer fdp_id,
            Long apa_id
    ) {
        this. par_id=par_id;
        this. fdp_id=fdp_id;
        this. apa_id=apa_id;

    }

    public Long getPar_id() {
        return par_id;
    }

    public void setPar_id(Long par_id) {
        this.par_id = par_id;
    }

    public Integer getFdp_id() {
        return fdp_id;
    }

    public void setFdp_id(Integer fdp_id) {
        this.fdp_id = fdp_id;
    }

    public Long getApa_id() {
        return apa_id;
    }

    public void setApa_id(Long apa_id) {
        this.apa_id = apa_id;
    }

}
