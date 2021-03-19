package exemplos.exemplo03;

/**
 * AppPessoa
 */
public class AppPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Adalberto");
        Pessoa p2 = new Pessoa("Amanda");

        //p.nome = "Adalberto";
        p.apresentar();

        //p2.nome = "Amanda";
        p2.apresentar();

    }
}