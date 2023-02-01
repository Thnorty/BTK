import java.util.Scanner;

public class InputsWithLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // boolean exit = false;
        // int number = 0;
        // while (!exit) {
        //     System.out.println("Bir sayi gir: ");
        //     int input = keyboard.nextInt();
        //     if (input == 0) {
        //         break;
        //     }
        //     number = number + input;
        //     System.out.println("Yeni sayi: " + number);
        // }

        // for (int i = 0; i < 6; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // while (true) {
        //     System.out.println("Bir metin gir: ");
        //     String text = keyboard.nextLine();
        //     if (text.equals("q")) {
        //         break;
        //     }
        //     for (int i = text.length() - 1; i >= 0; i--) {
        //         System.out.print(text.charAt(i));
        //     }
        //     System.out.println();
        // }

        // String sesliHarfler = "aAeEuUiIoO";
        // System.out.println("Bir yazi yazin: ");
        // String text = keyboard.nextLine();
        // int sesliSayisi = 0;
        // for (int i = 0; i < text.length(); i++) {
        //     if (sesliHarfler.contains(text.charAt(i) + "")) {
        //         sesliSayisi++;
        //     }
        // }
        // System.out.println("Sesli harf sayisi: " + sesliSayisi);

        System.out.println("Bir yazi girin: ");
        String text = keyboard.nextLine();
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if ('a' <= text.charAt(i) && text.charAt(i) <= 'z'){
                newText += (char)(text.charAt(i) - ('a' - 'A'));
            }
            else if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z'){
                newText += (char)(text.charAt(i) + ('a' - 'A'));
            }
            else {
                newText += text.charAt(i);
            }
        }
        System.out.println(newText);
        keyboard.close();
    }
}