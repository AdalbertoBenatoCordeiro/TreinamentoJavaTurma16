package exercicios.exercicio04;

public class Relogio {
    // atributos = características, possui, é
    private int hora, minuto, segundo;

    // construtuor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora); // this = o próprio objeto
        setMinuto(minuto); // this = o próprio objeto
        setSegundo(segundo); // this = o próprio objeto
    }

    // métodos - ação, comportamento
    public void getHora() {
                    System.out.printf("%02d:%02d:%02d", hora, minuto, segundo);
      
    }

    public void setHora(int hora) {
        if (hora > 00 && hora < 23) {
            this.hora = hora;
        }
        System.out.println("hora inválida, reentre com o valor");
    }

    public void setMinuto(int minuto) {
        if (minuto > 00 && minuto < 59) {
            this.minuto = minuto;
        }
        System.out.println("minuto inválido, reentre com o valor");
    }

    public void setSegundo(int segundo) {
        if (segundo > 00 && segundo < 59) {
            this.segundo = segundo;
        }
        System.out.println("minuto inválido, reentre com o valor");
    }

}
