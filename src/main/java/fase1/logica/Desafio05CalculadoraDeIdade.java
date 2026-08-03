package fase1.logica;

import java.util.Scanner;

public class Desafio05CalculadoraDeIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu ano de nascimento: ");
        int anoNasc = sc.nextInt();
        System.out.println("Qual é o ano atual? ");
        int anoAtual = sc.nextInt();
        int idade = anoAtual - anoNasc;
        
        System.out.println();
        System.out.println("Você tem " + idade + " anos");
        System.out.println();
        idade = idade + 10;
        System.out.println("Em 10 anos você terá: " + idade);
        sc.close();
    }
    
}
