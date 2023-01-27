import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number1, number2;
        System.out.println("Iki tane sayi girin: ");
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        int islem;
        System.out.println("Islemi girin(1: toplama, 2: cikarma, 3: carpma, 4: bolme): ");
        islem = scan.nextInt();
        double sonuc = 0;
        // switch (islem) {
        //     case 1:
        //         sonuc = number1 + number2;
        //         break;
        //     case 2:  
        //         sonuc = number1 - number2;
        //         break;
        //     case 3:
        //         sonuc = number1 * number2;
        //         break;
        //     case 4:
        //         sonuc = number1 / number2;
        //         break;
        // }
        if (islem == 1)
            sonuc = number1 + number2;
        else if (islem == 2)
            sonuc = number1 - number2;
        else if (islem == 3)
            sonuc = number1 * number2;
        else
            sonuc = number1 / number2;

        System.out.println("Sonuc: " + sonuc);
        scan.close();
    }
}
