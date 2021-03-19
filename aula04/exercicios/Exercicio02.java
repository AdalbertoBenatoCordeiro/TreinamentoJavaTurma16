package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int resultado;

        resultado = retornaMenor(8, 0, 1);
        System.out.println(resultado);
// Verificar as soluções apresentadas pelo instrutor no exemplo, para ter uma solução mais limpa;
    }
    static int retornaMenor(int n1, int n2, int n3) {
        if (n1 < n2) {
            if (n2 < n3) {
                return n1;
            } else {
                if (n1 < n3) {
                    return n1;
                } else {
                    return n3;
                }
            }
        } else {
            if (n2 < n3) {
                return n2;
            } else {
                return n3;
            }
        }
    }
}
