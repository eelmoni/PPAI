/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mati
 */
public class Facultad {
    
private String nombre;
private ListaCarrera carreras;
private String descripcion;

    public Facultad(String nombre, String descripcion, ListaCarrera carreras) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.carreras=carreras;
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

    public void setCarreras(ListaCarrera carreras) {
        this.carreras = carreras;
    }

    public ListaCarrera getCarreras() {
        return carreras;
    }






    
    
//public String conocerCiudad(GestorEdicionCongreso gestor){
//    return ciudad.conocerProvincia(gestor);
    

public String mostrarNombre(){
    return nombre;
}

    @Override
    public String toString() {
        return "Facultad \n" + "nombre=" + nombre  ;
    }



    
    
    
}


