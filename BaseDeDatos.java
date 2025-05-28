/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa, Saul Castillo
 * Fecha: Mayo 2025
 * 
 * Clase BaseDeDatos: Maneja el acceso a la base de datos Neo4j.
 */

package com.example;

public class BaseDeDatos {
    private Neo4jConnection conexion;

    public BaseDeDatos(Neo4jConnection conexion) {
        this.conexion = conexion;
    }

    public Neo4jConnection getConexion() {
        return conexion;
    }

    public void insertarUsuario(Usuario usuario) {
        System.out.println("Insertando usuario: " + usuario.getNombre());
    }

    public void insertarCarrera(Carrera carrera) {
        System.out.println("Insertando carrera: " + carrera.getNombre());
    }

    public void buscarCarrerasRelacionadas(String interes) {
        System.out.println("Buscando carreras relacionadas con: " + interes);
    }
}