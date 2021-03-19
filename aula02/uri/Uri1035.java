package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        int  a, b, c, d;
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        //System.out.println("Entre com o valor A ");
        a = teclado.nextInt();
        //System.out.println("Entre com o valor B ");
        b = teclado.nextInt();
        //System.out.println("Entre com o valor C ");
        c = teclado.nextInt();
        //System.out.println("Entre com o valor D ");
        d = teclado.nextInt();

        //processamento
        if ((b > c) && (d > a) && ((c + d) > (a + b)) && ((c > 0) && (d > 0)) && ((a % 2 ) == 0)) {
            System.out.println("Valores aceitos");
        }else { 
            System.out.println("Valores nao aceitos");
        }
 

teclado.close();

    }
}
