/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public interface EstadoConcurso {
     
    public void cancelar();
    public void sustanciar();
    public void presentarEnFacultad();
    public void evaluar();
    public void desertar();
    public void observar();
    public void aprobar();
    public void rechazar();
    public void asignarTribunal();
    public void publicar();
    public void excusar();
    public void recusar();
    public void resolver();
    public String toString();
   
}
