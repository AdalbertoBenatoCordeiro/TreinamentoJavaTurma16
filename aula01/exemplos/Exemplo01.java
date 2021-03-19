package exemplos;

/*
Comentário do Bloco
Autor / Data / Licença

Primeiro Programa em Java do Adalberto


*/

public class Exemplo01 {

    public static void main(String[] args) {
        System.out.print("Olá mundo! ");
        System.out.println("Primeiro \nprograma."); // \n é quebra de linha
        System.out.println(" 2 + 3 ");
        System.out.println( 2 + 3 );
        System.out.println("Resposta = " + 2 + 3 );// o Sinal de + concatena as informações e transforma numero em caractere
        System.out.println("Quanto é 2 + 3?\n" + "Resposta = " + (2 + 3) );// () altera a prioridade de execução
    }
}