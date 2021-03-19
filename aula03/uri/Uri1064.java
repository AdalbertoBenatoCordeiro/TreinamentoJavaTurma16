package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivo;
        double valor,  somaPositivo;

        positivo = 0;
        somaPositivo = 0;

        for (int cont = 1; cont <= 6; cont++) {
            // System.out.printf("digite o %dº número:", cont);
            valor = teclado.nextDouble();
            if (valor > 0) {
                somaPositivo = somaPositivo + valor;
                positivo++;
            }
        }
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", (double) somaPositivo / positivo);
        teclado.close();
    }
}
