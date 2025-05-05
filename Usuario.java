/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa
 * Fecha: Mayo 2025
 * 
 * Clase Usuario: Representa a un estudiante con datos personales y preferencias.
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
