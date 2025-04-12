/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.fatorial;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        int fatorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        
        scanner.close();
    }
}
