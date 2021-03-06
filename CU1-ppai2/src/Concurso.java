
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

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

    @Override
    public String toString() {
        
        return 
                "///////////////////////////////////////////////////////////"+
                "\n"+
                "Fecha de Creacion: " 
                + this.formatDate(fechaCreacion) +"\n" +
                "Catedra : " + catedra.mostrarCatedra() +"\n"+
                "Fecha Estimada de Inscripcion: "
                + this.formatDate(fechaEstimadaConvocatoriaInscripcion) +"\n" + 
                "Fecha Estimada Realizacion de Concurso: " + this.formatDate(fechaEstimadaRealizacion)+"\n"+
                "///////////////////////////////////////////////////////////"
                +"\n" +"Informacion del Usuario:" +"\n"+                
                  usuarioCreador.toString()+ "\n"+
                "///////////////////////////////////////////////////////////"
                +"\n" +"Informacion de la Carrera Y Facultad:" +"\n"+ facultad.toString() +"\n"+ carrera.toString()
                  +"\n"+
                "///////////////////////////////////////////////////////////"+ 
                "\n" +
                  estado.toString() + "\n"
                +"///////////////////////////////////////////////////////////"+ 
                "\n" +"Cargos Llamados para Concurso:"+"\n" +this.mostrarCargosLlamados(); 
    }
    
    private Calendar fechaCreacion;
    private int numeroExpediente;
    private Catedra catedra;
    private Calendar fechaEstimadaConvocatoriaInscripcion;
    private Calendar fechaEstimadaRealizacion;
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
    private ArrayList<CargoLlamado> cargos;
    private String lugarDesignado;
    private Facultad facultad;
    private HistorialEstadoConcurso estado;
    

    public Concurso(Calendar fechaCreacion, Catedra catedra,
            Calendar fechaEstimadaConvocatoriaInscripcion,
            Calendar fechaEstimadaRealizacion, Usuario usuarioCreador,
            Carrera carrera, Facultad facultad,ArrayList<CargoLlamado> cargos) //Constructor POSTA
    {
        this.fechaCreacion = fechaCreacion;
        this.catedra = catedra;
        this.fechaEstimadaConvocatoriaInscripcion =
                fechaEstimadaConvocatoriaInscripcion;
        this.fechaEstimadaRealizacion = fechaEstimadaRealizacion;
        this.usuarioCreador = usuarioCreador;
        this.carrera = carrera;
        this.facultad = facultad;
        this.cargos=cargos;
    }
    
    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }
    
    public ArrayList<CargoLlamado> getCargos() {
        return cargos;
    }

    public void setCargos(ArrayList<CargoLlamado> cargos) {
        this.cargos = cargos;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public Calendar getFechaEstimadaConvocatoriaInscripcion() {
        return fechaEstimadaConvocatoriaInscripcion;
    }

    public void 
setFechaEstimadaConvocatoriaInscripcion(Calendar fechaEstimadaConvocatoriaInscripcion) {
        this.fechaEstimadaConvocatoriaInscripcion = fechaEstimadaConvocatoriaInscripcion;
    }

    public Calendar getFechaEstimadaRealizacion() {
        return fechaEstimadaRealizacion;
    }

    public void setFechaEstimadaRealizacion(Calendar fechaEstimadaRealizacion) {
        this.fechaEstimadaRealizacion = fechaEstimadaRealizacion;
    }

    public Usuario getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(Usuario usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public HistorialEstadoConcurso getEstado() {
        return estado;
    }

    public void setEstado(HistorialEstadoConcurso estado) {
        this.estado = estado;
    }
    public Concurso(){
        
    }
    
    public void tomarEstadoConcurso(EstadoConcurso estado)
    {
        Calendar now = Calendar.getInstance();
        this.estado= new HistorialEstadoConcurso(now,estado,"Se ha generado el concurso");
    }
    
    private String formatDate(Calendar date) {
        String formattedDate= "";
        
        formattedDate += date.get(Calendar.DAY_OF_MONTH);
        formattedDate += "/" + date.get(Calendar.MONTH);
        formattedDate += "/" + date.get(Calendar.YEAR);
        
        return formattedDate;
    }
    
    public void addCargoLlamado(CargoLlamado cl)
    {
        this.cargos.add(cl);
    }
    
    public String mostrarCargosLlamados(){
       Object ret[]=this.cargos.toArray();
       StringBuilder rett = new StringBuilder().append("");
        if (ret.length==3) 
        {
        rett.append("\n").append(ret[0].toString()).append("\n").append(ret[1].toString()).append("\n").append(ret[2].toString()).append("\n").append("///////////////////////////////////////////////////////////");
        }
        if (ret.length==2) {
            rett.append("\n").append(ret[0].toString()).append("\n").append(ret[1].toString()).append("\n").append("///////////////////////////////////////////////////////////");
            
        }
        if (ret.length==1) {
            rett.append("\n").append(ret[0].toString()).append("\n").append("///////////////////////////////////////////////////////////");
            
        }
        return rett.toString();
    }
//    public Object mostrarCargosLlamados(Concurso c){
//                            Object ret[]= c.getCargos().toArray();
//                    System.out.println("///////////////////////////////////////////////////////////");
//                    for (int i = 0; i < ret.length; i++) 
//                    {
//                        System.out.println(ret[i].toString());
//                    }
//                    System.out.println("///////////////////////////////////////////////////////////");
//                    return ret;
//    }
}
