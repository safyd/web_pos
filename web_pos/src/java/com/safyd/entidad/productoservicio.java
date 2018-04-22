package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.security.PublicKey;

public class productoservicio extends ORM<productoservicio> {

    private Integer prs_id;
    private String prs_clave;
    private String prs_descripcion;
    private String prs_incluirivatraslado;
    private String prs_incluiriepstraslado;
    private String prs_incluircomplementoquedebeincluir;
    private String prs_fechainiciovigencia;
    private String prs_fechafinvigencia;
    private String prs_palabrassimilares;

    public productoservicio() {
        super.setClass(this);
    }

    public productoservicio(
            Integer prs_id,
            String prs_clave,
            String prs_descripcion,
            String prs_incluirivatraslado,
            String prs_incluiriepstraslado,
            String prs_incluircomplementoquedebeincluir,
            String prs_fechainiciovigencia,
            String prs_fechafinvigencia,
            String prs_palabrassimilares
    ) {
        super.setClass(this);

        this.prs_id = prs_id;
        this.prs_clave = prs_clave;
        this.prs_descripcion = prs_descripcion;
        this.prs_incluirivatraslado = prs_incluirivatraslado;
        this.prs_incluiriepstraslado = prs_incluiriepstraslado;
        this.prs_incluircomplementoquedebeincluir = prs_incluircomplementoquedebeincluir;
        this.prs_fechainiciovigencia = prs_fechainiciovigencia;
        this.prs_fechafinvigencia = prs_fechafinvigencia;
        this.prs_palabrassimilares = prs_palabrassimilares;

    }

    public Integer getPrs_id() {
        return prs_id;
    }

    public void setPrs_id(Integer prs_id) {
        this.prs_id = prs_id;
    }

    public String getPrs_clave() {
        return prs_clave;
    }

    public void setPrs_clave(String prs_clave) {
        this.prs_clave = prs_clave;
    }

    public String getPrs_descripcion() {
        return prs_descripcion;
    }

    public void setPrs_descripcion(String prs_descripcion) {
        this.prs_descripcion = prs_descripcion;
    }

    public String getPrs_incluirivatraslado() {
        return prs_incluirivatraslado;
    }

    public void setPrs_incluirivatraslado(String prs_incluirivatraslado) {
        this.prs_incluirivatraslado = prs_incluirivatraslado;
    }

    public String getPrs_incluiriepstraslado() {
        return prs_incluiriepstraslado;
    }

    public void setPrs_incluiriepstraslado(String prs_incluiriepstraslado) {
        this.prs_incluiriepstraslado = prs_incluiriepstraslado;
    }

    public String getPrs_incluircomplementoquedebeincluir() {
        return prs_incluircomplementoquedebeincluir;
    }

    public void setPrs_incluircomplementoquedebeincluir(String prs_incluircomplementoquedebeincluir) {
        this.prs_incluircomplementoquedebeincluir = prs_incluircomplementoquedebeincluir;
    }

    public String getPrs_fechainiciovigencia() {
        return prs_fechainiciovigencia;
    }

    public void setPrs_fechainiciovigencia(String prs_fechainiciovigencia) {
        this.prs_fechainiciovigencia = prs_fechainiciovigencia;
    }

    public String getPrs_fechafinvigencia() {
        return prs_fechafinvigencia;
    }

    public void setPrs_fechafinvigencia(String prs_fechafinvigencia) {
        this.prs_fechafinvigencia = prs_fechafinvigencia;
    }

    public String getPrs_palabrassimilares() {
        return prs_palabrassimilares;
    }

    public void setPrs_palabrassimilares(String prs_palabrassimilares) {
        this.prs_palabrassimilares = prs_palabrassimilares;
    }

}
