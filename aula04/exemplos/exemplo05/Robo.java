package exemplos.exemplo05;

public class Robo {
    private int x, y; // restritos a class robo por estar com private
    private int maxX, maxY;

    public Robo(int x, int y, int maxX, int maxY) {
        this.x = x;
        setY(y);
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void norte() {
        if (y < maxY) {
            y++;

        }
    }

    public int getY() {
        return y;
    }

    public void setY(int novoY) {
        if (novoY >= -maxY && novoY <= maxY) {
            y = novoY;
        }

    }

}
