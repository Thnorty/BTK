import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Tahta tahta = new Tahta(5, 5);
        tahta.hayvanEkle();
        tahta.hayvanEkle();
        tahta.hayvanEkle();
        tahta.yemekEkle();
        tahta.yemekEkle();
        do {
            tahta.tahtayiBastir();
            System.out.println("-----------------");
            tahta.tick();
            if (keyboard.nextLine().charAt(0) == 'q')
                break;
        } while (true);
        keyboard.close();
    }
}