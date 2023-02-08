import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Toplama sonucu: " + calculator.toplama(2, 5, 7));
        System.out.println("Cikarma sonucu: " + calculator.cikarma(5, 2.5));
        System.out.println("Faktoriyel sonucu: " + calculator.faktoriyel(5));
        System.out.println("Islem sayisi: " + Calculator.getIslemSayisi());

        Calculator yeniHesapMakinesi = new Calculator();
        System.out.println("Yeni hesap makinesinde toplama sonucu: " + yeniHesapMakinesi.faktoriyel(4));
        System.out.println("Islem sayisi: " + Calculator.getIslemSayisi());

        Dikdortgen dikdortgen = new Dikdortgen(5, 10);
        System.out.println("Bu dikdortgenin cevresi: " + calculator.sekilCevresiniBul(dikdortgen));

        Kare kare1 = new Kare(9);
        System.out.println("Bu karenin cevresi: " + yeniHesapMakinesi.sekilCevresiniBul(kare1));
        System.out.println("Islem sayisi: " + Calculator.getIslemSayisi());

        // System.out.println("Bu seklin cevresi: " + calculator.cevresiniBul());
        // System.out.println("Bu seklin alani: " + calculator.alaniniBul());

        System.out.println("Hangi islem?(Toplama, cikarma)");
        String cevap = scanner.nextLine();
        if (cevap.equalsIgnoreCase("toplama")) {
            System.out.println("Kac sayi ile?(2, 3)");
            int count = scanner.nextInt();
            if (count == 2) {
                int sayi1, sayi2;
                System.out.println(count + " tane sayi gir: ");
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println(sayi1 + " + " + sayi2 + " = " + calculator.toplama(sayi1, sayi2));
            } else if (count == 3) {
                int sayi1, sayi2, sayi3;
                System.out.println(count + " tane sayi gir: ");
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();
                sayi3 = scanner.nextInt();
                scanner.nextLine();
                System.out.println(sayi1 + " + " + sayi2 + " = " + calculator.toplama(sayi1, sayi2, sayi3));
            }
        } else if (cevap.equalsIgnoreCase("cikarma")) {
            System.out.println("Kac sayi ile?(2, 3)");
            int count = scanner.nextInt();
            if (count == 2) {
                int sayi1, sayi2;
                System.out.println(count + " tane sayi gir: ");
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println(sayi1 + " + " + sayi2 + " = " + calculator.cikarma(sayi1, sayi2));
            } else if (count == 3) {
                int sayi1, sayi2, sayi3;
                System.out.println(count + " tane sayi gir: ");
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();
                sayi3 = scanner.nextInt();
                scanner.nextLine();
                System.out.println(sayi1 + " + " + sayi2 + " = " + calculator.cikarma(sayi1, sayi2, sayi3));
            }
        }
        scanner.close();
    }
}