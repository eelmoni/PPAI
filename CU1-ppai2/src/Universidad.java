/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mati
 */
public class Universidad {

    private String nombre;
    private Facultad seleccionada;
    private ListaFacultades listaFacu;

    //CONSTRUCT
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.listaFacu = null;
        seleccionada = null;
    }

    public Facultad getSeleccionada() {
        return seleccionada;
    }

    public void setSeleccionada(Facultad seleccionada) {
        this.seleccionada = seleccionada;
    }

    public ListaFacultades getListaFacu() {
        return listaFacu;
    }

    public void setListaFacu(ListaFacultades listaFacu) {
        this.listaFacu = listaFacu;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] conocerFacultad() {

        return listaFacu.conocerFacultad();
    }

    public void agregarFacultad(Facultad f) {
        listaFacu.addFirst(f);
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + '}';
    }

}
