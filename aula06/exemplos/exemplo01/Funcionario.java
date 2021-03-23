package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0;
    }

    public Funcionario() { // construtor padrão ou default

    }

    public String exibir() {
        return nome + " : " + salario;
    }

    public void calculaNovoSalario(double percAumento) {
        if (salario > 0) {
            salario = (salario * (percAumento / 100)) + salario;
        } else {
            System.out.println("Salario informado inválido");
        }
    }

    @Override
    public String toString() {
        return nome + " : " + salario;

    }

}