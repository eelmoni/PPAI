
import In.In;
import java.text.SimpleDateFormat;
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

    ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo facultad, sesion y usuario y cargo la facultad a la lista
        Facultad f1 = new Facultad("FRC", "Facultad Regional Cordoba");
        // Facultad f2 = new Facultad("FR", "Facultad Regional");
        Usuario u = new Usuario("admin", "admin", f1);
        Sesion s = new Sesion(u);
        ListaFacultades l1 = new ListaFacultades();
        l1.addFirst(f1);
        // l1.addFirst(f2);
        //creo carreras relacionadas a la facultad y meto a la lista
        Carrera c1 = new Carrera("Ingenieria en sistemas de informacion", "ISI",f1);
        Carrera c2 = new Carrera("Ingenieria industrial", "II",f1);
        ListaCarrera l2 = new ListaCarrera();
        l2.addFirst(c2);
        l2.addFirst(c1);
        //creo catedras relacionadas a la carrera y meto en la lista
        Catedra ca1 = new Catedra("Diseño de sistemas", "code", 3, "DSI",c1);
        Catedra ca2 = new Catedra("Ingenieria de software", "code", 4, "ISW",c1);
        ListaCatedra l3 = new ListaCatedra();
        l3.addFirst(ca2);
        l3.addFirst(ca1);
        //defino las tres categorias y las meto en un array para mostrarlas despues
        Categoria cc1=new Categoria("Titular","Titular");
        Categoria cc2=new Categoria("Adjunto","Adjunto");
        Categoria cc3=new Categoria("JTP","Jefe de Trabajos Practicos");
        Categoria[] categorias = new Categoria[3];
        categorias[0]=cc1;
        categorias[1]=cc2;
        categorias[2]=cc3;


        gec.setCarreras(l2);
        gec.setCatedras(l3);
        

        String carrera;
        int catedra=0;
        CargoLlamado cadjunto;
        CargoLlamado cjtp;
        CargoLlamado ctitular;
        Calendar Ins=null;
        Calendar Rea=null;
        
        String[] catedrasCarrera = gec.buscarCatedras();
        
        //MAIN
        int opc;
        do {
            System.out.println("Registrar convocatoria Docente");
            System.out.println("1.Seleccionar carrera");
            System.out.println("2.Seleccionar catedra");
            System.out.println("3.Ingresar cantidad de cargos por categoria, en caso de no haber, escriba '0'");
            System.out.println("4.Ingrese fecha estimada de inscripcion y realizacion de concurso");
            System.out.println("5.Creas convocatoria");
            System.out.println("6.Salir");

            opc=In.readInt();
            switch(opc){
                case 1:
                                System.out.println("El usuario logueado:" +u.getUser()+" pertenece a la facultad:" + u.getFacultad().mostrarNombre());
            System.out.println("Las carreras disponibles son las siguientes, seleccione la deseada:");
            String[] carreras=gec.buscarCarreras();//muestro todas las carreras para la facultad
            for (int i = 0; i < carreras.length; i++) {
                System.out.println((i+1)+"-"+carreras[i]);
            }
            carrera=In.readString();//ingresa por teclado la carrera que eligio, no se como hacer para que use el objeto, bah no me puse, mas facil asi
                    break;
                case 2:
                    for (int i = 0; i < catedrasCarrera.length; i++) {
                         System.out.println((i+1)+"-"+catedrasCarrera[i]);
                    }
                   catedra= In.readInt();
                    break;
                case 3://mostrar categorias y pedir cantidad de cargos
                    for (int i = 0; i < categorias.length; i++) {//muestro las categorias del vector que defini mas arriba
                        System.out.println((i+1)+"-"+categorias[i].getNombre());
                        
                    }
                    System.out.println("Ingrese la cantidad de cargos para Titular:");//creo los cargos llamados
                    int titular=In.readInt();
                    System.out.println("Ingrese la cantidad de cargos para Adjunto:");
                    int adjunto=In.readInt();
                    System.out.println("Ingrese la cantidad de cargos para JTP:");
                    int JTP=In.readInt();
                    if (titular!=0) {//si no pide cargos para alguna catego, el cargo llamado no se crea
                        ctitular=new CargoLlamado(cc1,titular);
                    }
                    if (adjunto!=0) {
                        cadjunto=new CargoLlamado(cc2,adjunto);
   
                    }
                    if (JTP!=0) {
                        cjtp=new CargoLlamado(cc3,JTP);
                    }
                                       
                    break;
                
                case 4://fecha estimada inscripcion, fecha estimada realizacion
                    System.out.println("Ingrese el dia de la fecha estimada de inscripcion");
                    int diaIns=In.readInt();
                    System.out.println("Ingrese el mes de la fecha estimada de inscripcion");
                    int mesIns=In.readInt();
                    Ins = new GregorianCalendar();
                    Ins.set(2017, (mesIns - 1), diaIns);
                    SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd");
                    String formattedIns = format2.format(Ins.getTime());
                    System.out.println("Ingrese el dia de la fecha estimada de realizacion");
                    int diaRea=In.readInt();
                    System.out.println("Ingrese el mes de la fecha estimada de realizacion");
                    int mesRea=In.readInt();
                     Rea=new GregorianCalendar();
                    Rea.set(2017,(mesRea-1),diaRea);   
                    
                    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");//estas dos lineas son para pasar de calendar a String con formato yyyy-mm-dd
                    String formattedRea = format1.format(Rea.getTime());    
                    break; 
             case 5://creacion seteo de estado y muestra
                 Calendar now = Calendar.getInstance();
                    Concurso c = new Concurso(now, l3.getNodeByIndex(catedra - 1), Ins, Rea, u, c2, f1);
                // c.EstadoGenerada();         
                    break;
            }
            
            
            
            
            

        } while (opc != 6);

    }

}
