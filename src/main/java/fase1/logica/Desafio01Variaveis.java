package fase1.logica;
import java.util.Scanner;

public class Desafio01Variaveis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o seu usuário: ");
        String nome = sc.next();
        
        System.out.println("Olá, " + nome + "!");
        System.out.println("Bem-vinda ao Java.");
        
          sc.close();
    }
}