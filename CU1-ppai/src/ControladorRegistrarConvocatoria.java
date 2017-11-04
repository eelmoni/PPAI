
import java.util.ArrayList;
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
public class ControladorRegistrarConvocatoria {

    Facultad facultad;
    Calendar fechaCreacion;
    String nombreUsuarioGenerador;
    Catedra catedra;
    Carrera carrera;
    int cantidadCargos;
    Calendar fechaEstimadaRealizacion;
    Calendar fechaEstimadaInscripcion;
    Categoria categoria;
    Sesion sesionActiva;
    ListaCarrera carreras;
    ListaCatedra catedras;
    ArrayList<CargoLlamado> cargos;

    public ControladorRegistrarConvocatoria() {
    }

    public void setFechaEstimadaInscripcion(int dia, int mes) {
        Calendar ini = new GregorianCalendar();
        ini.set(2017, (mes - 1), dia);
        this.fechaEstimadaInscripcion = ini;
    }

    public void setFechaEstimadaRealizacion(int dia, int mes) {
        Calendar ini = new GregorianCalendar();
        ini.set(2017, (mes - 1), dia);
        this.fechaEstimadaRealizacion = ini;
    }

    public String[] buscarCarreras() { //para sacar todas las carreras
        ListaCarrera aux = this.sesionActiva.getUser().getFacultad().getCarreras();
        String[] aux1 = new String[this.sesionActiva.getUser().getFacultad().getCarreras().getCantidad()];
        //String[] aux1 = new String[carreras.getCantidad()];

        if (aux.getFrente() != null) {
            NodoCarrera info = aux.getFrente();
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

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

//    public String[] buscarCatedrass() { //para sacar todas las catedras
//
//        String[] aux1 = new String[catedras.getCantidad()];
//
//        if (catedras.getFrente() != null) {
//            NodoCatedra info = catedras.getFrente();
//            int i = 0;
//            while (info != null) {
//                {
//
//                    aux1[i] = info.getInfo().getNombre();
//                    i++;
//
//                }
//                info = info.getNext();
//            }
//        }
//
//        return aux1;
//    }
    public String getFacultadUsuarioLogueado(Sesion s) {

        return s.getUser().getFacultad().getNombre();

    }

    public Sesion obtenerSesion() {
        return this.sesionActiva;
    }
    //METODO QUE DEBE IR EN CARRERA
//    public String[] buscarCatedras() {
//        String x[]=new String[this.catedras.getCantidad()];
//        Iterador it = crearIterador();
//        it.primero();
//        int i=0;
//        
//
//        while (!it.haTerminado()) {            
//            x[i]=it.actual().getInfo().getNombre();  
//            i++;
//            it.siguiente();
//        }
//        return x;
//    }

    public void setSesionActiva(Sesion sesionActiva) {
        this.sesionActiva = sesionActiva;
    }

    public void setCarreras(ListaCarrera carreras) {
        this.carreras = carreras;
    }

    public void setCatedras(ListaCatedra catedras) {
        this.catedras = catedras;
    }

    public Concurso registrarNuevaConvocatoria() { //ESTE ES EL METODO MAS IMPORTANTE PARA LA REPUBLICA
        Concurso c = new Concurso(this.fechaCreacion, this.catedra, this.fechaEstimadaInscripcion, this.fechaEstimadaRealizacion, this.sesionActiva.getUser(), this.carrera, this.facultad, this.cargos);
        // EstadoConcurso est=c.crearEst();
        //c.tomarEstadoConcurso(est);
        return c;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public void setNombreUsuarioGenerador(String nombreUsuarioGenerador) {
        this.nombreUsuarioGenerador = nombreUsuarioGenerador;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setCantidadCargos(int cantidadCargos) {
        this.cantidadCargos = cantidadCargos;
    }

    public void setFechaEstimadaRealizacion(Calendar fechaEstimadaRealizacion) {
        this.fechaEstimadaRealizacion = fechaEstimadaRealizacion;
    }

    public void setFechaEstimadaInscripcion(Calendar fechaEstimadaInscripcion) {
        this.fechaEstimadaInscripcion = fechaEstimadaInscripcion;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCargos(ArrayList<CargoLlamado> cargos) {
        this.cargos = cargos;
    }

}
