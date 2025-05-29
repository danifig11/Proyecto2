package com.example;

import org.neo4j.driver.Session;
import org.neo4j.driver.Result;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Recomendador {
    private BaseDeDatos bd;

    public Recomendador(BaseDeDatos bd) {
        this.bd = bd;
    }

    public void recomendarCarreras(Usuario usuario) {
        try (Session session = bd.getConexion().getSession()) {
            String query = "MATCH (u:Usuario)-[:LE_GUSTA]->(c:Carrera) " +
                           "WHERE u.intereses CONTAINS $interes AND u.materiasFavoritas CONTAINS $materia " +
                           "RETURN DISTINCT c.nombre AS recomendacion";

            Map<String, Object> params = new HashMap<>();
            params.put("interes", usuario.getIntereses());
            params.put("materia", usuario.getMateriasFavoritas());

            Result result = session.run(query, params);

            StringBuilder recomendaciones = new StringBuilder();
            while (result.hasNext()) {
                String carrera = result.next().get("recomendacion").asString();
                recomendaciones.append("- ").append(carrera).append("\n");
            }

            if (recomendaciones.length() == 0) {
                JOptionPane.showMessageDialog(null, "No se encontraron recomendaciones similares :(");
            } else {
                JOptionPane.showMessageDialog(null, "Carreras recomendadas:\n" + recomendaciones.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al recomendar: " + e.getMessage());
        }
    }
}