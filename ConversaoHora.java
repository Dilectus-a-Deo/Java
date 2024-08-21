import java.util.Scanner;

public class ConversaoHora {

// Função para converter a notação de 24 horas para 12 horas
    
public static String convertePara12Horas(int hora, int minuto) {
        String periodo;
        if (hora >= 12) {
            periodo = "P";
            if (hora > 12) {
                hora -= 12;
            }
        } else {
            periodo = "A";
            if (hora == 0) {
                hora = 12;
            }
        }
        return String.format("%02d:%02d %s.M.", hora, minuto, periodo);
    }

// Função para exibir o resultado
    
public static void exibeResultado(String horaConvertida) {
        System.out.println("Hora convertida: " + horaConvertida);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minuto = scanner.nextInt();

            String horaConvertida = convertePara12Horas(hora, minuto);
            exibeResultado(horaConvertida);

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
