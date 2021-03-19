package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        double valEnt;
        String intervalo; 
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        //System.out.println("Entre com o valor A ");
        valEnt = teclado.nextDouble();
        
        //processamento
        if ((valEnt >= 0 ) && (valEnt <= 25)) {
            intervalo = "Intervalo [0,25]";
            
        } else {
            if ((valEnt >25) && (valEnt <= 50)) {
            intervalo = "Intervalo (25,50]";
            
        }else {
            if ((valEnt >50) && (valEnt <= 75)) {
                intervalo = "Intervalo (50,75]";
            }else {
                if ((valEnt >75) && (valEnt <=100)) {
                    intervalo = "Intervalo (75,100]";
                }else {
                    intervalo = "Fora de intervalo";
                }
            }
        }
        }
        System.out.println(intervalo);
    teclado.close();
    }
}
