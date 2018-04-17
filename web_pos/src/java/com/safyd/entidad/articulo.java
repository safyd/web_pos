package com.safyd.entidad;

import Safyd.System.DataBase.ORM;
import com.mysql.fabric.xmlrpc.base.Data;
import java.util.Date;

public class articulo extends ORM<articulo> {

    private Integer art_id;
    private Integer prs_id;
    private Integer uni_id;
    private Integer cod_id;
    private Integer ubi_id;
    private Integer vig_id;
    private Integer img_id;
    private String art_codigo;
    private String art_descripcion;
    private Double art_ultimo_costo;
    private Double art_precio;
    private Integer art_activo;
    private Double art_margen_utilidad;
    private String art_unidad_medida;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;

    public articulo() {
        super.setClass(this);
    }

    public articulo(
            Integer art_id,
            Integer prs_id,
            Integer uni_id,
            Integer cod_id,
            Integer ubi_id,
            Integer vig_id,
            Integer img_id,
            String art_codigo,
            String art_descripcion,
            Double art_ultimo_costo,
            Double art_precio,
            Integer art_activo,
            Double art_margen_utilidad,
            String art_unidad_medida,
            Date fechaCreacion,
            Date fechaModificacion,
            String usuarioCreacion,
            String usuarioModificacion
    ) {
        super.setClass(this);
        this.art_id = art_id;
        this.prs_id = prs_id;
        this.uni_id = uni_id;
        this.cod_id = cod_id;
        this.ubi_id = ubi_id;
        this.vig_id = vig_id;
        this.img_id = img_id;
        this.art_codigo = art_codigo;
        this.art_descripcion = art_descripcion;
        this.art_ultimo_costo = art_ultimo_costo;
        this.art_precio = art_precio;
        this.art_activo = art_activo;
        this.art_margen_utilidad = art_margen_utilidad;
        this.art_unidad_medida = art_unidad_medida;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    public Integer getArt_id() {
        return art_id;
    }

    public void setArt_id(Integer art_id) {
        this.art_id = art_id;
    }

    public Integer getPrs_id() {
        return prs_id;
    }

    public void setPrs_id(Integer prs_id) {
        this.prs_id = prs_id;
    }

    public Integer getUni_id() {
        return uni_id;
    }

    public void setUni_id(Integer uni_id) {
        this.uni_id = uni_id;
    }

    public Integer getCod_id() {
        return cod_id;
    }

    public void setCod_id(Integer cod_id) {
        this.cod_id = cod_id;
    }

    public Integer getUbi_id() {
        return ubi_id;
    }

    public void setUbi_id(Integer ubi_id) {
        this.ubi_id = ubi_id;
    }

    public Integer getVig_id() {
        return vig_id;
    }

    public void setVig_id(Integer vig_id) {
        this.vig_id = vig_id;
    }

    public Integer getImg_id() {
        return img_id;
    }

    public void setImg_id(Integer img_id) {
        this.img_id = img_id;
    }

    public String getArt_codigo() {
        return art_codigo;
    }

    public void setArt_codigo(String art_codigo) {
        this.art_codigo = art_codigo;
    }

    public String getArt_descripcion() {
        return art_descripcion;
    }

    public void setArt_descripcion(String art_descripcion) {
        this.art_descripcion = art_descripcion;
    }

    public Double getArt_ultimo_costo() {
        return art_ultimo_costo;
    }

    public void setArt_ultimo_costo(Double art_ultimo_costo) {
        this.art_ultimo_costo = art_ultimo_costo;
    }

    public Double getArt_precio() {
        return art_precio;
    }

    public void setArt_precio(Double art_precio) {
        this.art_precio = art_precio;
    }

    public Integer getArt_activo() {
        return art_activo;
    }

    public void setArt_activo(Integer art_activo) {
        this.art_activo = art_activo;
    }

    public Double getArt_margen_utilidad() {
        return art_margen_utilidad;
    }

    public void setArt_margen_utilidad(Double art_margen_utilidad) {
        this.art_margen_utilidad = art_margen_utilidad;
    }

    public String getArt_unidad_medida() {
        return art_unidad_medida;
    }

    public void setArt_unidad_medida(String art_unidad_medida) {
        this.art_unidad_medida = art_unidad_medida;
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
