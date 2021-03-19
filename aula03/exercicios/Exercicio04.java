package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont, valor, soma;
        cont = 1; // inicialização
        soma = 0;
        valor = 1;

        while (valor != 0) { // != significa diferente
            System.out.printf("digite o %dº número:", cont);
            valor = teclado.nextInt();
            soma = soma + valor;
            cont++;

        }
        System.out.println("Soma = " + soma);
        teclado.close();
    }
}
