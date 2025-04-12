/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.somavetor;

/**
 *
 * @author danie
 */

public class SomaVetor {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 7, 1, 8, 3, 6, 4, 9, 10};
        
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        
        System.out.println("A soma dos elementos é: " + soma);
    }
}
