import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int total = 0;

        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                total = total + numero;
            }
        }

        System.out.println("Total dos números positivos: " + total);
    }
}
