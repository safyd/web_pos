/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safyd.ws;

import com.safyd.utils.WebService;
import java.io.InputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author layo
 */
@Path("InventarioWS")
public class InventarioWS extends WebService {

    @Context
    private UriInfo context;

    public InventarioWS() {
    }

    @Path("/Consultar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Consultar(InputStream inputstream) {

        return this.hacerRespuesta(new JSONObject());
    }
    @Path("/Agregar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Agregar(InputStream inputstream) {

        return this.hacerRespuesta(new JSONObject());
    }
    @Path("/Eliminar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Eliminar(InputStream inputstream) {

        return this.hacerRespuesta(new JSONObject());
    }
    @Path("/ModifcarPorApp")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response ModifcarPorApp(InputStream inputstream) {

        return this.hacerRespuesta(new JSONObject());
    }
    
}
