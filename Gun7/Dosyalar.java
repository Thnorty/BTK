import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Dosyalar {
    public static void main(String[] args) {
        File dosya = new File("C:/Users/otota/Desktop/BTK/Gun7/text.txt");
        System.out.println(dosya.exists());
        System.out.println(dosya.getAbsolutePath());
        System.out.println(dosya.getName());
        System.out.println(dosya.getParentFile());
        System.out.println(dosya.setLastModified(16766503550000000l));
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(dosya);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        }

        String paragraf = "";
        while (inputStream.hasNextLine())
            paragraf += inputStream.nextLine() + "\n";
        System.out.println(paragraf);
        System.out.println(paragraf.contains("hey"));
        inputStream.close();

        PrintWriter javaOutputStream = null;
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(dosya);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        }
        
        outputStream.print(paragraf);
        
        outputStream.close();

        // for (int i = 0; i < 5; i++) {
        //     File javaDosyasi = new File("Dosyalar.txt");
        //     javaDosyasi.delete();
        // }
        
        // while (true) {
        //     File folder = new File("folder");
        //     folder.delete();
        //     folder.mkdir();
        // }
        
        // ArrayList objects = new ArrayList<>();
        // while(true) {
        //     objects.add(new Excep());
        // }
    }
}
