package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        double salario, valorParcela, valorPermitido;

        System.out.println(" entre com o salário ");
        salario = teclado.nextDouble();
        System.out.println(" entre com o valor da parcela ");
        valorParcela = teclado.nextDouble();
        
        valorPermitido = salario * 0.3;

        if (valorParcela <= valorPermitido) {
            System.out.println(" Emprestimo Permitido ");

        }else {
            System.out.println(" Emprestimo não Permitido por valor da parcela superior ao limite de 30% " );

        }
        teclado.close();

    }
}
