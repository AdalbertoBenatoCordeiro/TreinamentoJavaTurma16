package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senhaFornec;
        final String SENHA_VALIDA = "R10p5";

        System.out.println("Digite sua senha - ");

        senhaFornec = teclado.nextLine();

        if (senhaFornec.equals(SENHA_VALIDA)) {
            System.out.println("acesso concedido");

        } else {
            System.out.println("Acesso negado");
        }

        teclado.close();

    }
}
