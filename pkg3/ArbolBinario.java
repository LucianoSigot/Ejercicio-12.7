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
public class ArbolBinario{
    private Nodo raiz;

    public ArbolBinario() {
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    boolean esVacio() {
        return raiz==null;
    }
    
    
}
