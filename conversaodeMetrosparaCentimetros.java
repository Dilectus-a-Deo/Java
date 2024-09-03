
import java.util.Scanner;

public class conversaodeMetrosparaCentimetros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor em metros: ");
            double metros = scanner.nextDouble();
            double centimetros = metros * 100;
            System.out.println(metros + " metros é igual a " + centimetros + " centímetros. ");
        }
    }
}
