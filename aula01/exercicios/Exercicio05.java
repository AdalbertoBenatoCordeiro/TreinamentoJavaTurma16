package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        // entrada - ler dados de salario e quilowatts 
        Scanner entrada = new Scanner(System.in);
        double valorCustoFabrica;
        double valorPercentualDistribuidor;
        double impostoPagar;
        double valorConsumidor;

        System.out.println("Digite o valor de fabrica do veículo");
        valorCustoFabrica = entrada.nextDouble();
     
        // Processamento - calcular o valor do carro 
        impostoPagar = valorCustoFabrica * 0.45 ;
        valorPercentualDistribuidor = valorCustoFabrica * 0.28;
        valorConsumidor = valorCustoFabrica + valorPercentualDistribuidor + impostoPagar;

        // saída - imprimir a média
        System.out.println("O valor do veículo é de R$" + valorConsumidor);
        System.out.println("O valor em reais de imposto a pagar é R$" + impostoPagar);



        entrada.close();
    }
}
