/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13.pkg3;

/**
 *
 * @author Sala2-02
 */
public class Nodo {
    private Object dato;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(Object dato, Nodo izquierda, Nodo derecha) {
        this.dato = dato;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Nodo() {
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    /*public Nodo nuevoArbol(Nodo ramaIzquierda, Object dato, Nodo ramaDerecha) {
        return
    }*/
    
    
}
