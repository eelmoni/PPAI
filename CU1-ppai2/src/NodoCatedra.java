/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NodoCatedra {
      private Catedra info;
    private NodoCatedra next;

    public NodoCatedra() {
    }

    public NodoCatedra(Catedra x, NodoCatedra p) {
        info = x;
        next = p;
    }

    public NodoCatedra getNext() {
        return next;
    }

    public void setNext(NodoCatedra p) {
        next = p;
    }

    public Catedra getInfo() {
        return info;
    }

    public void setInfo(Catedra p) {
        info = p;
    }

    @Override
    public String toString() {
        return info.toString();
    }

    
}
