package uri;

import java.util.Scanner;

/**
 * Uri1018
 */
public class Uri1018 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor, n100, n50, n20, n10, n5, n2, n1;

    //System.out.println("Digite um número");
    valor = teclado.nextInt();
    
    valor = (valor / 100);

    System.out.println(valor / 3);
    System.out.println(valor % 2); //resto da divisão (faz a divisão e traz o resto)
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
    System.out.println("peças solicitadas - ");

    teclado.close();

}
    
}