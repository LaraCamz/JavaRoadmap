package fase1.logica;
import java.util.Scanner;

public class Desafio08ConversorDeMedidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma distância em metros: ");
        double metros = sc.nextDouble();
        
        double centimetro = metros * 100;
        double milimetro = metros * 1000;
        double quilometro = metros / 1000;
        
        System.out.println("===== CONVERSÃO =====");
        System.out.println();
        System.out.printf("Metros: %.2f m\n", metros);
        System.out.printf("Centímetros: %.2f cm\n", centimetro);
        System.out.printf("Milímetros: %.2f mm\n", milimetro); 
        System.out.printf("Quilômetros: %.3f km\n", quilometro); 
        sc.close();  
    }
}
