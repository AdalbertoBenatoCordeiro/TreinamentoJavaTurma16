package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int par, impar, valor, somaPar, total, percImpares;
        double mediaPar;

        impar = 0;
        par = 0;
        percImpares = 0;
        somaPar = 0;
        total = 10;

        for (int cont = 1; cont <= total; cont++) {
            System.out.printf("digite o %dº número:", cont);
            valor = teclado.nextInt();
            if (valor % 2 == 0) {
                par++;
                somaPar = somaPar + valor;
            } else {
                impar++;
            }
        }
        //percImpares = ((impar / total) * 100);
        mediaPar = somaPar / par;

        System.out.println("A média de pares é: " + ((double)mediaPar));
        System.out.println("Percentual de ímpares = " + ((double)(impar / total)) * 100 + "%");

        teclado.close();

    }
}
