<script type="text/javascript" src="js/bootstrap-table.js"></script>
<script type="text/javascript" src="js/Chart.bundle.js"></script>
<script type="text/javascript" src="js/datatable.js"></script>
<script type="text/javascript" src="js/json.js"></script>
<link rel="stylesheet" href="css/bootstrap-table.css">
<link rel="stylesheet" href="css/datatable.css">
<script type="text/javascript">
    var esActivo = false;
    var respuesta;
    var url = "http://localhost:8085/SAFYD_CONTROL/webresources/ClienteWS/Consultar/";
    function clienteformulario() {
        $("#desktop").hide("slow", function () {
            $("#desktop").load("Vistas/flete/flete.jsp");
            $("#desktop").show("slow", function () {
            });
        });
    }
</script>
<div class="panel panel-footer" >
    <div class="panel-heading">
        <div class="container">
            <div class="py-6 text-center">
                <h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit; font-family:  fantasy;">Clientes</font></font></h2>
            </div>
        </div>
        <!--data-json="json/ejemplo.json"-->
        <div class="panel-body" id="clienteTabla">
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  <table class="table datatable" 
                   data-search="true"   
                   data-click-to-select="true"


                   >
                <thead>
                    <tr>
                        <th data-field="code" data-sortable="true">cli_id</th>
                        <th data-field="value1" data-sortable="true">Value 1</th>
                        <th data-field="value2" data-sortable="true">Value 2</th>
                        <th data-formatter="" class="btn-danger">Action</th>                
                    </tr>
                </thead>
            </table>  
        </div>
        <div class="panel-footer clearfix">
            <div class="pull-right">
                <a href="#" id="btnNuevo" class="btn btn-default" onclick="clienteformulario();">Nuevo</a>
                <a href="#" id="btnEliminar" class="btn btn-danger">Eliminar</a>
                <!--<a href="#" id="btnGuardar" class="btn  btn-primary">Guardar</a>-->
                <!--<a href="#" id="btnCancelar" class="btn  btn-danger">Cancelar</a>-->
            </div>
        </div>
    </div></div>