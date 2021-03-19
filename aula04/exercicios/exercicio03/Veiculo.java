package exercicios.exercicio03;

public class Veiculo {
    // atributos = características, possui, é
    String modelo;
    String marca;
    double consumo;

    // construtuor
    Veiculo(String marca, String modelo, Double consumo) {
        this.modelo = modelo; // this = o próprio objeto
        this.marca = marca; // this = o próprio objeto
        this.consumo = consumo; // this = o próprio objeto
    }

    // métodos - ação, comportamento
    void exibir() {
        System.out.println("veículo é da marca - " + marca + " Modelo - " + modelo);
    }

    double obterConsumo() {
        return consumo;
    }

}
