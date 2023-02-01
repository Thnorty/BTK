import java.util.Scanner;

public class Islemler {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // double x = Math.pow(4, 5);
        // System.out.println(x);

        // Hiponetus
        // double a, b, c;
        // while (true) {
        //     System.out.println("Ucgenin iki kisa kenarini girin: ");
        //     a = keyboard.nextDouble();
        //     b = keyboard.nextDouble();
        //     keyboard.nextLine();
        //     c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        //     System.out.println("Hipotenus: " + c);
        //     System.out.println("Bir daha hesaplamak istiyor musun?(y:yes, n:no)");
        //     String cevap = keyboard.nextLine();
        //     if (cevap.equals("n")){
        //         break;
        //     }
        // }

        double sonuc = hipotenus();
        System.out.println("Son bulunan sonuc: " + sonuc);
        keyboard.close();
    }

    public static double hipotenus() {
        double a, b, c;
        while (true) {
            System.out.println("Ucgenin iki kisa kenarini girin: ");
            a = keyboard.nextDouble();
            b = keyboard.nextDouble();
            keyboard.nextLine();
            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("Hipotenus: " + c);
            System.out.println("Bir daha hesaplamak istiyor musun? (y:yes, n:no)");
            String cevap = keyboard.nextLine();
            if (cevap.equals("n")){
                return c;
            }
        }
    }
}
