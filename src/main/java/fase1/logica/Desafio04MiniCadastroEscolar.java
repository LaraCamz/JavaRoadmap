package fase1.logica;
import java.util.Scanner;

public class Desafio04MiniCadastroEscolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //entrada de dados
        System.out.println("Informe seu nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe seu curso: ");
        String curso = sc.nextLine();
    
        //exibição de ficha
        System.out.println("===== FICHA DO ALUNO ===== ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Curso: " + curso);
        
        //encerramento
        sc.close();
    }
    
}
