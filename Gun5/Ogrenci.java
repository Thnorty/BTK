public class Ogrenci {
    public String isim;
    public int numara;

    public Ogrenci(String isim, int numara) {
        this.isim = isim.toUpperCase();
        this.numara = numara;
    }

    public String toString() {
        return "Isim: " + isim + ", Numara: " + numara;
    }
}
