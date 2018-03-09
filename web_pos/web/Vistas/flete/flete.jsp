<!DOCTYPE html>
<div class="panel panel-footer" >
    <div class="panel-heading">              
        Nuevo Flete
    </div>
    <div class="panel-body" id="cliente">
        <form  id="frmCaptura" data-toggle="validator">
            <div class="col-md-12"> 
                <div class="form-group col-md-6">
                    <label class="control-label">Origen:*</label>
                    <div class="input-group custom-search-form">
                        <input class="form-control" type="text" placeholder="Origen" id="fle_origen"/> 
                        <span class="input-group-btn">
                            <button class="btn btn-info" type="button" >Buscar</button>
                        </span>

                    </div>
                    <div class="help-block with-errors"></div>
                </div> 
                <div class="form-group col-md-6">
                    <label class="control-label">Destino:*</label>
                    <div class="input-group custom-search-form">
                        <input class="form-control" type="text" placeholder="Remitente" id="fle_destino" /> 
                        <span class="input-group-btn">
                            <button class="btn btn-info" type="button" >Buscar</button>
                        </span>
                    </div>
                    <div class="help-block with-errors"></div>
                </div> 
            </div><div class="col-md-12"> 
                <div class="col-md-6"> 
                    <label class="control-label">Nombre/Empresa:*</label>
                    <input class="form-control" id="nombre" data-error="Falta_Nombre"/>
                    <div class="help-block with-errors"></div>
                </div>
            </div>

        </form>
    </div>
    <div class="panel-footer clearfix">
        <div class="pull-right">
            <!--<a href="#" id="btnNuevo" class="btn btn-default" onclick="">Nuevo</a>-->
            <!--<a href="#" id="btnEliminar" class="btn btn-danger">Eliminar</a>-->
            <a href="#" id="btnGuardar" class="btn  btn-primary">Guardar</a>
            <a href="#" id="btnCancelar" class="btn  btn-danger">Cancelar</a>
        </div>
    </div>
</div>


