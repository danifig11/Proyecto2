/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa
 * Fecha: Mayo 2025
 * 
 */

 public class BaseDeDatos {

    public BaseDeDatos() {
        System.out.println("Simulación de conexión con base de datos Neo4j...");
    }

    // Método simulado para meter un usuario
    public void insertarUsuario(Usuario usuario) {
        System.out.println("Insertando usuario: " + usuario.getNombre());
        // Aquí iría la lógica de Cypher en la fase 2
    }

    // Método simulado para meter una carrera
    public void insertarCarrera(Carrera carrera) {
        System.out.println("Insertando carrera: " + carrera.getNombre());
        // Aquí iría lógica real de Cypher
    }

    // Simulación de consulta
    public void buscarCarrerasRelacionadas(String interes) {
        System.out.println("Buscando carreras relacionadas con: " + interes);
        // Luego se implementa con MATCH en Cypher
    }
}
