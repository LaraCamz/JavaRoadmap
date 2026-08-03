package fase1.logica;
import java.util.Scanner;

public class Desafio06ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Celsius: ");
        float celsius = sc.nextFloat();
        float fahren = (celsius * 9 / 5) + 32;
        
        System.out.printf("%.0f°C equivalem a %.1f°F", celsius ,fahren);
        System.out.println();
        sc.close();
    }
}
