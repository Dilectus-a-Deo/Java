    //Defindo Classe
public class containvestimento {
    private double saldo;
    private double taxaJuros;

    // Construtor
    public containvestimento(double saldoInicial, double taxaJuros) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    // Método para adicionar juros
    public void adicioneJuros() {
        saldo += saldo * (taxaJuros / 100);
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }
}
