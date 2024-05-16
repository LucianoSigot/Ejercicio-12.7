/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico2;

/**
 *
 * @author lucia
 */
public class Socio {
    private long codigo;
    private String nombre;
    private int edad;
    private String genero;
    private String fecha;

    public Socio(int codigo, String nombre, int edad, String fecha,String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.genero=genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Socio{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", fecha=" + fecha + '}';
    }
    
    
}
