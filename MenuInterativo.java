/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.menuinterativo;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Ação de adicionar realizada.");
            } else if (opcao == 2) {
                System.out.println("Ação de remover realizada.");
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}

