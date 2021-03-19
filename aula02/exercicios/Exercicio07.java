package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;

        System.out.println("Digite seu salário - ");
        salario = teclado.nextDouble();
        if (salario <= 600) {
            System.out.println("Isento de INSS");
        } else {
            if (salario <= 1200) {
                System.out.println("Pagar 20% de INSS");
            } else {
                if (salario <= 2000) {
                    System.out.println("Pagar 25% de INSS");
                } else {
                    System.out.println("Pagar 30% de INSS");
                }
            }
        }
        teclado.close();
    }
}
