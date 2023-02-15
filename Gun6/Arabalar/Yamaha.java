public class Yamaha extends Arac {
    
    private final String marka = "Yamaha";
    
    public Yamaha(int tekerSayisi, String aracSahibi, double maxHiz) {
        super(tekerSayisi, aracSahibi, maxHiz);
    }

    public Yamaha(int tekerSayisi, double maxHiz) {
        super(tekerSayisi, maxHiz);
    }

    
    public String getMarka() {
        return marka;
    }

    @Override
    public String getAracSahibi() {
        return "Bu Yamaha'nin sahibi: " + super.getAracSahibi();
    }
}
