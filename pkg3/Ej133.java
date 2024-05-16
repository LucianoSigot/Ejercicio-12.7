/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13.pkg3;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import ej13.pkg3.ArbolBinario;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 *
 * @author Sala2-02
 */
public class Ej133 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbol;
        Nodo nodoMaria, nodoRodrigo, nodoEsperanza;
        //Stack pila = new Stack();
        List<Nodo> pila = new ArrayList<>();
        
        nodoMaria = new Nodo("Maria",null,null);
        nodoRodrigo = new Nodo("Rodrigo",null,null);
        nodoEsperanza = new Nodo("Esperanza",nodoMaria,nodoRodrigo);
        pila.add(nodoEsperanza);
        
        Nodo nodoAnyora, nodoAbel, nodoJesus;
        
        nodoAnyora = new Nodo("Anyora",null,null);
        nodoAbel = new Nodo("Abel",null,null);
        nodoJesus = new Nodo("M. Jesus",nodoAnyora,nodoAbel);
        pila.add(nodoJesus);
        
        Nodo nodoIzquierdo = (Nodo) pila.remove(0);
        Nodo nodoDerecho = (Nodo) pila.remove(0);
        
        Nodo EsperanzaRaiz = new Nodo("Esperanza", nodoIzquierdo, nodoDerecho);
        
        System.out.println(EsperanzaRaiz.getDerecha().getDato());
        System.out.println(EsperanzaRaiz.getIzquierda().getDato());
         
        
        
    }
    
}
