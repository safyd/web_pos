package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class formapago extends ORM<formapago> {

    private Integer fdp_id;
    private String fdp_clave;
    private String fdp_descipcion;
    private String fdp_bancarizado;
    private String fdp_numerodeoperacion;
    private String fdp_rfcdelemisordelacuentaordenenate;
    private String fdp_cuentaordenente;
    private String fdp_patrondecuentaordenante;
    private String fdp_rfcdelemisordelacuentadebeneficiario;
    private String fdp_tipocadenadepago;
    private String fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero;
    private String fdp_fechafinvigencia;
    private String fdp_fechainiciovigencia;

    public formapago() {
        super.setClass(this);
    }

    public formapago(
            Integer fdp_id,
            String fdp_clave,
            String fdp_descipcion,
            String fdp_bancarizado,
            String fdp_numerodeoperacion,
            String fdp_rfcdelemisordelacuentaordenenate,
            String fdp_cuentaordenente,
            String fdp_patrondecuentaordenante,
            String fdp_rfcdelemisordelacuentadebeneficiario,
            String fdp_tipocadenadepago,
            String fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero,
            String fdp_fechafinvigencia,
            String fdp_fechainiciovigencia
    ) {
        super.setClass(this);
        this.fdp_id = fdp_id;
        this.fdp_clave = fdp_clave;
        this.fdp_descipcion = fdp_descipcion;
        this.fdp_bancarizado = fdp_bancarizado;
        this.fdp_numerodeoperacion = fdp_numerodeoperacion;
        this.fdp_rfcdelemisordelacuentaordenenate = fdp_rfcdelemisordelacuentaordenenate;
        this.fdp_cuentaordenente = fdp_cuentaordenente;
        this.fdp_patrondecuentaordenante = fdp_patrondecuentaordenante;
        this.fdp_rfcdelemisordelacuentadebeneficiario = fdp_rfcdelemisordelacuentadebeneficiario;
        this.fdp_tipocadenadepago = fdp_tipocadenadepago;
        this.fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero = fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero;
        this.fdp_fechafinvigencia = fdp_fechafinvigencia;
        this.fdp_fechainiciovigencia = fdp_fechainiciovigencia;

    }

    public Integer getFdp_id() {
        return fdp_id;
    }

    public void setFdp_id(Integer fdp_id) {
        this.fdp_id = fdp_id;
    }

    public String getFdp_clave() {
        return fdp_clave;
    }

    public void setFdp_clave(String fdp_clave) {
        this.fdp_clave = fdp_clave;
    }

    public String getFdp_descipcion() {
        return fdp_descipcion;
    }

    public void setFdp_descipcion(String fdp_descipcion) {
        this.fdp_descipcion = fdp_descipcion;
    }

    public String getFdp_bancarizado() {
        return fdp_bancarizado;
    }

    public void setFdp_bancarizado(String fdp_bancarizado) {
        this.fdp_bancarizado = fdp_bancarizado;
    }

    public String getFdp_numerodeoperacion() {
        return fdp_numerodeoperacion;
    }

    public void setFdp_numerodeoperacion(String fdp_numerodeoperacion) {
        this.fdp_numerodeoperacion = fdp_numerodeoperacion;
    }

    public String getFdp_rfcdelemisordelacuentaordenenate() {
        return fdp_rfcdelemisordelacuentaordenenate;
    }

    public void setFdp_rfcdelemisordelacuentaordenenate(String fdp_rfcdelemisordelacuentaordenenate) {
        this.fdp_rfcdelemisordelacuentaordenenate = fdp_rfcdelemisordelacuentaordenenate;
    }

    public String getFdp_cuentaordenente() {
        return fdp_cuentaordenente;
    }

    public void setFdp_cuentaordenente(String fdp_cuentaordenente) {
        this.fdp_cuentaordenente = fdp_cuentaordenente;
    }

    public String getFdp_patrondecuentaordenante() {
        return fdp_patrondecuentaordenante;
    }

    public void setFdp_patrondecuentaordenante(String fdp_patrondecuentaordenante) {
        this.fdp_patrondecuentaordenante = fdp_patrondecuentaordenante;
    }

    public String getFdp_rfcdelemisordelacuentadebeneficiario() {
        return fdp_rfcdelemisordelacuentadebeneficiario;
    }

    public void setFdp_rfcdelemisordelacuentadebeneficiario(String fdp_rfcdelemisordelacuentadebeneficiario) {
        this.fdp_rfcdelemisordelacuentadebeneficiario = fdp_rfcdelemisordelacuentadebeneficiario;
    }

    public String getFdp_tipocadenadepago() {
        return fdp_tipocadenadepago;
    }

    public void setFdp_tipocadenadepago(String fdp_tipocadenadepago) {
        this.fdp_tipocadenadepago = fdp_tipocadenadepago;
    }

    public String getFdp_nombrebancoemisordelacuentaordenanteencasodeextranjero() {
        return fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero;
    }

    public void setFdp_nombrebancoemisordelacuentaordenanteencasodeextranjero(String fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero) {
        this.fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero = fdp_nombrebancoemisordelacuentaordenanteencasodeextranjero;
    }

    public String getFdp_fechafinvigencia() {
        return fdp_fechafinvigencia;
    }

    public void setFdp_fechafinvigencia(String fdp_fechafinvigencia) {
        this.fdp_fechafinvigencia = fdp_fechafinvigencia;
    }

    public String getFdp_fechainiciovigencia() {
        return fdp_fechainiciovigencia;
    }

    public void setFdp_fechainiciovigencia(String fdp_fechainiciovigencia) {
        this.fdp_fechainiciovigencia = fdp_fechainiciovigencia;
    }
    
}

