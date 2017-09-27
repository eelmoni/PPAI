
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
    public String getFacultadUsuarioLogueado(){
        Facultad f1=new Facultad("FRC","La mas piola");
                Usuario u = new Usuario("admin","admin");
        u.setFacultad(f1);
        Sesion s=new Sesion(u);
        return s.getUser().getFacultad().getNombre();
        
//return this.sesionActiva.getUser().getFacultad().getNombre();
    }
  
    public String[] buscarCatedras() {
        Iterador it = crearIterador();
        it.primero();
        String x[]=new String[this.catedras.getCantidad()];

        while (!it.haTerminado()) {
            int i=0;
            if (it.cumpleFiltro()) {
                x[i]=it.actual().getInfo().mostrarNombre();
            }
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
