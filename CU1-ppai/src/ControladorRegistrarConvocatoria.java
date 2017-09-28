
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ControladorRegistrarConvocatoria implements IAgregado{
 Facultad facultad;
 Calendar fechaCreacion;
 String nombreUsuarioGenerador;
 Catedra catedra;
 Carrera carrera;
 int cantidadCargos;
 Calendar fechaEstimadaRealizacion;
 Calendar fechaEstimadaInscripcion;
//private EstadoConcurso estado;
 Categoria categoria;
 Sesion sesionActiva;
ListaCarrera carreras;
ListaCatedra catedras;


    public ControladorRegistrarConvocatoria() {
    }


    public void setFechaEstimadaInscripcion(int dia, int mes) {
        Calendar ini = new GregorianCalendar();
        ini.set(2017, (mes - 1), dia);
        this.fechaEstimadaInscripcion=ini;
    }
    public void setFechaEstimadaRealizacion(int dia, int mes) {
        Calendar ini = new GregorianCalendar();
        ini.set(2017, (mes - 1), dia);
        this.fechaEstimadaRealizacion=ini;
    }

    public String[] buscarCarreras() { //para sacar todas las carreras

        String[] aux1 = new String[carreras.getCantidad()];

        if (carreras.getFrente() != null) {
            NodoCarrera info = carreras.getFrente();
            int i = 0;
            while (info != null) {
                {

                    aux1[i] = info.getInfo().getNombre();
                    i++;

                }
                info = info.getNext();
            }
        }

        return aux1;

    }
    public String getFacultadUsuarioLogueado(Sesion s){

        return s.getUser().getFacultad().getNombre();
        
//return this.sesionActiva.getUser().getFacultad().getNombre();
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
    

    public void setSesionActiva(Sesion sesionActiva) {
        this.sesionActiva = sesionActiva;
    }

    public void setCarreras(ListaCarrera carreras) {
        this.carreras = carreras;
    }

    public void setCatedras(ListaCatedra catedras) {
        this.catedras = catedras;
    }








@Override
    public Iterador crearIterador() {
        return this.catedras.iterador();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
