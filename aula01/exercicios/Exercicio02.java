package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        // entrada - ler 2 notas
        Scanner entrada = new Scanner(System.in);
        double nota01;
        double nota02;
        double medianota;

        System.out.println("Digite a primeira nota");
        nota01 = entrada.nextDouble();
        System.out.println("Digite a Segunda nota");
        nota02 = entrada.nextDouble();

        // Processamento - calcular a média 
        medianota = (nota01 + nota02)/2;

        // saída - imprimir a média
        System.out.println("A média do Aluno é " + medianota);

        entrada.close();

    }


}
