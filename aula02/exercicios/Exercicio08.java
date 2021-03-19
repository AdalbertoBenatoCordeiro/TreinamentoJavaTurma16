package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        System.out.println("Entre com o lado A do triângulo ");
        a = teclado.nextDouble();
        System.out.println("Entre com o lado B do triângulo");
        b = teclado.nextDouble();
        System.out.println("Entre com o lado C do triângulo");
        c = teclado.nextDouble();

        //processamento

        if ((a > (b + c)) || (b > (a + c)) || (c > (a + b)) ) {
            System.out.println("não foi possível calcular o triângulo");
        } else {
            if ((a == b) && (b == c)){
                System.out.println("Triângulo equilátero");
            } else {
                if ((a == c) || (b == c) || (c == a)){
                System.out.println("Triângulo isósceles");
            }   else {
              System.out.println("Triângulo escaleno");
            }
        }
    }


teclado.close();
    }
}
