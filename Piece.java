public class Piece {
    int xPosition;
    int yPosition;
    boolean inGame;
    boolean dama;

    public Piece(int x, int y, boolean in, boolean dama) {
        this.xPosition = x;
        this.yPosition = y;
        this.inGame = in;
        this.dama = dama;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public boolean isDama() {
        return dama;
    }

    public void setDama(boolean dama) {
        this.dama = dama;
    }
}
