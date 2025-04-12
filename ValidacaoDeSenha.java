package com.mycompany.project.validacaodesenha;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaUsuario;

        // Loop enquanto a senha estiver incorreta
        while (true) {
            System.out.print("Digite a senha: ");
            senhaUsuario = scanner.nextLine();

            if (senhaUsuario.equals(senhaCorreta)) {
                System.out.println("Acesso concedido");
                break; // Sai do loop
            } else {
                System.out.println("Senha incorreta, tente novamente.");
            }
        }

        scanner.close();
    }
}
