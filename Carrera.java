/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa, Saul Castillo, Oliver Cifuentes
 * Fecha: Mayo 2025
 * 
 * Clase Carrera: Representa una carrera universitaria con sus características principales.
 */

 public class Carrera {
    private String nombre;
    private String area;


    public Carrera(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}