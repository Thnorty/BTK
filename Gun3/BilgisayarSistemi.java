public class BilgisayarSistemi {
    public static void main(String[] args) {
        Bilgisayar laptop = new Bilgisayar("i9", "RTX 3060", 16, 512, 2);
        laptop.ozellikler();
        System.out.println("---------------------");
        Bilgisayar masaustu = new Bilgisayar("i9", "RTX 4090", 64, 2048, 0);
        masaustu.ozellikler();
        System.out.println("---------------------");
        Bilgisayar.ramiKarsilastir(laptop, masaustu);
        System.out.println("---------------------");
        laptop.ramiKarsilastir(masaustu);
    }
}
