public class Koyun implements Hayvan {
    public int ayakSayisi;
    public String hayvanTuru = "koyun";

    public Koyun(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    @Override
    public void sesCikar() {
        System.out.println("Meeee");
    }
    public String getHayvanTuru() {
        return hayvanTuru;
    }
    public int getAyakSayisi() {
        return ayakSayisi;
    }
}
