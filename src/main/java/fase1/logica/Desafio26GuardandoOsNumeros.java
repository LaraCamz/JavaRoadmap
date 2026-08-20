package fase1.logica;

import java.util.Scanner;

public class Desafio26GuardandoOsNumeros {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Quantos números deseja informar? ");
            int num1 = sc.nextInt();
            int cont = 0;
            //tipo[] nomeVariavel = new tipo[];
            int[] numeros = new int[num1];

            for (int i = 0; i < num1; i++) {
                cont++;
                System.out.println("Número " + cont + ": ");
                int num2 = sc.nextInt();
                numeros[i] = num2;

            }
            System.out.println("Números informados: ");
            for (int i = 0; i < num1; i++) {
                System.out.println(numeros[i]);

            }

        }

    }

}
/*Criando pelo tamanho:
int[] numeros = new int[5];

Criando pelos valores:
int[] numeros = new int[]{10, 20, 30, 40, 50};

Forma simplificada:
int[] numeros = {10, 20, 30, 40, 50};
*/