<script type="text/javascript" src="js/bootstrap-table.js"></script>
<script type="text/javascript" src="js/Chart.bundle.js"></script>
<script type="text/javascript" src="js/datatable.js"></script>
<link rel="stylesheet" href="css/bootstrap-table.css">
<link rel="stylesheet" href="css/datatable.css">
<%@ page import="com.safyd.entidad.Paginas" %>
<script type="text/javascript">
    var url = '<%= Paginas.Cliente.CONSULTAR_CLIENTES%>';
//    var urlNuevoCliente = '<%= Paginas.Cliente.AGREGAR_CLIENTE%>';
//    var urlEliminarCliente = '<%= Paginas.Cliente.ELIMINAR_CLIENTE%>';
    $.getScript("js/json.js");
    var modelo = creaJSON();
    function creaJSON() {
        return JSON.stringify({
            "cli_id": $('#cli_id').val(),
            "cli_nombre": $('#cli_nombre').val(),
            "cli_apellido": $('#cli_apellido').val(),
            "grapes": $('#grapes').val(),
            "country": $('#country').val(),
            "region": $('#region').val(),
            "year": $('#year').val(),
            "description": $('#description').val()
        });
    }
</script>
<div class="panel panel-footer" >
    <div class="panel-heading">
        Clientes
    </div>    
    <div class="panel-body" >
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  <div class="row" id ="dvMensaje"></div>
        <table id="table" data-search="true"  data-show-footer="true">
            <thead>
                <tr>
                    <th data-field="cli_id">id</th>
                    <th data-field="pai_id">id Pais</th>
                    <th data-field="cli_nombre">Nombre</th>
                    <th data-field="cli_apellido">Apellido</th>
                    <th data-field="cli_contacto">Contacto</th>
                    <th data-field="cli_nif_cif">Nif/CIF</th>
                    <th data-field="cli_direccion">Direcci�n</th>
                    <th data-field="cli_localidad">Localidad</th>
                    <th data-field="cli_provincia">Provincia</th>
                    <th data-field="cli_cp">Codigo Postal</th>
                    <th data-field="cli_telefono">Tel�fono</th>
                    <th data-field="cli_correo">Correo</th>

                </tr>
            </thead>
        </table>
    </div>
    <div class="panel-footer clearfix">
        <div class="pull-right">
            <button type="button" name="nuevo" id="nuevo" class="btn btn-primary" data-toggle="modal" data-target="#loginModal">Nuevo</button>  
        </div>
    </div>
</div>
<div id="loginModal" class="modal fade" role="dialog">  
    <div class="modal-dialog">  
        <div class="modal-content">  
            <div class="modal-header">  
                <button type="button" class="close" data-dismiss="modal">&times;</button>  
                <h4 class="modal-title">Cliente</h4>  
            </div>  
            <div class="modal-body"> 
                <input type="text" id="cli_id" class="form-control" disabled="true" />
                <label>Clave:*</label>  
                <input type="text" name="compania" id="cli_nombre" class="form-control" />  
                <label>Nombre:*</label>  
                <input type="text" name="Apellido:" id="cli_apellido" class="form-control" />  
                <label>Apellido:*</label>  
                <input type="text" name="Apellido:" id="cli_sucursal" class="form-control" />  
                <label>RFC:</label>  
                <input type="text" name="Apellido:" id="cli_puesto" class="form-control" /> 
                <label></label>  
                <button type="button" name="guardar" id="guardar" class="btn btn-warning">Guardar</button>  
            </div>  
        </div>  
    </div>  
</div> 
