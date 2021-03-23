package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numeroFuncionarios;

    public Gerente(String nome, double salario, int funcionarios) {
        super(nome, salario); // chamada ao construtor de Funcionário
        numeroFuncionarios = funcionarios;
    }

    @Override // anotação
    public String exibir() {
        return super.exibir() + " Nº de funcionários - " + numeroFuncionarios;
    }

    @Override
    public void calculaNovoSalario(double percAumento) {
        if (percAumento > 0) {
            super.calculaNovoSalario(percAumento + 20);
        } else {
            System.out.println("Salario informado inválido");
        }
    }
}
