/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.NoSuchElementException;

/**
 *
 * @author Mati
 */
public class ListaCarrera {

    private NodoCarrera frente;
    private String[] listaCarrera;
    private int cantidad;

    public ListaCarrera() {
        frente = null;
        cantidad = 0;
        
    }

    public NodoCarrera getFrente() {
        return frente;
    }

    public void setFrente(NodoCarrera frente) {
        this.frente = frente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void addFirst(Carrera x) {

        NodoCarrera p = new NodoCarrera(x, frente);
        frente = p;
        cantidad++;
    }

    public void clear() {
        frente = null;
        cantidad = 0;
    }

    public Carrera getFirst() {
        if (frente == null) {
            throw new NoSuchElementException("Error: la lista esta vacia...");
        }
        return frente.getInfo();
    }

    public Carrera getLast() {
        if (frente == null) {
            throw new NoSuchElementException("Error: la lista esta vacia...");
        }
        NodoCarrera p = frente;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        return p.getInfo();
    }

    public String[] getListaUni() {
        if (listaCarrera == null) {
            buscarCarreraes();
        }
        return listaCarrera;
    }

    public boolean isEmpty() {
        return (frente == null);

    }

   
    public void buscarCarreraes() {
        listaCarrera = new String[cantidad];
        NodoCarrera p = frente;
        for(int i = 0; i < listaCarrera.length; i++) 
        {
            listaCarrera[i]=p.getInfo().getNombre();
            p=p.getNext();
        }
    }
    
    
    
    
}
