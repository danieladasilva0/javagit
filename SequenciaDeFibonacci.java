/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.sequenciadefibonacci;

/**
 *
 * @author danie
 */
public class SequenciaDeFibonacci {

 
     public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        int contador = 0;

        System.out.println(n1);
        System.out.println(n2);

        while (contador < 8) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            contador++;
        }
    }
}
