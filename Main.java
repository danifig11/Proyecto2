package com.example;

import org.neo4j.driver.Session;
import org.neo4j.driver.Result;

/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa. Saul Castillo y Oliver Cifuentes
 * Fecha: Mayo 2025
 * 
 * Clase Principal: Establece la conexión con Neo4j, ejecuta una prueba,
 * inicializa la base de datos lógica y lanza la interfaz gráfica.
 */

public class Main {
    public static void main(String[] args) {
        String uri = "bolt://localhost:7687";
        String user = "neo4j";
        String password = "87654321";

        Neo4jConnection conexion = new Neo4jConnection(uri, user, password);
        BaseDeDatos bd = new BaseDeDatos(conexion);

        try (Session session = conexion.getSession()) {
            // Prueba rápida de conexión
            Result result = session.run("MATCH (n) RETURN n LIMIT 5");
            while (result.hasNext()) {
                System.out.println(result.next().get("n"));
            }

            // Lanzar la interfaz
            InterfazGrafica interfaz = new InterfazGrafica(bd);
            interfaz.setVisible(true);

        } catch (Exception e) {
            System.err.println("Error al conectar a Neo4j: " + e.getMessage());
        }
    }
}