/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safyd.ws;

import com.safyd.utils.WebService;
import java.io.InputStream;
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

    @Path("/AgregarModificar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Agregar(InputStream inputstream) throws JSONException {
        return this.hacerRespuesta(new JSONArray());
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
