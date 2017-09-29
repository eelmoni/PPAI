
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
class ListaCatedra {
    
    
   

    private NodoCatedra frente;
    private String[] ListaCatedra;
    private int cantidad;

    public ListaCatedra() {
        frente = null;
        cantidad = 0;
        ListaCatedra = null;
    }

    public NodoCatedra getFrente() {
        return frente;
    }

    public void setFrente(NodoCatedra frente) {
        this.frente = frente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void addFirst(Catedra x) {

        NodoCatedra p = new NodoCatedra(x, frente);
        frente = p;
        cantidad++;
    }

    public void clear() {
        frente = null;
        cantidad = 0;
    }

    public Catedra getFirst() {
        if (frente == null) {
            throw new NoSuchElementException("Error: la lista esta vacia...");
        }
        return frente.getInfo();
    }

    public Catedra getLast() {
        if (frente == null) {
            throw new NoSuchElementException("Error: la lista esta vacia...");
        }
        NodoCatedra p = frente;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        return p.getInfo();
    }
    
    public Catedra getNodeByIndex(int index) {
        if (frente == null) {
            throw new NoSuchElementException("Error: la lista esta vacia...");
        }
        NodoCatedra p = frente;
        int count = 0;
        while (p.getNext() != null) {
            p = p.getNext();
            if (count == index) break;
            count++;
        }
        return p.getInfo();
    }

    public String[] ConocerCatedra() {
        if (ListaCatedra == null) {
            buscarCatedras();
        }
        return ListaCatedra;
    }

    public boolean isEmpty() {
        return (frente == null);

    }

   
    public void buscarCatedras() {
        ListaCatedra = new String[cantidad];
        NodoCatedra p = frente;
        for(int i = 0; i < ListaCatedra.length; i++) 
        {
            ListaCatedra[i]=p.getInfo().getNombre();
            p=p.getNext();
        }
 
    }
    
    //METODO QUE CREA AL ITERADOR
    public IteradorCatedra iterador() {

        return new IteradorCatedra();
    }

    //ITERADOR
    
    
    public class IteradorCatedra implements Iterador {

        private NodoCatedra actual;

        public IteradorCatedra() {
            actual = null;
        }

        
        public NodoCatedra actual() {
            return actual;
        }

        @Override
        public boolean haTerminado() {
            if (frente == null) {
                return true;
            }
            if (actual == null) {
                return true;
            }
            return false;
        }

        @Override
        public void primero() {
            actual=frente;
        }

//        public boolean cumpleFiltro() {
//
//            if (actual.getInfo()) {
//                return true;
//            }
//
//            return false;

//        }

        @Override
        public void siguiente() {
            if (actual != null && actual.getNext() != null) {
                actual = actual.getNext();
            } else if (actual != null && actual.getNext() == null) {
                actual = null;
            }
        }

        @Override
        public boolean cumpleFiltro() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    
    
}
