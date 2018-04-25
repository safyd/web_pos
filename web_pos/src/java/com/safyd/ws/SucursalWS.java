/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safyd.ws;

import com.safyd.entidad.sucursal;
import com.safyd.utils.WebService;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Path("SucursalWS")
public class SucursalWS extends WebService {

    @Context
    private UriInfo context;

    public SucursalWS() {
    }

    @Path("/Consultar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Consultar(InputStream inputstream) throws JSONException {
        return this.hacerRespuesta(new JSONArray());
    }

    @Path("/Insertar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Insertar(InputStream inputstream) throws JSONException {
        try {
            JSONObject jsonObtener = this.obtenJSON(inputstream);
            sucursal suc = new sucursal();
            suc.setSuc_nombre(jsonObtener.getString("suc_nombre"));
            suc.setSuc_direccion(jsonObtener.getString("suc_direccion"));
            suc.setSuc_estado(jsonObtener.getString("suc_estado"));
            suc.setSuc_municipio(jsonObtener.getString("suc_municipio"));
            suc.setSuc_numero_exterior(jsonObtener.getLong("suc_numero_exterior"));
            suc.setSuc_numero_interior(jsonObtener.getLong("suc_numero_interior"));
            suc.setSuc_referencia(jsonObtener.getString("suc_referencia"));
            suc.setSuc_activo(jsonObtener.getInt("suc_activo"));
            if (suc.insert()) {
                return this.hacerRespuesta(new JSONObject().put("respuesta", "se agrego correctamente!"));
            } else {
                return this.hacerRespuesta(new JSONObject().put("respuesta", "No se agrego correctamente!"));
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SucursalWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Path("/Eliminar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Eliminar(InputStream inputstream) throws JSONException {
        return this.hacerRespuesta(new JSONArray());
    }

    @Path("/Reporte")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Reporte(InputStream inputstream) throws JSONException {
        return this.hacerRespuesta(new JSONArray());
    }
}
