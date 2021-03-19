package exercicios;
    import java.util.Scanner;

    public class Exercicio04 {
    
        public static void main(String[] args) {
        // entrada - ler dados de salario e quilowatts 
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo;
        double valorQuilowatt;
        double valorPagar;
        double valorComDesc;
        int quilowatt;

        System.out.println("Digite o valor do salário minimo atual");
        salarioMinimo = entrada.nextDouble();
     
        System.out.println("Digite a quantido de quilowatt consumida");
        quilowatt = entrada.nextInt();
     
        // Processamento - calcular a média 
        valorQuilowatt = (salarioMinimo / 500 );
        valorPagar = valorQuilowatt * quilowatt;
        valorComDesc = valorPagar - (valorPagar * 0.15);

        // saída - imprimir a média
        System.out.println("O valor de cada quilowatt é " + valorQuilowatt);
        System.out.println(quilowatt);
        System.out.println("O valor em reais a pagar é R$" + valorPagar);
        System.out.println("O valor a pagar com desconto de 15% é R$" + valorComDesc);



        entrada.close();

    }

}
