public class Tavsan implements Hayvan {
    public int ayakSayisi;
    public String hayvanTuru = "koyun";

    public Tavsan(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
    
    @Override
    public void sesCikar() {
        System.out.println("Bilmiyorum");
    }
    public String getHayvanTuru() {
        return hayvanTuru;
    }
    public int getAyakSayisi() {
        return ayakSayisi;
    }
}
