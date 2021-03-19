package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivo, negativo, valor, par, impar;

        positivo = 0;
        negativo = 0;
        valor = 0;
        par = 0;
        impar = 0;

        for (int cont = 1; cont <= 5; cont++) {
            // System.out.printf("digite o %dº número:", cont);
            valor = teclado.nextInt();
            if (valor >= 1) {
                positivo++;
            } else {
                if (valor < 0) {
                    negativo++;
                }
            }
            if (valor % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

        teclado.close();
    }
}
