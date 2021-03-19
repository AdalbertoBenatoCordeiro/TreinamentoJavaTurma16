package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        String resultado;
        int entrada;

        entrada = 8;

        resultado = verificaParImpar(entrada);
        System.out.println(resultado);

        if (verificaPar(entrada)) {
            System.out.println("o número é par");
        } else {
            System.out.println("o número é impar");
        }
    }

    static String verificaParImpar(int n) {

    if ((n % 2) == 0) {
        return "o número é par";

    }else {
        return "o número é impar";
    }
    }
    static boolean verificaPar(int numero) {
    // if(numero % 2 == 0) {
    //     return true;
    // }else{
    //     return false;
    return (numero % 2 == 0);
    }

     

}
