
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int totalNotas = 4;
        for(int i = 1; i <= totalNotas; i++){
            System.out.print("Digite a nota do " + i + "° bimestre: ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / totalNotas;
        System.out.println("A média das notas é:"+ media); 
    }
}
