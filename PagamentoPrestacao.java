import java.util.Scanner;

public class PagamentoPrestacao {

// Função que calcula o valor a ser pago
    
public static double valorPagamento(double valorPrestacao, int diasAtraso) {
        if (diasAtraso > 0) {
            double multa = valorPrestacao * 0.03;
            double juros = valorPrestacao * 0.001 * diasAtraso;
            return valorPrestacao + multa + juros;
        } else {
            return valorPrestacao;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotalPago = 0;
        int quantidadePrestacoes = 0;

        while (true) {
            System.out.print("Digite o valor da prestação (ou 0 para sair): ");
            double valorPrestacao = scanner.nextDouble();
            if (valorPrestacao == 0) {
                break;
            }

            System.out.print("Digite o número de dias em atraso: ");
            int diasAtraso = scanner.nextInt();

            double valorAPagar = valorPagamento(valorPrestacao, diasAtraso);
            System.out.println("Valor a ser pago: " + valorAPagar);

            valorTotalPago += valorAPagar;
            quantidadePrestacoes++;
        }

        System.out.println("Relatório do dia:");
        System.out.println("Quantidade de prestações pagas: " + quantidadePrestacoes);
        System.out.println("Valor total pago: " + valorTotalPago);

        scanner.close();
    }
}
