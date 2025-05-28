package com.example;
/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * Departamento de Ciencia de la Computación
 * Autor: Daniel Figueroa,  Saul Castillo
 * Fecha: Mayo 2025
 * 
 * Clase Carrera: Representa una carrera universitaria con sus características principales.
 */

 public class Carrera {
    private String nombre;
    private String area;
    private int duracion;
    private String descripcion;

    public Carrera(String nombre, String area, int duracion, String descripcion) {
        this.nombre = nombre;
        this.area = area;
        this.duracion = duracion;
        this.descripcion = descripcion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}