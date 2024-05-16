/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class TrabajoPractico2 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        TablaDispersa tabla = new TablaDispersa(97);
        int op=0;
        do{
            System.out.println("Menu");
            System.out.println("1: Insertar un socio");
            System.out.println("2: Buscar un socio");
            System.out.println("3: Eliminar un socio");
            System.out.println("4: Salir");
             op=scanner.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese el numero del socio");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    while(numero<101||numero>1999){
                        System.out.println("Ingrese un numero que este en el rango de 101 a 1999");
                        numero=scanner.nextInt();
                    }
                    System.out.println("ingrese la edad del socio");
                    int edad=scanner.nextInt();
                    System.out.println("Ingrese el nombre del socio");
                    scanner.nextLine();
                    String nombre=scanner.nextLine();
                    System.out.println("Ingrese el sexo del socio (M/F)");
                    String genero=scanner.nextLine();
                    System.out.println("Ingrese la fecha que se dio de alta el socio");
                    String fecha;
                    fecha=scanner.nextLine();
                    Socio nuevoSocio=new Socio(numero,nombre,edad,fecha,genero);
                    tabla.insertar(nuevoSocio);
                    break;
                case 2:
                    System.out.println("Ingrese el codigo para buscar socio");
                    numero=scanner.nextInt();
                    tabla.buscar(numero);
                    break;
                case 3:
                    System.out.println("Ingrese el codigo para eliminar socio");
                    numero=scanner.nextInt();
                    tabla.eliminar(numero);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones anteriores");
            }
        }while(op!=4);
        
       
    }
}

