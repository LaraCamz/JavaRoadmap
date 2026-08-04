package fase1.logica;
import java.util.Scanner;

public class Desafio07ConversordeMoedas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor em reais:");
        double reais = sc.nextDouble();
        System.out.println("Informe a cotação do dólar:");
        double cotacao = sc.nextDouble();
        
        double dolar = reais / cotacao;
        
        System.out.println();
        System.out.printf("R$ %.2f equivalem a US$%.2f", reais, dolar);
    }
}
