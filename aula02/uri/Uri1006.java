package uri;

import java.util.Scanner;

public class Uri1006 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, media;
        //System.out.println("Digite um número");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        media = (((a*2) + (b*3) + (c*5)) /10);


        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();  

    }
    
}
