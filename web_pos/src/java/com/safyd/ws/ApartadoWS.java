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
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author Hoho
 */
@Path("Apartado")
public class ApartadoWS  extends WebService{

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApartadoWS
     */
    public ApartadoWS() {
    }

    /**
     * Retrieves representation of an instance of com.safyd.ws.ApartadoWS
     * @return an instance of java.lang.String
     */
    @Path("/Guardar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Guardar(InputStream inputstream) {
        return this.hacerRespuesta(new JSONObject());
    }
}
