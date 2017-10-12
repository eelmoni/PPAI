/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mati
 */
public class NodoCarrera {

    private Carrera info;
    private NodoCarrera next;

    public NodoCarrera() {
    }

    public NodoCarrera(Carrera x, NodoCarrera p) {
        info = x;
        next = p;
    }

    public NodoCarrera getNext() {
        return next;
    }

    public void setNext(NodoCarrera p) {
        next = p;
    }

    public Carrera getInfo() {
        return info;
    }

    public void setInfo(Carrera p) {
        info = p;
    }

    @Override
    public String toString() {
        return info.toString();
    }

}
