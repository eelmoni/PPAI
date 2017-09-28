/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Carrera {
private String nombre;
private String descripcion;
private Facultad facultad;
private ListaCatedra catedras;

    public Carrera(String nombre, String descripcion, Facultad facultad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.facultad=facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
