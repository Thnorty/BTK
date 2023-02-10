import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // LinkedList<Ogrenci> ogrenciListesi = new LinkedList<>();
        // ogrenciListesi.add(new Ogrenci("Ahmet", 1));
        // Scanner keyboard = new Scanner(System.in);
        // while (true) {
        //     System.out.println("Islem?(Ekle, Listele, Cik)");
        //     String cevap = keyboard.nextLine();
        //     if (cevap.equalsIgnoreCase("ekle")) {
        //         System.out.println("Isim?");
        //         String isim = keyboard.nextLine();
        //         System.out.println("Numara");
        //         int numara = keyboard.nextInt();
        //         keyboard.nextLine();
        //         ogrenciListesi.add(new Ogrenci(isim, numara));
        //     } else if (cevap.equalsIgnoreCase("listele")) {
        //         Iterator<Ogrenci> it = ogrenciListesi.iterator();
        //         while (it.hasNext()) {
        //             System.out.println(it.next());
        //         }
        //     }
        //     else if (cevap.equalsIgnoreCase("cik")) {
        //         break;
        //     }
        //     else {
        //         System.out.println("Ekle, listele veya cik yazmalisiniz!!");
        //     }
        // }
        // keyboard.close();

        HashMap<Integer, Ogrenci> ogrenciListesi = new HashMap<>();
        ogrenciListesi.put(5, new Ogrenci("ahmet",5));
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Islem?(Ekle, Listele, Cik, Ogrenci bul)");
            String cevap = keyboard.nextLine();
            if (cevap.equalsIgnoreCase("ekle")) {
                System.out.println("Isim?");
                String isim = keyboard.nextLine();
                System.out.println("Numara");
                int numara = keyboard.nextInt();
                keyboard.nextLine();
                ogrenciListesi.put(numara, new Ogrenci(isim, numara));
            } else if (cevap.equalsIgnoreCase("listele")) {
                System.out.println(ogrenciListesi);
            }
            else if (cevap.equalsIgnoreCase("ogrenci bul")) {
                System.out.println("Ogrenci numarasi?");
                int numara = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Bu numaraya sahip kisinin ismi: " + ogrenciListesi.get(numara).isim);
            }
            else if (cevap.equalsIgnoreCase("cik")) {
                break;
            }
            else {
                System.out.println("Ekle, listele veya cik yazmalisiniz!!");
            }
        }
        keyboard.close();
    }
}
