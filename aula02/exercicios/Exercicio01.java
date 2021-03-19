package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, calc;

        System.out.println("digite um número - ");
        numero = teclado.nextInt();

        if (numero > 20) {
            calc = numero / 2;
            System.out.println("Resultado - " + calc);
        }
teclado.close();

    }
}
