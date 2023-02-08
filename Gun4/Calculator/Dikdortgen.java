public class Dikdortgen extends Sekil {
    int kenar1, kenar2;
    public Dikdortgen(int kenar1, int kenar2) {
        super();
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    public int cevre() {
        return (kenar1 + kenar2) * 2;
    }

    public int alan() {
        return kenar1 * kenar2;
    }
}
