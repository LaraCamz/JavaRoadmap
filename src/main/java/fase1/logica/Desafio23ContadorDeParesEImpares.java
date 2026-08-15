package fase1.logica;

import java.util.Scanner;

public class Desafio23ContadorDeParesEImpares {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int totalImpar = 0;
            int totalPares = 0;

            System.out.println("Digite um número inteiro maior que 0: ");
            int num1 = sc.nextInt();
            if (num1 <= 0) {
                System.out.println("Erro: O número deve ser maior que 0.");
                System.exit(0);
            }

            for (int i = 1; i <= num1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " - Par");
                    totalPares++;
                } else {
                    System.out.println(i + " - Impar");
                    totalImpar++;
                }

            }
            System.out.println("Total de pares: " + totalPares);
            System.out.println("Total de impar: " + totalImpar);
        }
    }

}
