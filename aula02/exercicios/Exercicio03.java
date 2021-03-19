package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float n1, n2;

        System.out.println(" entre com dois números separados por espaço");

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        

        if (n1 < n2) {
            System.out.println(" primeiro número " + n1);
            System.out.println(" segundo número " + n2);

        }else {
            System.out.println(" primeiro número " + n2);
            System.out.println(" segundo número " + n1);

        }
        teclado.close();

    }

}
