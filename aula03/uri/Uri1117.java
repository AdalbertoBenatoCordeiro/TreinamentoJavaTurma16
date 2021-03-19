package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont;
        double notaAluno, mediaAluno;
        cont = 0;
        notaAluno = 0;
        mediaAluno = 0;
        while (cont < 2) {
            // System.out.println("digite a média do aluno: " + aluno);
            notaAluno = teclado.nextDouble();
            if ((notaAluno >= 0) && (notaAluno <= 10)) {
                cont++;
                mediaAluno = mediaAluno + notaAluno;
            } else {
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f\n", mediaAluno / 2);
        teclado.close();

    }
}
