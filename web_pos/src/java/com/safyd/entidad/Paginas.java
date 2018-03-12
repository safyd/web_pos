package com.safyd.entidad;

public class Paginas {

    public static final String SERVIDOR = "http://localhost:8085";
    public static final String APLICACION = "/web_pos";
    public static final String RECURSOS = "/webresources";

    public static class Cliente {

        private static final String CLIENTE = "/ClienteWS";
        public static final String CONSULTAR_CLIENTES = SERVIDOR + APLICACION + RECURSOS + CLIENTE + "/Consultar";
        public static final String NUEVO_CLIENTE = SERVIDOR + APLICACION + RECURSOS + CLIENTE + "/Nuevo";
        public static final String ELIMINAR_CLIENTE = SERVIDOR + APLICACION + RECURSOS + CLIENTE + "/Elimnar";
    }

    public static class Sucursal {

        private static final String SUCURSAL = "/SucursalWS";
        public static final String CONSULTAR_SUCURSALES = SERVIDOR + APLICACION + RECURSOS + SUCURSAL + "/Consultar";

    }

    public static class Flete {

        private static final String FLETE = "/FleteWS";
        public static final String CONSULTAR_FLETES = SERVIDOR + APLICACION + RECURSOS + FLETE + "/Consultar";

    }
    public static class Articulo{
        private static final String ARTICULO = "/ArticuloWS";
        public static final String CONSULTAR_ARTICULOS =  SERVIDOR + APLICACION + RECURSOS + ARTICULO + "/Consultar";
    }
   

}
