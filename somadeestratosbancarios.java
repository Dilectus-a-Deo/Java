import java.util.Scanner;


public class somadeestratosbancarios {


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Dige o número de estrato bancário : ");
            double estrato1 = scanner.nextDouble();
            
            System.out.print("Dige o número de estrato bancário : ");
            double estrato2 = scanner.nextDouble();
            
            double soma = estrato1 + estrato2;
            
            System.out.println("O número total de estratos é: " + soma);
        }
    }
}


