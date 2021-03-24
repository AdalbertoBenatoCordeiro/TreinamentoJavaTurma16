package exercicios.exercicio01;

public class Animal {

    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nomeAnimal, String raca, int anoNascimento, String nomeProprietario, String telefone) {
        proprietario = new Proprietario(nomeProprietario, telefone);
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
    }

    public Animal(String nomeAnimal, String raca, int anoNascimento) {
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario("Não Cadastrado", "()XXXXXXXX");
    }

    public Animal(String nomeAnimal, String raca, int anoNascimento, Proprietario proprietario) {
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Animal: " + nome + " raça " + raca + " nascimento " + anoNascimento + " Proprietário: " + proprietario;
    }
}
