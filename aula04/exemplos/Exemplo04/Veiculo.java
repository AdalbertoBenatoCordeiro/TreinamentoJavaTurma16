package exemplos.Exemplo04;

public class Veiculo {
    // atributos = características, possui, é
    private String modelo, marca;
    private double consumo;

    // construtuor
    public Veiculo(String marca, String modelo, Double consumo) {
        this.modelo = modelo; // this = o próprio objeto
        this.marca = marca; // this = o próprio objeto
        setConsumo(consumo); // this = o próprio objeto
    }

    // métodos - ação, comportamento
    public void exibir() {
        System.out.println("veículo é da marca - " + marca + " Modelo - " + modelo);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if (novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }
}
