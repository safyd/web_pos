<%-- 
    Document   : vistas
    Created on : 05-feb-2018, 5:56:15
    Author     : golu
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script src="js/jquery.js"></script>


<script src="js/Servicios.js"></script>
<script src="js/json.js"></script>
<%@ page import="com.safyd.entidad.Paginas" %>
<script type="text/javascript">
    var url = '<%= Paginas.Sucursal.CONSULTAR_SUCURSALES%>';
     var urlAgregarSucursal = '<%= Paginas.Sucursal.AGREGAR_SUCURSAL%>';
    var urlEliminarSucursal = '<%= Paginas.Sucursal.ELIMINAR_SUCURSAL%>';
//"http://localhost:8085/web_pos/webresources/ClienteWS/Consultar/";
    //Es necesario Jquery
    $.getScript("js/json.js");
    var modelo = creaJSON();

    function creaJSON() {
        return JSON.stringify({
            "suc_rfc": $('#suc_rfc').val(),
            "suc_razoncoscial": $('#suc_razoncoscial').val(),
            "suc_direccion": $('#suc_direccion').val(),
            "suc_numerodesucursal": $('#suc_numerodesucursal').val(),
            "suc_codigopostal": $('#suc_codigopostal').val(),
            "suc_entrecalleycalle": $('#suc_entrecalleycalle').val(),
            "suc_numeroexterior": $('#suc_numeroexterior').val(),
            "suc_descripciondelasusucrsal": $('#suc_descripciondelasusucrsal').val(),
             "suc_referencias": $('#suc_referencias').val()
        });
    }

</script>
  <div class="panel panel-footer">
            <div class="panel-body" id="desktop">
                <div class="bg-light ">
                    <div class="container">
                        <div class="py-6 text-center">
                            <h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit; font-family:  fantasy;">Sucursal</font></font></h2>
                        </div>
                    </div>
                    <div class="col-md-12">
            <div class="col-md-6 mb-3">
                <label class="control-label" for="sta_address">RFC:*</label>
                <input class="form-control" id="suc_rfc"  type="text" placeholder="RFC"/></div>
                <div class="col-md-6 mb-3">
                <label class="control-label" for="sta_address">Razón Social:*</label>
                <input class="form-control" id="suc_razoncoscial" placeholder="Razaon Social" required data-error ="Error">
                </div>
                    </div>
                       <div class="col-md-12">
                     <div class="col-md-8 mb-3">
                <label class="control-label" for="sta_address">Dirección:*</label>
                <input class="form-control" id="suc_direccion" type="text" placeholder="Dirección">
            </div>
                    
            <div class="col-md-2 mb-3">
                <label class="control-label" for="sta_address">numero de Sucursal:*</label>
                <input class="form-control" id="suc_numerodesucursal" type="email" placeholder="Numero de Sucursal" required data-error ="Error">
            </div>
                        <div class="col-md-2 mb-3">
                <label class="control-label" for="sta_address">Codigo postal:*</label>
                <input class="form-control" id="suc_codigopostal" type="text" placeholder="Codigo Postal">
            </div>
                       </div>
                    
                       <div class="col-md-12">
           
            <div class="col-md-10 mb-3">
                <label class="control-label" for="sta_address">Entre Calle y Calle:*</label>
                <input class="form-control" id="suc_entrecalleycalle" type="text" placeholder="Entre Calle y Calle" > 
            </div>
                                    <div class="col-md-2 mb-3">
                <label class="control-label" for="sta_address">Numero Exterior:*</label>
                <input class="form-control" id="suc_numeroexterior" type="text" placeholder="N.Exterior" > 
            </div>
                       </div>
                    </div>
                    <div class="col-md-12">        
            <div class="col-md-8 mb-3">
                <label class="control-label" for="sta_address">Descripción de la Sucursal:*</label>
                <input class="form-control" id="suc_descripciondelasusucrsal" type="text" placeholder="Descripción de la Sucursal">
            </div>
            <div class="col-md-4 mb-3">
                <label class="control-label" for="sta_address">Referencias:*</label>
                <input class="form-control" id="suc_referencias" type="text" placeholder="Referencias">
            </div>
                    </div>
              
         
        </div>
                </div>
            <div class="panel-footer clearfix">
        <div class="pull-right">    
            <!--<a href="#" id="btnNuevo" class="btn btn-default" onclick="">Nuevo</a>-->
            <!--<a href="#" id="btnEliminar" class="btn btn-danger">Eliminar</a>-->
            <a href="#" id="btnGuardar" class="btn  btn-primary">Guardar</a>
            <a href="#" id="btnCancelar" class="btn  btn-danger">Cancelar</a>
        </div>
    </div>
            


