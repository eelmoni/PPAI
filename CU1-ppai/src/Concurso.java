
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Concurso {
    private Calendar fechaCreacion;
    private int numeroExpediente;
    private Catedra catedra;
    private Calendar fechaEstimadaConvocatoriaInscripcion;
    private Calendar fechaEstimadaRealizacion;
    //private HistorialEstadoConcurso estados;
    private Calendar fechaDesdeInscripcionAspirantes;
    private Calendar fechaFinInscripcionAspirantes;
    private Calendar fechaLimiteRecepcionTemas;
    private Calendar fechaSorteoTemas;
    private Calendar fechaClasePublica;
    private Calendar fechaDesdeExcusacion;
    private Calendar fechaLimiteExcusacion;
    private Calendar fechaDesdeRecusacion;
    private Calendar fechaLimiteRecusacion;
    private Usuario usuarioCreador;
    private Carrera carrera;
    //private CargoLlamado cargos;
    //private MiembroTribunal tribunal;
    private String lugarDesignado;
   // private Sorteo sorteo;
    private Facultad facultad;
    private EstadoConcurso estado;

    public Concurso(Calendar fechaCreacion, Catedra catedra, Calendar fechaEstimadaConvocatoriaInscripcion, Calendar fechaEstimadaRealizacion, Usuario usuarioCreador, Carrera carrera, Facultad facultad) {
        this.fechaCreacion = fechaCreacion;
        this.catedra = catedra;
        this.fechaEstimadaConvocatoriaInscripcion = fechaEstimadaConvocatoriaInscripcion;
        this.fechaEstimadaRealizacion = fechaEstimadaRealizacion;
        this.usuarioCreador = usuarioCreador;
        this.carrera = carrera;
        this.facultad = facultad;
    }
    
    public void EstadoGenerada(){
        estado=new Definido();
    }
}
