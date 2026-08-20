package fase1.logica;
import java.util.Scanner;

public class Desafio27SomandoOsNumerosArmazenados {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Quantos números deseja informar? ");
            int num1 = sc.nextInt();
            if (num1 <= 0) {
                System.out.println("Erro: O número deve ser maior que zero;");
                return;
            }

            int cont = 0;
            int[] vetor = new int[num1];
            int soma = 0;

            for (int i = 0; i < num1; i++) {
                cont++;
                System.out.println("Número " + cont + ": ");
                int num2 = sc.nextInt();
                vetor[i] = num2;
            }
            System.out.println("===== RESULTADO =====");
            for (int i = 0; i < num1; i++) {
                System.out.println(vetor[i]);
                soma += vetor[i];

            }
            System.out.println("Soma: " + soma);

        }
    }

}
/*Uma última distinção para guardar

Sempre que você olhar para:

vetor

pense:

o conjunto inteiro

Quando olhar:

vetor[i]

pense:

um elemento específico do conjunto, na posição i

E quando olhar:

vetor[i] = num2;

pense:

guardar

Enquanto:

num2 = vetor[i];

seria:

pegar/ler

 */
