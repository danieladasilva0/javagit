/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.jogodeadivinhacao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class JogoDeAdivinhacao {
 public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = random.nextInt(20) + 1;
        int palpite;
        int tentativas = 0;

        do {
            System.out.print("Digite um número entre 1 e 20: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSorteado) {
                System.out.println("O número é menor. Tente novamente.");
            } else if (palpite < numeroSorteado) {
                System.out.println("O número é maior. Tente novamente.");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
    }
    
    }
