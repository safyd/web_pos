package com.safyd.entidad;

import Safyd.System.DataBase.ORM;

public class cliente extends ORM<cliente> {

    private Long cli_id;
    private Integer suc_id;
    private String cli_clave;
    private String cli_nombre;
    private String cli_apellido;
    private String cli_sexo;
    private String cli_correo;
    private String cli_telefono;
    private String cli_celular;
    private String cli_cp;
    private String cli_direccion;
    private String cli_calle1;
    private String cli_calle2;
    private String cli_referencia_local;

    public cliente() {
        super.setClass(this);
    }

    public cliente(
            Long cli_id,
            Integer suc_id,
            String cli_clave,
            String cli_nombre,
            String cli_apellido,
            String cli_sexo,
            String cli_correo,
            String cli_telefono,
            String cli_celular,
            String cli_cp,
            String cli_direccion,
            String cli_calle1,
            String cli_calle2,
            String cli_referencia_local
    ) {
        super.setClass(this);
        this.cli_id = cli_id;
        this.suc_id = suc_id;
        this.cli_clave = cli_clave;
        this.cli_nombre = cli_nombre;
        this.cli_apellido = cli_apellido;
        this.cli_sexo = cli_sexo;
        this.cli_correo = cli_correo;
        this.cli_telefono = cli_telefono;
        this.cli_celular = cli_celular;
        this.cli_cp = cli_cp;
        this.cli_direccion = cli_direccion;
        this.cli_calle1 = cli_calle1;
        this.cli_calle2 = cli_calle2;
        this.cli_referencia_local = cli_referencia_local;
    }

    public Long getCli_id() {
        return cli_id;
    }

    public void setCli_id(Long cli_id) {
        this.cli_id = cli_id;
    }

    public Integer getSuc_id() {
        return suc_id;
    }

    public void setSuc_id(Integer suc_id) {
        this.suc_id = suc_id;
    }

    public String getCli_clave() {
        return cli_clave;
    }

    public void setCli_clave(String cli_clave) {
        this.cli_clave = cli_clave;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public String getCli_sexo() {
        return cli_sexo;
    }

    public void setCli_sexo(String cli_sexo) {
        this.cli_sexo = cli_sexo;
    }

    public String getCli_correo() {
        return cli_correo;
    }

    public void setCli_correo(String cli_correo) {
        this.cli_correo = cli_correo;
    }

    public String getCli_telefono() {
        return cli_telefono;
    }

    public void setCli_telefono(String cli_telefono) {
        this.cli_telefono = cli_telefono;
    }

    public String getCli_celular() {
        return cli_celular;
    }

    public void setCli_celular(String cli_celular) {
        this.cli_celular = cli_celular;
    }

    public String getCli_cp() {
        return cli_cp;
    }

    public void setCli_cp(String cli_cp) {
        this.cli_cp = cli_cp;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    public String getCli_calle1() {
        return cli_calle1;
    }

    public void setCli_calle1(String cli_calle1) {
        this.cli_calle1 = cli_calle1;
    }

    public String getCli_calle2() {
        return cli_calle2;
    }

    public void setCli_calle2(String cli_calle2) {
        this.cli_calle2 = cli_calle2;
    }

    public String getCli_referencia_local() {
        return cli_referencia_local;
    }

    public void setCli_referencia_local(String cli_referencia_local) {
        this.cli_referencia_local = cli_referencia_local;
    }

}
