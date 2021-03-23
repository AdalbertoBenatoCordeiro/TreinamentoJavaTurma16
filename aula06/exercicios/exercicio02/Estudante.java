package exercicios.exercicio02;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone); // chamada ao construtor de pessoas
        this.curso = curso;

    }

    @Override
    public String toString() {
        return super.toString() + " " + curso;
    }
}
