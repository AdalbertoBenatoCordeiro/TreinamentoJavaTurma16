package exercicios.exercicio03;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) { // construtor default
        this.numero = numero;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return numero + " saldo: " + saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        // this.numero = numero;
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;


    }

}
