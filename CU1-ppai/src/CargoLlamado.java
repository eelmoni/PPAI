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
    private Categoria categoria;
    private int cantidad;
   // private Inscripcion ins;

    public CargoLlamado(Categoria catego, int cantidad) {
        this.categoria = catego;
        this.cantidad = cantidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cargo Llamado{" + categoria + ", cantidad=" + cantidad + '}';
    }
    
    
}
