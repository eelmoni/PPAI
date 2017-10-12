/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mati
 */
public class NodoFacultad {

    private Facultad info;
    private NodoFacultad next;

    public NodoFacultad() {
    }

    public NodoFacultad(Facultad x, NodoFacultad p) {
        info = x;
        next = p;
    }

    public NodoFacultad getNext() {
        return next;
    }

    public void setNext(NodoFacultad p) {
        next = p;
    }

    public Facultad getInfo() {
        return info;
    }

    public void setInfo(Facultad p) {
        info = p;
    }

    @Override
    public String toString() {
        return info.toString();
    }

}
