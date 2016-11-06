/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author Ricky
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Ejercicio 3
          int area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero base: ");
        int base = sc.nextInt();
        System.out.println("Numero altura: ");
        int altura = sc.nextInt();
        
        if(base>=0 && altura>=0){
            area = base*altura;
            System.out.println("El area es: " + area);
        } 
         else
            System.out.println("La base y la altura tienen que ser positivos");
    }
    }
   
