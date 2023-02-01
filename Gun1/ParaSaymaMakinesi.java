import java.util.Scanner;

public class ParaSaymaMakinesi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir sayi gir: ");
        int number = keyboard.nextInt();
        int birKurus, besKurus, onKurus, yirmiBesKurus, elliKurus;
        elliKurus = number / 50;
        number = number % 50;

        yirmiBesKurus = number / 25;
        number = number % 25;

        onKurus = number / 10;
        number = number % 10;

        besKurus = number / 5;
        number = number % 5;

        birKurus = number / 1;
        number = number % 1;
        System.out.println("Elli kurus sayisi: " + elliKurus);
        System.out.println("Yirmi bes kurus sayisi: " + yirmiBesKurus);
        System.out.println("On kurus sayisi: " + onKurus);
        System.out.println("Bes kurus sayisi: " + besKurus);
        System.out.println("Bir kurus sayisi: " + birKurus);

        
        // System.out.println("Bir sayi gir: ");
        // int number = keyboard.nextInt();
        // int birKurus, besKurus, onKurus, yirmiBesKurus, elliKurus;
        // elliKurus = number / 50;

        // yirmiBesKurus = number / 25;

        // onKurus = number / 10;

        // besKurus = number / 5;

        // birKurus = number / 1;
        // System.out.println("Elli kurus sayisi: " + elliKurus + "\n" + "Yirmi bes kurus sayisi: " + yirmiBesKurus + "\n" + "On kurus sayisi: " + onKurus + "\n" + "Bes kurus sayisi: " + besKurus + "\n" + "Bir kurus sayisi: " + birKurus);
        keyboard.close();
    }
}