import java.util.Scanner;
public class Calculator {
    private static int islemSayisi = 0;
    private Scanner scanner = new Scanner(System.in);

    public double toplama(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 + sayi2;
    }

    public double toplama(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 + sayi2 + sayi3;
    }

    public double cikarma(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 - sayi2;
    }
    
    public double cikarma(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 - sayi2 - sayi3;
    }
    
    public double carpma(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 * sayi2;
    }
    
    public double carpma(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 * sayi2 * sayi3;
    }
    
    public double bolme(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 / sayi2;
    }
    
    public double bolme(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 / sayi2 / sayi3;
    }

    public double faktoriyel(double sayi) {
        if (sayi == 0) {
            islemSayisi++;
            return 1;
        }
        return sayi * faktoriyel(sayi-1);
    }

    public double sekilCevresiniBul(Sekil sekil) {
        islemSayisi++;
        return sekil.cevre();
    }

    public double sekilAlaniniBul(Sekil sekil) {
        islemSayisi++;
        return sekil.alan();
    }

    public double cevresiniBul() {
        islemSayisi++;
        System.out.println("Hangi sekil? (Kare, Dikdortgen)");
        String cevap = scanner.nextLine();
        Sekil sekil;
        int cevre;
        if (cevap.equalsIgnoreCase("kare")) {
            System.out.println("Karenin kenarinin uzunlugu?");
            int kenar = scanner.nextInt();
            scanner.nextLine();
            sekil = new Kare(kenar);
            cevre = sekil.cevre();
        }
        else if (cevap.equalsIgnoreCase("dikdortgen")) {
            System.out.println("Dikdortgenin kenarlarinin uzunluklari?");
            int kenar1 = scanner.nextInt();
            int kenar2 = scanner.nextInt();
            scanner.nextLine();
            sekil = new Dikdortgen(kenar1, kenar2);
            cevre = sekil.cevre();
        }
        else {
            sekil = new Sekil();
            cevre = sekil.cevre();
        }
        return cevre;
    }

    public double alaniniBul() {
        islemSayisi++;
        System.out.println("Hangi sekil? (Kare, Dikdortgen)");
        String cevap = scanner.nextLine();
        Sekil sekil;
        int alan;
        if (cevap.equalsIgnoreCase("kare")) {
            System.out.println("Karenin kenarinin uzunlugu?");
            int kenar = scanner.nextInt();
            scanner.nextLine();
            sekil = new Kare(kenar);
            alan = sekil.alan();
        }
        else if (cevap.equalsIgnoreCase("dikdortgen")) {
            System.out.println("Dikdortgenin kenarlarinin uzunluklari?");
            int kenar1 = scanner.nextInt();
            int kenar2 = scanner.nextInt();
            scanner.nextLine();
            sekil = new Dikdortgen(kenar1, kenar2);
            alan = sekil.alan();
        }
        else {
            sekil = new Sekil();
            alan = sekil.alan();
        }
        return alan;
    }

    public static int getIslemSayisi() {
        return islemSayisi;
    }

}
