import java.util.Scanner;

class Giris{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // System.out.print("Bir sayi yaz: ");
        // int number;
        // number = keyboard.nextInt();
        // if (number % 2 == 0) {
        //     System.out.println("Cift sayi");
        // } else {
        //     System.out.println("Tek sayi");
        // }
        // System.out.print("Bir daha sayi yaz: ");
        // int number2;
        // number2 = keyboard.nextInt();
        // if (number2 < 10) {
        //     System.out.println("Sayi 10'dan kucuk");
        // } else {
        //     System.out.println("Sayi 10'dan buyuk");
        // }
        // System.out.println("Bir sey yaz: ");
        // String yazi1 = keyboard.next();
        // String yazi2 = keyboard.next();
        // System.out.println("Yazi1: " + yazi1);
        // System.out.println("Yazi2: " + yazi2);
        System.out.println("Bir sayi gir: ");
        int number = keyboard.nextInt();
        if (number < 10) {
            System.out.println("Sayi 10'dan kucuk");
        } else {
            System.out.println("Sayi 10'dan buyuk");
        }
        if (number % 2 == 0) {
            System.out.println("Cift sayi");
        }
        else {
            System.out.println("Tek sayi");
        }
        if (number >= 2 && number <= 4) {
            System.out.println("Sayi 2 ve 4 arasinda");
        }
        if (number < 10 || number % 2 == 0) {
            System.out.println("Sayi 10'dan kucuk veya cift");
        }
        keyboard.close();
    }
}