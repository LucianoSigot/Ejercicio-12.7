/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico2;

/**
 *
 * @author lucia
 */
public class Elemento {
    Socio sociop;
    Elemento sgte;

    public Elemento(Socio e) {
        this.sociop=e;
        this.sgte=null;
    }
    public Socio getSocio(){
        return sociop;
        }
    
}
