package fase1.logica;
import java.util.Scanner;

public class Desafio16MenuInterativo {

    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)){    
      
          String opcao = "";
          
      while(!"3".equals(opcao)){
          System.out.println("==== MENU ====");
          System.out.println("1 - Dizer Olá");
          System.out.println("2 - Mostrar Data (apenas uma mensagem, sem data real)");
          System.out.println("3 - Sair");
          System.out.println("Escolha uma opção:");
          opcao = sc.next();
          
          switch (opcao) {
              case "1" :
                  System.out.println("Olá!");
                  break;

              case "2" :
                  System.out.println("05/08");
                  break;
                  
              case "3" :    
                  break;
              default :
                  System.out.println("Erro: A opção é inválida, e não existe.");
                  
            }
          }
       }
    }  
}
