/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.validacaodedados;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class ValidacaoDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 100);

        System.out.println("Número validado: " + numero);
    }
}
