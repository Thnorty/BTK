public class BMW extends Arac {

    private final String marka = "BMW";

    public BMW(int tekerSayisi, String aracSahibi, double maxHiz) {
        super(tekerSayisi, aracSahibi, maxHiz);
    }

    public BMW(int tekerSayisi, double maxHiz) {
        super(tekerSayisi, maxHiz);
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String getAracSahibi() {
        return "Bu BMW'nin sahibi: " + super.getAracSahibi();
    }
}
