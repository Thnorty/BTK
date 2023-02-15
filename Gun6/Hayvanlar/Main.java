public class Main {
    public static void main(String[] args) {
        Hayvan[] ciftlik = new Hayvan[10];
        ciftlik[0] = new Koyun(4);
        System.out.println("Bu hayvanin turu: " + ciftlik[0].getHayvanTuru());
        ciftlik[1] = new Tavsan(4);
        System.out.println("Bu hayvanin ayak sayisi: " + ciftlik[1].getAyakSayisi());
        ciftlik[2] = new Kedi(4);

        for (int i = 0; i < ciftlik.length; i++) {
            if (ciftlik[i] != null)
                ciftlik[i].sesCikar();
        }
    }
}