import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class Parola {
    public static void main(String[] args) {
        String authCode = "";
        Random random = new Random();
        PrintWriter output = null;
        try {
            output = new PrintWriter(new File("text.txt"));
        } catch (Exception e) {
            System.out.println("File not found");
        }
        for (int i = 0; i < 6; i++) {
            authCode += random.nextInt(10);
        }
        output.println(authCode);
        output.close();

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Tek seferlik parola?");
            String code = keyboard.nextLine();
            if (code.equals(authCode)) {
                System.out.println("Tek seferlik parola dogru!");
                break;
            }
            System.out.println("Tek seferlik parola yanlis!");
            authCode = "";
            for (int i = 0; i < 6; i++) {
                authCode += random.nextInt(10);
            }
            try {
                output = new PrintWriter(new File("text.txt"));
            } catch (Exception e) {
                System.out.println("File not found");
            }
            output.println(authCode);
            output.close();
        }
        keyboard.close();
    }
}
