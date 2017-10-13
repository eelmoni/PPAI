
import In.In;
import java.text.SimpleDateFormat;
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
public class Main {

    public static ControladorRegistrarConvocatoria gec = new ControladorRegistrarConvocatoria();
    
    public static void main(String[] args) {

             //la catedra se agrega a la lista de catedras de ESA carrera
        Catedra ca1 = new Catedra("Diseño de sistemas", "code", 3, "DSI");
        Catedra ca2 = new Catedra("Ingenieria de software", "code", 4, "ISW");
        ListaCatedra sistemas = new ListaCatedra();
        sistemas.addFirst(ca2);
        sistemas.addFirst(ca1);
        
        Catedra ca3=new Catedra("Fisica II","code",2,"F2");
        Catedra ca4=new Catedra("Analisis numerico y calculo avanzado","code",3,"ANyCA");
        ListaCatedra industrial=new ListaCatedra();
        industrial.addFirst(ca4);
        industrial.addFirst(ca3);
        //defino las tres categorias y las meto en un array para mostrarlas despues
        Categoria cc1=new Categoria("Titular","Titular");
        Categoria cc2=new Categoria("Adjunto","Adjunto");
        Categoria cc3=new Categoria("JTP","Jefe de Trabajos Practicos");
        Categoria[] categorias = new Categoria[3];
        categorias[0]=cc1;
        categorias[1]=cc2;
        categorias[2]=cc3;
        //creo carreras relacionadas a la facultad y meto a la lista
        //a las carreras no hay que agregarlas a una lista aparte, hay que agregarlas a la lista de ESA facultad
        Carrera c1 = new Carrera("Ingenieria en sistemas de informacion", "ISI",sistemas);
        Carrera c2 = new Carrera("Ingenieria industrial", "II",industrial);
        c1.setCatedras(sistemas);
        c2.setCatedras(industrial);
        ListaCarrera l2 = new ListaCarrera();
        l2.addFirst(c2);
        l2.addFirst(c1);
        //creo catedras relacionadas a la carrera y meto en la lista
                //creo facultad, sesion y usuario y cargo la facultad a la lista
        Facultad f1 = new Facultad("FRC", "Facultad Regional Cordoba",l2);
        f1.setCarreras(l2);
        Usuario u = new Usuario("admin", "admin", f1);
        Sesion s = new Sesion(u);
        gec.setSesionActiva(s);
        ListaFacultades l1 = new ListaFacultades();
        l1.addFirst(f1);

        
//
//        gec.setCarreras(l2);
//        gec.setCatedras(l3);
        
//        Concurso c= new Concurso();//esto esta como el ojete
        int carrera=0;
        int catedra=0;
        CargoLlamado cadjunto;
        CargoLlamado cjtp;
        CargoLlamado ctitular;
        Calendar Ins=null;
        Calendar Rea=null;
        ArrayList<CargoLlamado> cargos=new ArrayList<CargoLlamado>();
        String[] catedrasCarrera;
        Concurso nuevo;
        
        
        
        
        
        
        //falta setear todos los atributos del gestor
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //MAIN
        int opc;
        do {
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
 
            System.out.println("Registrar convocatoria Docente");
            System.out.println("1.Seleccionar carrera");//falta arreglar
            System.out.println("2.Seleccionar catedra");//falta arreglar
            System.out.println("3.Ingresar cantidad de cargos por categoria, en caso de no haber, escriba '0'");
            System.out.println("4.Ingrese fecha estimada de inscripcion y realizacion de concurso");
            System.out.println("5.Crear convocatoria");
            System.out.println("6.Salir");

            opc=In.readInt();
            switch(opc){
                
                
                
                
                
                
                case 1: // CORREGIDO
                    System.out.println("El usuario logueado: " +gec.obtenerSesion().obtenerNombreUsuarioLogueado()+" pertenece a la facultad: " + gec.obtenerSesion().obtenerFacultad().mostrarNombre());
                    System.out.println("Las carreras disponibles son las siguientes, seleccione la deseada:");
                    String[] carreras=gec.buscarCarreras();//muestro todas las carreras para la facultad (corregido)
                    for (int i = 0; i < carreras.length; i++) 
                    {
                        System.out.println((i+1)+"-"+carreras[i]);
                    }
                    carrera=In.readInt();
                    gec.setFacultad(gec.obtenerSesion().obtenerFacultad());
                    gec.setCarrera(gec.obtenerSesion().obtenerFacultad().getCarreras().getNodeByIndex(carrera - 1));

                    break;         
                    
                    
                case 2:
                    //mostrar las catedras y pedir el numero de referencia
                    catedrasCarrera=gec.carrera.buscarCatedras(); //metodo con iterator implementado
                    
                    for (int i = 0; i < catedrasCarrera.length; i++)
                    {
                         System.out.println((i+1)+"-"+catedrasCarrera[i]);
                    }
                    catedra= In.readInt();
                    gec.setCatedra(gec.carrera.getCatedras().getNodeByIndex(catedra - 1));
                    break;
                    
                    
                    
                case 3://mostrar categorias y pedir cantidad de cargos TA COSHEGIDO PESHO
                    for (int i = 0; i < categorias.length; i++) {
                        System.out.println((i+1)+"-"+categorias[i].getNombre());
                        
                    }
                    System.out.println("Ingrese la cantidad de cargos para Titular:");//creo los cargos llamados
                    int titular=In.readInt();
                    System.out.println("Ingrese la cantidad de cargos para Adjunto:");
                    int adjunto=In.readInt();
                    System.out.println("Ingrese la cantidad de cargos para JTP:");
                    int JTP=In.readInt();
                    
                    
                    //CAMBIAR
                    //que el arraylist de cargos llamados se cree en EL GESTOR para evitar la creacion 
                    //vacia del concurso y luego se lo pase por parametro para la creacion completa la final
                    //hola
                    //c.setCargos(new ArrayList<CargoLlamado>());
                    if (titular!=0) {//si no pide cargos para alguna catego, el cargo llamado no se crea
                        ctitular = new CargoLlamado(cc1,titular); //constructor que recibe una categoria y la cantidad de puestos
                        cargos.add(ctitular); //lo agrego al arraylist de cargos
                        //c.addCargoLlamado(ctitular);
                    }
                    if (adjunto!=0) 
                    {
                        cadjunto = new CargoLlamado(cc2,adjunto);
                        cargos.add(cadjunto);
                        //c.addCargoLlamado(cadjunto);
                    }
                    if (JTP!=0)
                    {
                        cjtp = new CargoLlamado(cc3,JTP);
                        cargos.add(cjtp);
                        //c.addCargoLlamado(cjtp);
                    }
                    gec.setCargos(cargos);
                                       
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                //C A S E 4 ESTA OK
                case 4://fecha estimada inscripcion, fecha estimada realizacion
                    Calendar now = Calendar.getInstance();//me devuelve la fecha actual en gregoryan calendar
                    
                    int a=1;
                    do   
                    {
                        if(a==2)System.out.println("Alguna o ambas de las fechas ingresadas son anteriores al dia de hoy,o la fecha de realizacion es anterior a la de inscripicon porfavor ingrese las fechas nuevamente: ");         
                        
                        System.out.println("Ingrese el dia de la fecha estimada de inscripcion");
                        int diaIns=In.readInt();
                        System.out.println("Ingrese el mes de la fecha estimada de inscripcion");
                        int mesIns=In.readInt();
                        Ins = new GregorianCalendar();
                        Ins.set(2017, (mesIns), diaIns);
                        gec.setFechaEstimadaInscripcion(Ins);
                        //esto sirve por si hay que pasar a String
                        System.out.println("Ingrese el dia de la fecha estimada de realizacion");
                        int diaRea=In.readInt();
                        System.out.println("Ingrese el mes de la fecha estimada de realizacion");
                        int mesRea=In.readInt();
                        Rea=new GregorianCalendar();
                        Rea.set(2017,(mesRea),diaRea);   
                        gec.setFechaEstimadaRealizacion(Rea);
                        gec.setFechaCreacion(now);
                        a=2;

                    }while(!(Rea.after(now) && Ins.after(now) && Rea.after(Ins)));
                    System.out.println("Su carga de fecha ha sido exitosamente. ");
                    break; 
                    
                    
                    
                    
                    
                    
                    
                    
                    
             case 5://creacion seteo de estado y muestra

                    nuevo=gec.registrarNuevaConvocatoria();
                    //c.setFechaCreacion(now);
                   // c.setCarrera(l2.getNodeByIndex(carrera - 1));
                    //c.setCatedra(l3.getNodeByIndex(catedra - 1));
                   // c.setFechaEstimadaConvocatoriaInscripcion(Ins);
                    //c.setFechaEstimadaRealizacion(Rea);
                    //c.setUsuarioCreador(u);
                    //c.setFacultad(f1);
                  //  EstadoConcurso est= new Definido();
                    //nuevo.tomarEstadoConcurso(est);
                    System.out.println(nuevo.toString());
                     //esto de abajo hay que ponerlo en el toString de Concurso para que muestre los cargos del arreglo
//                    System.out.println(nuevo.mostrarCargosLlamados(nuevo));
                    
                    
//                    Object ret[]= nuevo.getCargos().toArray();
//                    System.out.println("///////////////////////////////////////////////////////////");
//                    for (int i = 0; i < ret.length; i++) 
//                    {
//                        System.out.println(ret[i].toString());
//                    }
//                    System.out.println("///////////////////////////////////////////////////////////");
                    break;
            }
        } while (opc != 6);
    }

}
