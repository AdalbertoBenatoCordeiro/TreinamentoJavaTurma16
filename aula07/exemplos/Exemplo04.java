package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String digitado;
    
        try{
        System.out.println("Digite um valor inteiro:");
        digitado = entrada.nextLine();
        numero = Integer.parseInt(digitado);
        //numero = entrada.nextInt();

        System.out.println("Você digitou " + numero);
                    
        } catch (InputMismatchException ex) {
            System.out.println("Digitação Inválida");
            System.out.println(ex.getMessage());
            //ex.printStackTrace(); // ==>>> mostra todo os caminhos do erro o trace do erro
        }catch(NumberFormatException ex) {
            System.out.println("Numero Invalido ");
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println("Erro Deu ruim ");
            System.out.println(ex.getMessage());

        }
        finally { // sempre é executado - pode incluir fechamento de conexões, arquivos, DBs e Scanner
            entrada.close();
            System.out.println("encerrando as conexões");

        }
        
        
    }

}
