package com.example.estudioauto2.modelo.data.dao;

import com.example.estudioauto2.modelo.Auto;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.VARCHAR;

public class AutoDAO {
    public static void agregarAuto(DSLContext query, Auto auto){
        Table tablaAuto= table(name("Auto"));
        Field[] columnas = tablaAuto.fields("marca","patente","año");
        query.insertInto(tablaAuto, columnas[0], columnas[1],columnas[2])
                .values(auto.getMarca(),auto.getPatente(),auto.getAño())
                .execute();
    }
    public static void modificarAuto(DSLContext query, String patente, String columnaTabla, Object dato){
        query.update(DSL.table("Auto")).set(DSL.field(columnaTabla),dato).
                where(DSL.field("patente").eq(patente)).execute();
    }
    public static List obtenerAuto(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Auto")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        return obtenerListaEstudiantes(resultados);
    }
    public static List obtenerAutos(DSLContext query){
        Result resultados = query.select().from(DSL.table("Auto")).fetch();
        return obtenerListaEstudiantes(resultados);
    }
    public static void eliminarAuto(DSLContext query, String patente){
        Table tablaAuto= table(name("Auto"));
        query.delete(DSL.table("Auto")).where(DSL.field("patente").eq(patente)).execute();
    }
    private static List obtenerListaEstudiantes(Result resultados){
        List<Auto> autos= new ArrayList<>();
        for(int fila=0; fila<resultados.size();fila++){
            String marca = (String) resultados.getValue(fila,"marca");
            String patente = (String) resultados.getValue(fila,"patente");
            int año = (Integer) resultados.getValue(fila,"año");
            autos.add(new Auto(marca,patente,año));
        }
        return autos;
    }


}
