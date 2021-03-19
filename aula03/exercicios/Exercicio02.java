package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int valor, cont, result;

        //Entrada
        System.out.println("digite um valor - ");
        valor = teclado.nextInt();
        cont = 0;

        while (cont <= 10) {
            result = cont * valor;
           // System.out.println(valor + " x " + cont + " = " + result);
            System.out.printf("%d x %02d = %2d\n", valor, cont, result);//%3.2f - 3 casas para inteiro e duas decimal
            cont++;
        }
teclado.close();
    }
}
