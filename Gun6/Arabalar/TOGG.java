public class TOGG extends Arac {

    private final String marka = "TOGG";

    public TOGG(int tekerSayisi, String aracSahibi, double maxHiz) {
        super(tekerSayisi, aracSahibi, maxHiz);
    }

    public TOGG(int tekerSayisi, double maxHiz) {
        super(tekerSayisi, maxHiz);
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String getAracSahibi() {
        return "Bu TOGG'un sahibi: " + super.getAracSahibi();
    }
}
