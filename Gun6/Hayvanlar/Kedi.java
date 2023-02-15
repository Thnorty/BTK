public class Kedi implements Hayvan {
    public int ayakSayisi;
    public String hayvanTuru = "koyun";

    public Kedi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
    
    @Override
    public void sesCikar() {
        System.out.println("Mewo");
    }
    public String getHayvanTuru() {
        return hayvanTuru;
    }
    public int getAyakSayisi() {
        return ayakSayisi;
    }
}
