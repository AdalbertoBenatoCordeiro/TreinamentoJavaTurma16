package uri;

import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int p1, qtde1, p2, qtde2;
        double custo1, custo2, valor;
        //System.out.println("Digite um número");
        p1 = teclado.nextInt();
        qtde1 = teclado.nextInt();
        custo1 = teclado.nextDouble();
        p2 = teclado.nextInt();
        qtde2 = teclado.nextInt();
        custo2 = teclado.nextDouble();

        valor = ((qtde1 * custo1) + (qtde2 * custo2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
        System.out.println("peças solicitadas - " + p1 + " - " + p2);

        teclado.close();

    }
}