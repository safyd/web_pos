package com.safyd.configuracion;

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

@Path("FleteWS")
public class FleteWS extends WebService {

    @Context
    private UriInfo context;

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
}
