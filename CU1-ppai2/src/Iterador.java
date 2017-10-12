/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author Mati
 */
public interface Iterador {
    
    public NodoCatedra actual();
    public boolean cumpleFiltro();
    public boolean haTerminado();
    public void primero();
    public void siguiente();
    
}
