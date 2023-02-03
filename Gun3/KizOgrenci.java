public class KizOgrenci extends Ogrenci {
    private String isim;
    private int numara;

    public KizOgrenci(String isim, int numara) {
        super(isim, numara);
        this.isim = isim;
        this.numara = numara;
    }

    public String ogrencininIsmi() {
        return "kiz ogrenci: " + isim;
    }
    
}
