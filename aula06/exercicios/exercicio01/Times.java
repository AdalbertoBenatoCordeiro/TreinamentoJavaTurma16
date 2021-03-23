package exercicios.exercicio01;

public class Times {
    private String time1, time2;
    private int placarTime1, placarTime2;

    public Times() { // construtor padrão default

    }

    public Times(String time1, String time2) { //construtor com dois times
        this.time1 = time1;
        this.time2 = time2;
    }

    public Times(String time1, int placartime1, String time2, int placarTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.placarTime1 = placartime1;
        this.placarTime2 = placarTime2;
    }

    public String exibir() {
        return time1 + " " + placarTime1 + " X " + placarTime2 + " " + time2;
    }
}
