/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico2;

/**
 *
 * @author lucia
 */
public class TablaDispersa {
    static final double R=0.681034;
    private Lista[] tabla;
    private int tamanio;

    public TablaDispersa(int tamanio) {
   
        this.tamanio = tamanio;
        this.tabla = new Lista[tamanio];
        for (int i=0;i<tamanio;i++){
            tabla[i]=new Lista();
        }
    }
    public int dispersar(long codigo){
        double t;
        int v;
        t=R*codigo -Math.floor(R*codigo);
        v=(int)(t*tamanio);
        return v;
    }
    public void insertar(Socio s){
        int posicion;
        posicion=dispersar(s.getCodigo());
        tabla[posicion].insertarElemento(s);
        System.out.println("Socio ingresado correctamente");
    }
    
    public void eliminar(int socio){
        int posicion=dispersar(socio);
        tabla[posicion].eliminarElemento(socio);
        
    }
    
    public void buscar(int socio){
        int posicion=dispersar(socio);
        Socio buscarSocio=tabla[posicion].buscar(socio);
        if(buscarSocio!=null){
            System.out.println("Socio Encontrado:"+buscarSocio);
        }
        else{
            System.out.println("Ese codigo no existe en la lista");
        }
    }
    
    
}
