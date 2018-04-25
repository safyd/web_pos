
package com.safyd.configuracion;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    private void addRestResourceClasses(Set<Class<?>> resources) {
        //AGREGAR CLASES TIPO Ws
        resources.add(com.safyd.ws.ApartadoWS.class);
        resources.add(com.safyd.ws.ArticuloWS.class);
        resources.add(com.safyd.ws.ClienteWS.class);
        resources.add(com.safyd.ws.CompaniaWS.class);
        resources.add(com.safyd.ws.FleteWS.class);
        resources.add(com.safyd.ws.InventarioWS.class);
        resources.add(com.safyd.ws.SucursalWS.class);
        resources.add(com.safyd.ws.TasaocuotaWS.class);
    }
}
