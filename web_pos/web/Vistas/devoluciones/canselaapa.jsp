<%-- 
    Document   : cancelacionapartados
    Created on : 11-mar-2018, 18:28:19
    Author     : golu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/bootstrapmod.css" type="text/css">
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
        <link rel="stylesheet" href="css/bootstramod.css" type="text/css"/>
    </head>
    <body>
        <div class="panel panel-footer">
            <div class="panel-body" id="desktop">
                <div class="bg-light ">
                    <div class="container">
                        <div class="py-6 text-center">
                            <h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit; font-family:  fantasy;">Cancelación de Apartados</font></font></h2>
                        </div>
                    </div>
                    <div class="col-md-12">
            <div class="col-md-6 mb-3">
                <label class="control-label" for="sta_address">Codigo*</label>
                <input class="form-control" id="rfc"  type="text" placeholder="RFC"/></div>
                <div class="col-md-6 mb-3">
                <label class="control-label" for="sta_address">Unidades:*</label>
                <input class="form-control" id="razoncoscial" placeholder="Razaon Social" required data-error ="Error">
                </div>
                    </div>
                       <div class="col-md-12">
                     <div class="col-md-6 mb-3">
                <label class="control-label" for="sta_address">:*</label>
                <input class="form-control" id="direccion" type="text" placeholder="Dirección">
            </div>
                    
            <div class="col-md-6 mb-3">
                <label class="control-label" for="sta_address">Correo:*</label>
                <input class="form-control" id="email" type="email" placeholder="Correo" required data-error ="Error">
            </div> </div>
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
            


    </body>
</html>
