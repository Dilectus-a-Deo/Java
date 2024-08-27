public class Funcionario {
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos para devolver nome e salário
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
