/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Carrera implements IAgregado{
private String nombre;
private String descripcion;

private ListaCatedra catedras;

    public Carrera(String nombre, String descripcion, ListaCatedra catedras) {
        this.nombre = nombre;
        this.descripcion = descripcion;

        this.catedras=catedras;
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

    public ListaCatedra getCatedras() {
        return catedras;
    }

    public void setCatedras(ListaCatedra catedras) {
        this.catedras = catedras;
    }

    

    @Override
    public String toString() {
        return "Carrera:" + "\n"  + nombre   ;
    }

    @Override//vamos vamos argentina
    public Iterador crearIterador() {
        return this.catedras.iterador();
    }
    
    public String[] buscarCatedras() {
        String x[]=new String[this.catedras.getCantidad()];
        Iterador it = crearIterador();
        it.primero();
        int i=0;
        

        while (!it.haTerminado()) {            
            x[i]=it.actual().getInfo().getNombre();  
            i++;
            it.siguiente();
        }
        return x;
    }

}
