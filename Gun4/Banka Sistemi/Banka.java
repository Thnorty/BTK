public class Banka {
    private String isim;
    private double toplamTL;
    private double toplamUSD;

    public Banka(String isim) {
        toplamTL = 0;
        toplamUSD = 0;
        this.isim = isim;
    }

    public void toplamParaOzeti() {
        System.out.println(isim + " parasi: (TL: " + this.getTL() + ") (USD: " + this.getUSD() + ")");
    }
    
    public void setTL(double para) {
        toplamTL = para;
    }
    
    public void setUSD(double para) {
        toplamUSD = para;
    }

    public double getTL() {
        return toplamTL;
    }

    public double getUSD() {
        return toplamUSD;
    }

    public String getIsim() {
        return isim;
    }
}
