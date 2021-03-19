package exercicios.exercicio05;

import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        Ebook e1 = new Ebook(100, 11, "Adalberto", "Programção Java");
        int pagina;
        Scanner teclado = new Scanner(System.in);
        e1.exibirPagina();

        System.out.println("Digite uma página -");
        pagina = teclado.nextInt();
        e1.irParaPagina(pagina);
        e1.exibirPagina();
        System.out.println("pagina - " + e1.exibirPagina());

        e1.mostrarCapa();
        e1.avancarPagina();

        teclado.close();
    }
}
