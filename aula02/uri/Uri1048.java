package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        double salAtual, salNovo, percReajust, valorReaj;
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        //System.out.println("Entre com o valor A ");
        salAtual = teclado.nextDouble();
        
        //processamento
        if ((salAtual >= 0 ) && (salAtual <= 400)) {
            valorReaj = salAtual * 0.15;
            salNovo = salAtual + valorReaj;
            percReajust = 15;
                        
        } else {
            if ((salAtual >400) && (salAtual <= 800)) {
                valorReaj = salAtual * 0.12;
                salNovo = salAtual + valorReaj;
                percReajust = 12;
                
        }else {
            if ((salAtual >800) && (salAtual <= 1200)) {
                valorReaj = salAtual * 0.10;
                salNovo = salAtual + valorReaj;
                percReajust = 10;
    

            }else {
                if ((salAtual >1200) && (salAtual <=2000)) {
                    valorReaj = salAtual * 0.7;
                    salNovo = salAtual + valorReaj;
                    percReajust = 7;
        
                }else {
                    valorReaj = salAtual * 0.4;
                    salNovo = salAtual + valorReaj;
                    percReajust = 4;
                        }
            }
        }
        }
        System.out.println("Novo salario: " + salNovo);
        System.out.println("Reajuste ganho: " + valorReaj);
        System.out.printf("Em percentual: %.0f %%", percReajust);



    teclado.close();
    }
}
