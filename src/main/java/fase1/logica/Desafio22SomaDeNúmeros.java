package fase1.logica;

import java.util.Scanner;

public class Desafio22SomaDeNúmeros {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Informe um número: ");
            int num1 = sc.nextInt();
            int total = 0;

            for (int i = 1; num1 >= i; i++) {
                total += i;
                System.out.print(" + " + i);
            }
            System.out.println(" = " + total);

        }
    }

}
