/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class CargoLlamado 
{
    private Categoria catego;
    private int cantidad;
   // private Inscripcion ins;

    public CargoLlamado(Categoria catego, int cantidad) {
        this.catego = catego;
        this.cantidad = cantidad;
    }

    public Categoria getCatego() {
        return catego;
    }

    public void setCatego(Categoria catego) {
        this.catego = catego;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
