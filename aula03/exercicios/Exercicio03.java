package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, result;
        // entrada
        System.out.println("digite o valor do N (limite) - ");
        limite = teclado.nextInt();
        result = 1;

        // processamento

        while (result <= limite) {
           
            if (result <= (limite / 2)) { // se não for o último
               System.out.printf("%d, ", result);
            } else {
                System.out.printf("%d ", result);
            }    
                result *= 2; //result = result * 2;

        }


        teclado.close();

    }
}
