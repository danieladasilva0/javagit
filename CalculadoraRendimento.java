/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.calculadorarendimento;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class CalculadoraRendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        do {
            System.out.print("Digite o valor do investimento inicial (P): ");
            double p = scanner.nextDouble();
            System.out.print("Digite a taxa de juros anual (r): ");
            double r = scanner.nextDouble();
            System.out.print("Digite o período de investimento em anos (t): ");
            int t = scanner.nextInt();
            System.out.print("Digite o tipo de capitalização (simples ou composta): ");
            String tipo = scanner.next();
            double m;
            if (tipo.equalsIgnoreCase("simples")) {
                m = p * (1 + (r / 100) * t);
            } else {
                m = p * Math.pow(1 + (r / 100), t);
            }
            System.out.printf("O montante ao final do período é: %.2f\n", m);
            System.out.print("Deseja realizar um novo cálculo? (s/n): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));
        scanner.close();
    }
}

