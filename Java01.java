/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Java01 {
    
    public static void main(String[] args) {
        do{
         Scanner cs = new Scanner(System.in);
         
        int n1,n2;
        System.out.print("INGRESE SU OPCION \n 1: SUMA \n 2: RESTA \n Opcion: ");
        String op = cs.next();
        
        if ("1".equals(op)) {
            System.out.print(" \t Suma \nINGRESE NUMERO 1: ");
            n1 = cs.nextInt();
            System.out.print("INGRESE NUMERO 2: ");
            n2 = cs.nextInt();
            
           int sum = n1 + n2;
           
            System.out.println("La suma es: " + sum + "\n");
        }
        else if ("2".equals(op)){
            System.out.print("\t Resta \nINGRESE NUMERO 1: ");
            n1 = cs.nextInt();
            System.out.print("INGRESE NUMERO 2: ");
            n2 = cs.nextInt();
            
           int sum = n1 - n2;
           
            System.out.print("\nLa Resta es: " + sum + "\n");
        }
        else{
            System.out.print("\nOpcion No valida");
        }
    }while(10==10);
    }

}
