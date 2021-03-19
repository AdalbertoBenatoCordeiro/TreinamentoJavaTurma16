package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 1; // incialização
        while (cont <= 10) {  // condição que me dá o teste de fim, onde irei parar
            System.out.println(cont);
            //cont++; // cont = cont 1;
            //cont = cont + 2; // contando somente os impares
            cont +=2; // mesmo que cont + 2.  pode utilizar qualquer operador aritimético - "-, +, /, *"
        }

    }
}