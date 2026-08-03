package fase1.logica;
import java.util.Scanner;

public class Desafio02CadastroSimples {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
                                                     
    System.out.println("Informe seu nome: ");
    String nome = sc.nextLine();
    System.out.println("Informe sua idade: ");
    int idade = sc.nextInt();
    sc.nextLine();
    System.out.println("Informe sua cidade: ");
    String cidade = sc.nextLine();
    
    System.out.println("==== Cadastro ====");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade: " + cidade);
    
    sc.close();
 }
}