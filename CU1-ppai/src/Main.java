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
 public static ControladorRegistrarConvocatoria gec=new ControladorRegistrarConvocatoria();;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facultad f1=new Facultad("FRC","La mas piola");
        Facultad f2=new Facultad("FRLR","not available");
        
        ListaFacultades l1=new ListaFacultades();
        l1.addFirst(f1);
        l1.addFirst(f2);
        
        Carrera c1=new Carrera("Ingenieria en sistemas de informacion","La mas piola");
        Carrera c2=new Carrera("Ingenieria industrial","meh");
        ListaCarrera l2=new ListaCarrera();
        l2.addFirst(c2);
        l2.addFirst(c1);
        
        Catedra ca1=new Catedra("Diseño de sistemas","code",3,"DSI");
        Catedra ca2=new Catedra("Ingenieria de software","code",4,"ISW");
        ListaCatedra l3 = new ListaCatedra();
        l3.addFirst(ca2);
        l3.addFirst(ca1);
//        Facultad f1=new Facultad("FRC","La mas piola");
//                Usuario u = new Usuario("admin","admin");
//        u.setFacultad(f1);
//        Sesion s=new Sesion(u);
        //gec.setSesionActiva(s);
        gec.setCarreras(l2);
        gec.setCatedras(l3);

    }
    
}
