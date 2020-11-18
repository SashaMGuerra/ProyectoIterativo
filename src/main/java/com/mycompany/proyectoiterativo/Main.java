/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoiterativo;

import java.util.Scanner;

/**
 * Este programa solicita al usuario un número y muestra por pantalla si es divisible entre números comprendidos entre el 2 y el 12. 
 * @author Sasha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n;
        System.out.println("Introduzca número positivo: ");
        n=teclado.nextInt();
        while(n<=0){
            System.out.println("Introduzca número positivo: ");
            n=teclado.nextInt();
        }
        
        for(int i=2;i<=12 && i<n;i++){
            if(n%i==0){
                System.out.println("Es divisible entre "+i);
            }
        }
    }
    
}
