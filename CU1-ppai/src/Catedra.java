/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Catedra {
 private String nombre;
 private String codigo;
 private int nivel;
 private String sigla;


    public Catedra(String nombre, String codigo, int nivel, String sigla) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nivel = nivel;
        this.sigla = sigla;
    }

    public String mostrarNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String mostrarCatedra() {
        return "Catedra{" + "nombre=" + nombre + ", codigo=" + codigo + ", nivel=" + nivel + ", sigla=" + sigla + '}';
    }
 
    
    
}
