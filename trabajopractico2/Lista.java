/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Lista {
    private Elemento primero;
    Scanner scanner=new Scanner(System.in);

    public Lista() {
        this.primero = null;
    }
    
    public void insertarElemento(Socio s){
        Elemento nuevoElemento=new Elemento(s);
        nuevoElemento.sgte=primero;
        primero=nuevoElemento;
    }
    public void eliminarElemento(int e){
        if(primero==null){
            System.out.println("La lista esta vacia");
            return;
        }
        if(primero.sociop.getCodigo()==e){
            System.out.println("El socio se econtro cuyo codigo es:"+e+"¿esta seguro que quiere eliminarlo?");
            System.out.println("1 para si o 0 para no");
            int op =scanner.nextInt();
            if(op==0){
                System.out.println("No se elimino el Socio");
                return;
            }
            primero=primero.sgte;
            return;
        }
        Elemento anterior =primero;
        Elemento actual=primero.sgte;
        while(actual!=null &&actual.sociop.getCodigo()!=e){
            anterior=actual;
            actual=actual.sgte;
        }
        if(actual!=null){
            System.out.println("El socio se econtro cuyo codigo es:"+e+"¿esta seguro que quiere eliminarlo?");
            System.out.println("1 para si o 0 para no");
            int op=scanner.nextInt();
            if(op==0){
                System.out.println("No se elimino el Socio");
                return;
            }
            anterior.sgte=actual.sgte;
        }else {
            System.out.println("El socio con el codigo"+e+"no se encuentra en la lista");
            }
        }
    public Socio buscar(int c){
        Elemento actual =primero;
       while(actual!=null){
           if(actual.sociop.getCodigo()==c){
               return actual.sociop;
               
           }
           actual=actual.sgte;
       }
       return null;
    }
        
        
    }
    

