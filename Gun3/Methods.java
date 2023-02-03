public class Methods {
    public static void main(String[] args) {
        printHello();
        print("Merhaba");
        int x = sayiToplayici(2, 5);
        System.out.println("x degeri: " + x);
        printNumbersTo(10);
        int y = faktoriyel(5);
        System.out.println("y degeri: " + y);
        int a = 5;
        test(a);
        System.out.println("Metodun disindaki a: " + a);
        System.out.println("Fibonacci sayisi: " + fibonacci(3));
        System.out.println("Euler sayisi: " + eulerSayisi(10));
    }

    public static int fibonacci(int sayi) {
        if (sayi == 1)
            return 0;
        else if (sayi == 2)
            return 1;
        return fibonacci(sayi-1) + fibonacci(sayi-2);
    }

    public static double eulerSayisi(int sayi) {
        if (sayi == 0) {
            return 1.0;
        }
        double faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return 1.0/faktoriyel + eulerSayisi(sayi-1);
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void print(String yazilacak) {
        System.out.println(yazilacak);
    }

    public static int sayiToplayici(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static void printNumbersTo(int sayi) {
        String sonuc = "";
        for (int i = 0; i < sayi; i++) {
            sonuc += i + ", ";
        }
        sonuc = sonuc.substring(0, sonuc.length() - 2);
        System.out.println(sonuc);
    }

    public static int faktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void test(int a) {
        a = a+2;
        System.out.println("Metodun icindeki a: " + a);
    }
}