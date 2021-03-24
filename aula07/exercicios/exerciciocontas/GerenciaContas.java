package exercicios.exerciciocontas;

import java.util.HashMap;

public class GerenciaContas {

    private HashMap<Integer, Conta> hashContas; // <Key, valor> key será numero da conta, valor = Conta

    public GerenciaContas() {
        hashContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        hashContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        hashContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void noovaContaPoupanca(int numeroConta) {
        hashContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta contaEncontrada = hashContas.get(numeroConta); // get busca a conta cuja chave é 'numeroConta'

        if (contaEncontrada != null) {
            if (contaEncontrada.deposito(valor)) {
                return true;
            } else {
                return false;
            }
        }
        return false; // não achou a conta

    }

    public boolean sacar(int numeroConta, double valor) {
        Conta contaEncontrada = hashContas.get(numeroConta); // get busca a conta cuja chave é 'numeroConta'

        if (contaEncontrada != null) {
            if (contaEncontrada.saque(valor)) {
                return true;
            } else {
                return false;
            }
        }

        return false; // não achou a conta

    }

    public String consultarConta(int numeroConta) {
        Conta contaEncontrada = hashContas.get(numeroConta); // get busca a conta cuja chave é 'numeroConta'
        if (contaEncontrada != null) {
            return (contaEncontrada.toString());
        }

        return "Conta não Encontrada";
    }
}
