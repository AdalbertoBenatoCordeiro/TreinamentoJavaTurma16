package exercicios;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // entrada - ler 2 notas
        Scanner entrada = new Scanner(System.in);
        double salarioatual;
        double salarionovo;

        System.out.println("Digite o seu salário atual");
        salarioatual = entrada.nextDouble();
     
        // Processamento - calcular a média 
        salarionovo = (salarioatual * 1.25);

        // saída - imprimir a média
        System.out.println("Seu salário com o aumento de 25% será - " + salarionovo);

        entrada.close();

    }

}
