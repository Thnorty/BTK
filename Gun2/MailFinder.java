import java.util.Scanner;

public class MailFinder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir metin girin: ");
        String metin = keyboard.nextLine();
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == '@') {
                int k, j;
                for (k = i; k >= 0; k--) {
                    if (metin.charAt(k) == ' ') {
                        break;
                    }
                }
                for (j = i; j < metin.length(); j++) {
                    if (metin.charAt(j) == ' ') {
                        break;
                    }
                }
                System.out.println(metin.substring(k+1, j));
                break;
            }
        }
        keyboard.close();
    }
}
