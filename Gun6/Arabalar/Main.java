public class Main {
    public static void main(String[] args) {
        Arac arac = new Arac(4, "Oguz", 200);
        System.out.println("Araba1'in teker sayisi: " + arac.getTekerSayisi());
        TOGG togg = new TOGG(6, "Defne", 180);
        System.out.println("TOGG'un teker sayisi: " + togg.getTekerSayisi());
        System.out.println("TOGG'un markasi: " + togg.getMarka());
        BMW bmw = new BMW(4, "Ahmet", 200);
        System.out.println("BMW'nin max hizi: " + bmw.getMaxHiz());
        System.out.println(bmw.getAracSahibi());
        Yamaha yamaha = new Yamaha(2, 250);
        System.out.println(yamaha.getAracSahibi());
    }
}