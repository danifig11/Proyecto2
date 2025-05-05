/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa
 * Fecha: Mayo 2025
 * 
 */

 public class Usuario {
    private String nombre;
    private String id;
    private String intereses;
    private String materiasFavoritas;

    public Usuario(String nombre, String id, String intereses, String materiasFavoritas) {
        this.nombre = nombre;
        this.id = id;
        this.intereses = intereses;
        this.materiasFavoritas = materiasFavoritas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getMateriasFavoritas() {
        return materiasFavoritas;
    }

    public void setMateriasFavoritas(String materiasFavoritas) {
        this.materiasFavoritas = materiasFavoritas;
    }
}
