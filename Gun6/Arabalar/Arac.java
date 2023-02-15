public class Arac {
    private int tekerSayisi;
    private String aracSahibi = "yok";
    private double maxHiz;
    
    public Arac(int tekerSayisi, String aracSahibi, double maxHiz) {
        this.tekerSayisi = tekerSayisi;
        this.aracSahibi = aracSahibi;
        this.maxHiz = maxHiz;
    }

    public Arac(int tekerSayisi, double maxHiz) {
        this.tekerSayisi = tekerSayisi;
        this.maxHiz = maxHiz;
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public String getAracSahibi() {
        return aracSahibi;
    }

    public double getMaxHiz() {
        return maxHiz;
    }
}
