package com.example;

import org.neo4j.driver.Session;
import java.util.HashMap;
import java.util.Map;

/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa. Saul Castillo y Oliver Cifuentes
 * Fecha: Mayo 2025
 * 
 * Clase BaseDeDatos: Maneja el acceso a la base de datos Neo4j.
 */

public class BaseDeDatos {
    private Neo4jConnection conexion;

    public BaseDeDatos(Neo4jConnection conexion) {
        this.conexion = conexion;
    }

    public Neo4jConnection getConexion() {
        return conexion;
    }

    public void insertarUsuario(Usuario usuario) {
        try (Session session = conexion.getSession()) {
            String query = "CREATE (:Usuario {id: $id, nombre: $nombre, intereses: $interes, materiasFavoritas: $materia})";
            Map<String, Object> params = new HashMap<>();
            params.put("id", usuario.getId());
            params.put("nombre", usuario.getNombre());
            params.put("interes", usuario.getIntereses());
            params.put("materia", usuario.getMateriasFavoritas());
            session.run(query, params);
        }
    }

    public void actualizarUsuario(Usuario usuario) {
        try (Session session = conexion.getSession()) {
            String query = "MATCH (u:Usuario {id: $id}) " +
                           "SET u.nombre = $nombre, u.intereses = $interes, u.materiasFavoritas = $materia";
            Map<String, Object> params = new HashMap<>();
            params.put("id", usuario.getId());
            params.put("nombre", usuario.getNombre());
            params.put("interes", usuario.getIntereses());
            params.put("materia", usuario.getMateriasFavoritas());
            session.run(query, params);
        }
    }

    public void eliminarUsuario(String id) {
        try (Session session = conexion.getSession()) {
            String query = "MATCH (u:Usuario {id: $id}) DETACH DELETE u";
            Map<String, Object> params = new HashMap<>();
            params.put("id", id);
            session.run(query, params);
        }
    }
}