package exercicios.exerciciocontas;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if ((getSaldo() + limite) >= valor) {
            return super.saque(valor);
        } else {
           return false; // não tem saldo suficiente
            // System.out.println("Operação não realizada");
        }
    }
    public String toString() {
        return super.toString() + " limite: " + limite;
    }
}
