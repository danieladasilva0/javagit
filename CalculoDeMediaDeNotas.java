/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.calculodemediadenotas;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class CalculoDeMediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;
        int quantidadeNotas = 0;
        double nota;
        String continuar;

        do {
            System.out.print("Digite a nota (0 a 10): ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }
    }
}
