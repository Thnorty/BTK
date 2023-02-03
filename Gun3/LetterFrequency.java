import java.util.Scanner;
public class LetterFrequency {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir cumle girin: ");
        String cumle = keyboard.nextLine();
        System.out.println("Bir harf girin: ");
        char harf = keyboard.nextLine().charAt(0);
        double istenilenHarfSayisi = 0;
        double harfSayisi = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (('a' <= cumle.charAt(i) && cumle.charAt(i) <= 'z') || ('A' <= cumle.charAt(i) && cumle.charAt(i) <= 'Z'))
                harfSayisi++;
            if (cumle.charAt(i) == harf) {
                istenilenHarfSayisi++;
            }
        }
        
        double sonuc = harfSayisi / istenilenHarfSayisi;
        System.out.println(harf + " harfinden " + (istenilenHarfSayisi + "").substring(0, (istenilenHarfSayisi + "").length()-2) + " tane var.");
        System.out.println("Toplam " + (harfSayisi + "").substring(0, (harfSayisi + "").length()-2) + " tane harf var.");
        System.out.println(harf + " harfinin frekansi: " + sonuc);
        keyboard.close();
    }
}
