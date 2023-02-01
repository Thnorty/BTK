import java.util.Scanner;
public class Sifreleme {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean sifrele = true;

        while (true) {
            System.out.println("Sifreleyim mi sifreyi cozuyum mu?(sifrele, sifreleme)");
            String sifreliMi = keyboard.nextLine();
            if (sifreliMi.equalsIgnoreCase("sifrele")) {
                sifrele = true;
                break;
            } else if (sifreliMi.equalsIgnoreCase("sifreleme")){
                sifrele = false;
                break;
            } else {
                System.out.println("Sifrele veya sifreleme yazmalisiniz");
            }
        }

        System.out.println("Bir metin girin: ");
        String text = keyboard.nextLine();
        String newText = "";

        if (sifrele) {
            for (int i = 0; i < text.length(); i++) {
                if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                    if (text.charAt(i) - 'a' + 3 >= 26) {
                        newText += (char)(text.charAt(i)+3-26);
                    } else {
                        newText += (char)(text.charAt(i)+3);
                    }
                } else if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                    if (text.charAt(i) - 'A' + 3 >= 26) { 
                        newText += (char)(text.charAt(i)+3-26);
                    } else {
                        newText += (char)(text.charAt(i)+3);
                    }
                } else {
                    newText += text.charAt(i);
                }
            }
            System.out.println("Sifreli hali: " + newText);
        } else {
            for (int i = 0; i < text.length(); i++) {
                if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                    if (text.charAt(i) - 'a' - 3 < 0) {
                        newText += (char)(text.charAt(i)-3+26);
                    } else {
                        newText += (char)(text.charAt(i)-3);
                    }
                } else if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                    if (text.charAt(i) - 'A' - 3 < 0) { 
                        newText += (char)(text.charAt(i)-3+26);
                    } else {
                        newText += (char)(text.charAt(i)-3);
                    }
                } else {
                    newText += text.charAt(i);
                }
            }
            System.out.println("Sifresiz hali: " + newText);
        }
        keyboard.close();
    }
}