package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Times t = new Times();
        Times t1 = new Times("Palmeiras", "São Paulo");
        Times t2 = new Times("Palmeiras", 2, "São Paulo", 0);

        System.out.println(t.exibir());
        System.out.println(t1.exibir());
        System.out.println(t2.exibir());

    }
}
