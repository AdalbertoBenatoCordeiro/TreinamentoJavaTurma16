package exemplos.Exemplo04;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Mercedes", "C350", -22.5);
        // double consumo;
        // p.nome = "Adalberto";

        v1.setConsumo(12.5);

        v1.exibir();
        System.out.println("Consumo - " + v1.getConsumo());

    }
}
