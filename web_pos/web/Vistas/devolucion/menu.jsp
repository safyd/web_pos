<%-- 
    Document   : devolucionapartado
    Created on : 11-mar-2018, 16:41:46
    Author     : golu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript">
    
      $('#canselacionApartado').click(function () {
        $("#desktop").hide(200, function () {
            $("#desktop").load("Vistas/devolucion/canselarApartado.jsp");
            $("#desktop").fadeIn(1300);
        });
    });
    
    
    
    
    </script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Devolución</title>
    </head>
    <body>
        <div class="panel panel-body">
            <div class="col-md-12 form-group">
                <div class="col-md-4 column productbox">
                    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                    <div class="producttitle">Canselación de Apartados</div>
                    <div class="pull-right"><a href="#" id="canselacionApartado" class="btn btn-primary btn-md" role="button">Abrir</a></div>
                </div>
                <div class="col-md-4 column productbox">
                    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                    <div class="producttitle">Devolucion de Venta</div>
                    <div class="pull-right"><a href="#" class="btn btn-primary btn-md" role="button">Abrir</a></div>
                </div>
                <div class="col-md-4 column productbox">
                    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
                    <div class="producttitle">Devolucion de Compras</div>
                    <div class="pull-right"><a href="#" class="btn btn-primary btn-md" role="button">Abrir</a></div>
                </div> </div>
        
        </div>
    
    </div>        

</body>
</html>
