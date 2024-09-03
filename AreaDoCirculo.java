
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        System.out.print("Digite o raio do Círculo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio,2);
        System.out.println("A área do círculo é:" + area);

        }
    }
    
}
