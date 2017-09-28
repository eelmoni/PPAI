
import In.In;

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

        Facultad f1 = new Facultad("FRC", "Facultad Regional Cordoba");
      //  Facultad f2 = new Facultad("FR", "Facultad Regional");
        Usuario u = new Usuario("admin", "admin", f1);
        Sesion s = new Sesion(u);
        ListaFacultades l1 = new ListaFacultades();
        l1.addFirst(f1);
       // l1.addFirst(f2);

        Carrera c1 = new Carrera("Ingenieria en sistemas de informacion", "ISI",f1);
        Carrera c2 = new Carrera("Ingenieria industrial", "II",f1);
        ListaCarrera l2 = new ListaCarrera();
        l2.addFirst(c2);
        l2.addFirst(c1);

        Catedra ca1 = new Catedra("Diseño de sistemas", "code", 3, "DSI",c1);
        Catedra ca2 = new Catedra("Ingenieria de software", "code", 4, "ISW",c1);
        ListaCatedra l3 = new ListaCatedra();
        l3.addFirst(ca2);
        l3.addFirst(ca1);
        
        Categoria cc1=new Categoria("Titular","Titular");
        Categoria cc2=new Categoria("Adjunto","Adjunto");
        Categoria cc3=new Categoria("JTP","Jefe de Trabajos Practicos");
                
//        Facultad f1=new Facultad("FRC","La mas piola");
//                Usuario u = new Usuario("admin","admin");
//        u.setFacultad(f1);
//        Sesion s=new Sesion(u);
        //gec.setSesionActiva(s);
        gec.setCarreras(l2);
        gec.setCatedras(l3);
        String[] x = gec.buscarCatedras();
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }


        
        
        
        
        
        
        
        
        
        //MAIN
        int opc;
        do {
            System.out.println("Registrar convocatoria Docente");
            System.out.println("1.Seleccionar carrera");
            System.out.println("2.Seleccionar catedra");

            opc=In.readInt();
            switch(opc){
                case 1:
                                System.out.println("El usuario logueado:" +u.getUser()+" pertenece a la facultad:" + u.getFacultad().mostrarNombre());
            System.out.println("Las carreras disponibles son las siguientes, seleccione la deseada:");
            String[] carreras=gec.buscarCarreras();
            for (int i = 0; i < carreras.length; i++) {
                System.out.println((i+1)+"-"+carreras[i]);
            }
            String carrera=In.readString();
                    break;
                case 2:
                    
                    break;
            }
            
            
            
            
            
            opc = In.readInt();
        } while (opc != 7);

    }

}
