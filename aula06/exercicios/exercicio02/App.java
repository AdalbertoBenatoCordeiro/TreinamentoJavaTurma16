package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Adalberto", "94226-0405");
        Estudante e = new Estudante("Marly", "97618-0233", "Artes");
        Professor pr = new Professor("Emerson", "9292-9292", 5500.00);


        System.out.println(p);
        System.out.println(e);
        System.out.println(pr);
    }

}
