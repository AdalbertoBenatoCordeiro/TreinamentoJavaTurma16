package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {

        if (getSaldo() >= valor) {
            return super.saque(valor);
        } else {
           return false; // não tem saldo suficiente
            // System.out.println("Operação não realizada");
        }
    }

    @Override
    public boolean deposito(double valor) {
        return super.deposito(valor - TAXA_DEPOSITO);
    }
}
