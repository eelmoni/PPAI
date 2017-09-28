/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Sesion {
    private Usuario user;

    public Sesion(Usuario user) {
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    public String obtenerNombreUsuarioLogueado()
    {
        return this.user.getUser();
    }
    public Facultad obtenerFacultad()
    {
        return this.user.getFacultad();
    }
}
