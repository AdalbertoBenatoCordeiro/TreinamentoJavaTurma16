package exercicios;

import java.util.Scanner;

public class Exercicio06 {

public static void main(String[] args) {
    
// entrada - ler dados de salario e quilowatts 
    Scanner entrada = new Scanner(System.in);
    double polegadas;
    double pe;
    double jarda;
    double milha;
    double km;


    System.out.println("Digite os quilometros");
    km = entrada.nextDouble();
 
    // Processamento - calcular o valor do carro 
    milha = km * 0.62137; 
    jarda = milha * 1760;
    pe = jarda * 3;
    polegadas = pe * 12;

    // saída - imprimir a as informações
    System.out.printf("O valor de pés é %.2f \n", pe);
    System.out.printf("O valor de Polegadas é %.2f \n", polegadas);
    System.out.printf("O valor de jardas é %.2f \n", jarda);
    System.out.printf("O valor de milhas é %.2f \n", milha);





    entrada.close();
}
}
