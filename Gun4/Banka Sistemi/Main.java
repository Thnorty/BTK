public class Main {
    public static void main(String[] args) {
        Banka pcBank = new Banka("pcBank");
        Banka itBank = new Banka("itBank");

        Insan ahmet = new Insan(pcBank, "ahmet");
        Insan ayse = new Insan(itBank, "ayse");

        ahmet.calis();
        ayse.calis();
        ayse.calis();
        ayse.yurtDisindaCalis();

        ahmet.toplamParaOzeti();
        ayse.toplamParaOzeti();
        
        ahmet.dolarAl(50);
        ahmet.toplamParaOzeti();
        ahmet.parolaDegistir();
        ahmet.dolarAl(50);
        ahmet.toplamParaOzeti();
        ayse.liraAl(50);
        ayse.toplamParaOzeti();

        // Insan.paraAktarTL(ahmet, ayse, 100);
        // ahmet.toplamParaOzeti();
        // ayse.toplamParaOzeti();
        
        pcBank.toplamParaOzeti();
        itBank.toplamParaOzeti();
    }
}