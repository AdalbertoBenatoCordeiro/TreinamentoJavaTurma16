package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int senha;
        final int SENHAPADRAO = 2002;

        senha = 0;

        do {
            senha = teclado.nextInt();
            if (senha != SENHAPADRAO) {
                System.out.println("Senha Invalida");

            }
        } while (senha != SENHAPADRAO);

        System.out.println("Acesso Permitido");

        teclado.close();
    }

}
