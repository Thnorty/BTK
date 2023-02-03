public class Ogrenci extends Insan {
    private String isim;
    private int numara;

    public Ogrenci(String isim, int numara) {
        super(isim);
        this.isim = isim;
        this.numara = numara;
    }

    public String ogrencininIsmi() {
        return isim;
    }

    public int ogrencininNumarasi() {
        return numara;
    }

    public void publicMetodaGidis() {
        super.publicMetot();
    }
}
