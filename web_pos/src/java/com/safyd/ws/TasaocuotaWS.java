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
import com.safyd.entidad.tasaocuota;
import org.json.JSONObject;

@Path("TasaocuotaWS")
public class TasaocuotaWS extends WebService {

    @Context
    private UriInfo context;

    public TasaocuotaWS() {
    }

    @Path("/Consultar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Consultar(InputStream inputstream) throws JSONException {
        tasaocuota tsc = new tasaocuota();
        //-------Cambia------
        JSONObject jsonTas;
        JSONArray jsonArray = new JSONArray();
        //FOR EACH PARA RECORRER LISTAS
        for (tasaocuota tas : tsc.get()) {
            jsonTas = new JSONObject();
            jsonTas.put("tsc_rango", tas.getTsc_rango());
            jsonTas.put("tsc_valor_maximo", tas.getTsc_valor_maximo());
            jsonTas.put("tsc_valor_minimo", tas.getTsc_valor_minimo());
            jsonTas.put("tsc_impuesto", tas.getTsc_impuesto());
            jsonTas.put("tsc_factor", tas.getTsc_factor());
            jsonTas.put("tsc_traslado", tas.getTsc_traslado());
            jsonTas.put("tsc_retencion", tas.getTsc_retencion());
            jsonArray.put(jsonTas);
        }
        if (tsc.get().size() < 1) {
            return this.hacerRespuesta(
                    new JSONObject().put("resultado",
                            new JSONObject().put("exito", false))
                            .put("mensaje", "No hay registros")
                            //Cambia
                            .put("tasaocuota", jsonArray)
            );
        } else {
            return this.hacerRespuesta(
                    new JSONObject().put("resultado",
                            new JSONObject().put("exito", true))
                            .put("mensaje", "Consulta exitosa")
                            //Cambia
                            .put("tasaocuota", jsonArray)
            );
        }
    }
}
