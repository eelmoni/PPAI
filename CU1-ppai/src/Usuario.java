/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Usuario {

    
    private Facultad facultad;
    private String user;
    private String pass;

    public Usuario(String user, String pass, Facultad facultad) {
      //  this.facultad = facultad;
        this.user = user;
        this.pass = pass;
        this.facultad=facultad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    @Override
    public String toString() {
        return "Usuario \n " + "facultad=" + facultad + ", user=" + user + ", pass=" + pass ;
    }
}
