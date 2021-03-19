package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int NUMERO_TURMAS = 2;
        final int NUMERO_ALUNOS = 2;
        double mediaAluno, mediaGeral, mediaTurma;

        mediaGeral = 0;

        for (int turma = 1; turma <= NUMERO_TURMAS; turma++) {
            System.out.println("Turma " + turma);
            mediaTurma = 0;
            for (int aluno = 1; aluno <= NUMERO_ALUNOS; aluno++) {
                System.out.println("digite a média do aluno: " + aluno);
                mediaAluno = teclado.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;

            }
            mediaTurma = mediaTurma / NUMERO_ALUNOS;
            mediaGeral = mediaGeral + mediaTurma;

        }
        mediaGeral = mediaGeral / NUMERO_TURMAS;
        System.out.printf("A média geral é " + mediaGeral);
        teclado.close();

    }
}
