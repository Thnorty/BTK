public class Nesne {
    private int x, y;
    public char karakter = 'X';
    public Hayvan hayvan;
    public Yemek yemek;
    
    public Nesne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setNesne(Nesne nesne) {
        if (nesne.getClass() == Hayvan.class) {
            hayvan = (Hayvan) nesne;
        } else {
            yemek = (Yemek) nesne;
        }
    }

    public char getKaraker() {
        if (hayvan != null) 
            return 'H';
        else if (yemek != null) {
            return 'Y';
        } else 
            return 'X';
    }

    public void sifirla() {
        hayvan = null;
        yemek = null;
    }
}
