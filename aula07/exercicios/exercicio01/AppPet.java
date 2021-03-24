package exercicios.exercicio01;

//import java.util.Scanner;

public class AppPet {
 
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);

        //String nomeAnimal, raca, nomeProprietario, telefone;

        Animal a1 = new Animal("Lulu", "Pitbull", 2000, "Carlos", "123456");
        Proprietario p = new Proprietario("Carlos", "1234567");

        System.out.println(a1);
        Animal a2 = new Animal("Lula", "Xaoxao", 2001, p);

       System.out.println(a2);

       Animal a3 = new Animal("Lulua", "xaxao", 2002);

        System.out.println(a3);
    
    }

    

     

}
