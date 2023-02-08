public class Kare extends Dikdortgen {
    private int kenar;
    public Kare(int kenar) {
        super(kenar, kenar);
        this.kenar = kenar;
    }

    public int cevre() {
        return kenar*4;
    }

    public int alan() {
        return (int)Math.pow(kenar, 2);
    }
}
