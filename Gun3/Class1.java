public class Class1 {
    private static int x = 0;
    private static double y = 0;
    private int z = 0;

    public static void print(String string) {
        System.out.println(string);
    }
    public void printNonStatic(String string) {
        System.out.println(string);
    }

    public static int sayiToplayici(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static void setX(int sayi) {
        x = sayi;
    }

    public static int getX() {
        return x;
    }

    public static void setY(double sayi) {
        y = sayi;
    }

    public static double getY() {
        return y;
    }

    public void setZ(int sayi) {
        z = sayi;
    }

    public int getZ() {
        return z;
    }

    public void carpim(int sayi1, int sayi2) {
        System.out.println(sayiCarp(sayi1, sayi2));
    }

    private int sayiCarp(int sayi1, int sayi2) {
        return sayi1*sayi2;
    }

}
