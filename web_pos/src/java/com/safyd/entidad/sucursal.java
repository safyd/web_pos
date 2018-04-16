package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import java.util.Date;

public class sucursal extends ORM<sucursal> {

    private Integer suc_id;
    private String suc_nombre;
    private String suc_direccion;
    private String suc_estado;
    private String suc_municipio;
    private Long suc_numero_exterior;
    private Long suc_numero_interior;
    private String suc_referencia;
    private Integer suc_activo;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;

    public sucursal() {
        super.setClass(this);

    }

    public sucursal(Integer suc_id,
            String suc_nombre,
            String suc_direccion,
            String suc_estado,
            String suc_municipio,
            Long suc_numero_exterior,
            Long suc_numero_interior,
            String suc_referencia,
            Integer suc_activo,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usuarioModificacion) {
        super.setClass(this);
        this.suc_id = suc_id;
        this.suc_nombre = suc_nombre;
        this.suc_direccion = suc_direccion;
        this.suc_estado = suc_estado;
        this.suc_municipio = suc_municipio;
        this.suc_numero_exterior = suc_numero_exterior;
        this.suc_numero_interior = suc_numero_interior;
        this.suc_referencia = suc_referencia;
        this.suc_activo = suc_activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    public Integer getSuc_id() {
        return suc_id;
    }

    public void setSuc_id(Integer suc_id) {
        this.suc_id = suc_id;
    }

    public String getSuc_nombre() {
        return suc_nombre;
    }

    public void setSuc_nombre(String suc_nombre) {
        this.suc_nombre = suc_nombre;
    }

    public String getSuc_direccion() {
        return suc_direccion;
    }

    public void setSuc_direccion(String suc_direccion) {
        this.suc_direccion = suc_direccion;
    }

    public String getSuc_estado() {
        return suc_estado;
    }

    public void setSuc_estado(String suc_estado) {
        this.suc_estado = suc_estado;
    }

    public String getSuc_municipio() {
        return suc_municipio;
    }

    public void setSuc_municipio(String suc_municipio) {
        this.suc_municipio = suc_municipio;
    }

    public Long getSuc_numero_exterior() {
        return suc_numero_exterior;
    }

    public void setSuc_numero_exterior(Long suc_numero_exterior) {
        this.suc_numero_exterior = suc_numero_exterior;
    }

    public Long getSuc_numero_interior() {
        return suc_numero_interior;
    }

    public void setSuc_numero_interior(Long suc_numero_interior) {
        this.suc_numero_interior = suc_numero_interior;
    }

    public String getSuc_referencia() {
        return suc_referencia;
    }

    public void setSuc_referencia(String suc_referencia) {
        this.suc_referencia = suc_referencia;
    }

    public Integer getSuc_activo() {
        return suc_activo;
    }

    public void setSuc_activo(Integer suc_activo) {
        this.suc_activo = suc_activo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

}
