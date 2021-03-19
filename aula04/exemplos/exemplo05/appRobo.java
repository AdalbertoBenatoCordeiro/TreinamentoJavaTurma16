package exemplos.exemplo05;

public class appRobo {
    public static void main(String[] args) {
        Robo robo = new Robo(10, 5, 800, 600);

        int posAtual = robo.getY();
        posAtual = posAtual + 10;

        robo.norte();
        System.out.println("Posição Y atual: " + robo.getY());

    }
}
