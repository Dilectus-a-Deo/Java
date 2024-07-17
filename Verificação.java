import java.util.Scanner;

//#Criando programa 

public class Verificação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//#Inserindo variáveis

        System.out.println("Oii:");
        String mensagem = scanner.nextLine();

//#Inserindo condições 
        
          if (mensagem.equals("Olá")) {
            System.out.println("como vai você!");
        } else if (mensagem.equals("Tchau")) {
            System.out.println("Até mais!");
        } else {
            System.out.println("Mensagem não reconhecida.");
        }

        scanner.close();
    }
}
