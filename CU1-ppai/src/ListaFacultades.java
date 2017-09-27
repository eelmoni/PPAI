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
public class ListaFacultades {
    
   

    private NodoFacultad frente;
    private String[] listaFac;
    private int cantidad;

    public ListaFacultades() {
        frente = null;
        cantidad = 0;
        listaFac = null;
    }

    public NodoFacultad getFrente() {
        return frente;
    }

    public void setFrente(NodoFacultad frente) {
        this.frente = frente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void addFirst(Facultad x) {

        NodoFacultad p = new NodoFacultad(x, frente);
        frente = p;
        cantidad++;
    }

    public void clear() {
        frente = null;
        cantidad = 0;
    }

    public Facultad getFirst() {
        if (frente == null) {
            throw new NoSuchElementException("Error: la lista esta vacia...");
        }
        return frente.getInfo();
    }

    public Facultad getLast() {
        if (frente == null) {
            throw new NoSuchElementException("Error: la lista esta vacia...");
        }
        NodoFacultad p = frente;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        return p.getInfo();
    }

    public String[] conocerFacultad() {
        if (listaFac == null) {
            buscarFacultades();
        }
        return listaFac;
    }

    public boolean isEmpty() {
        return (frente == null);

    }

   
    public void buscarFacultades() {
        listaFac = new String[cantidad];
        NodoFacultad p = frente;
        for(int i = 0; i < listaFac.length; i++) 
        {
            listaFac[i]=p.getInfo().mostrarNombre();
            p=p.getNext();
        }
    }
}

    

