package com.safyd.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Entidad {

    public Entidad(Class<?> clase) {
        this.base(clase);
    }

    private void base(Class<?> clase) {
        this.generaQuerySelectUnico(this.generadorModelo(clase), clase.getName());
        this.generaQueryUpdate(this.generadorModelo(clase), clase.getName());
        this.generaQueryDelete(this.generadorModelo(clase), clase.getName());
        this.generaQueryConsultaTodos(clase.getName());
    }

    private HashMap generadorModelo(Class<?> clase) {
        try {
            HashMap<Object, Object> modelo = new HashMap<>();
            for (Field Fiel : clase.getFields()) {
                modelo.put(Fiel.getName(), Fiel.get(Fiel.getName()));
            }
            return modelo;
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Entidad.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void generaQuerySelectUnico(Map map, String nombreTabla) {
        Map<String, Object> params = map;     
        String sql = "SELECT * FROM " + nombreTabla;
        boolean primero = true;
        for (String nombreParametro : params.keySet()) {
            Object evaluaParametro = params.get(nombreParametro);
            if (evaluaParametro != null) {
                if (primero) {
                    sql += " WHERE " + nombreParametro + "=?";
                    primero = false;
                } else {
                    sql += " AND " + nombreParametro + "=?";
                }
            }
        }
    }
    

    private void generaQueryUpdate(Map map, String nombreTabla) {
    }

    private void generaQueryDelete(Map map, String nombreTabla) {
    }

    private void generaQueryConsultaTodos(String nombreTabla) {
    }
}
