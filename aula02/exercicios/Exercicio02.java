package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double nota1, nota2, resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a Primeira Nota do aluno - ");
        nota1 = teclado.nextDouble();

        System.out.println("digite a Segunda  Nota do aluno - ");
        nota2 = teclado.nextDouble();

        resultado = (((nota1 * 4) + (nota2 * 6)) / 10);
        System.out.println("Média - " + resultado);

        if (resultado >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        teclado.close();

    }

}