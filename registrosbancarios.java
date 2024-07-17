import java.util.Scanner;

//Inserindo variáveis 

public class registrosbancarios {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Por favor, insira o número de registros : ");
            int registrosbancarios = scanner.nextInt();
            
//#Inserindo condições             
            
            if (registrosbancarios == 4) {
                System.out.println("poucos registros");
            } 
            else if (registrosbancarios == 6) {
                System.out.println("registros medianos");
            }
            else {
                System.out.println("registros a cima dá média ");
            }
        }
    }
}
            
