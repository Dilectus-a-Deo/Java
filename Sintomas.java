import java.util.Scanner;

public class Sintomas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o número de sintomas da dengue:");
        int numeroDeSintomas = scanner.nextInt();

        if (numeroDeSintomas >= 6) {
            System.out.println("O indivíduo está com dengue");
        } else {
            System.out.println("O indivíduo não está com dengue");
        }

        scanner.close();
    }
}
