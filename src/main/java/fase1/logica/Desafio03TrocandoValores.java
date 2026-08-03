package fase1.logica;
import java.util.Scanner;

public class Desafio03TrocandoValores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.println("Antes da troca: ");
        System.out.println("");
        System.out.println("Primeiro: " + num1);
        System.out.println("Segundo: " + num2);
        
        int aux = 0;
        aux = num2;
        num2 = num1;
        num1 = aux;
        
        System.out.println("");
        System.out.println("Depois da troca: ");
        System.out.println("");
        System.out.println("Primeiro: " + num1);
        System.out.println("Segundo: " + num2);
        
        sc.close();
    }
}
