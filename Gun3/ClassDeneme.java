public class ClassDeneme {
    public static void main(String[] args) {
        Class1.print("merhaba");
        int y = Class1.sayiToplayici(2, 5);
        System.out.println("x degeri: " + y);
        Class1.setX(5);
        System.out.println("Class icindeki x degeri: " + Class1.getX());
        Class1.setX(10);
        System.out.println("Class icindeki x degeri: " + Class1.getX());
        Class1.setY(2.5);
        System.out.println("Class icindeki y degeri: " + Class1.getY());

        Class1 yeniClass = new Class1();
        yeniClass.printNonStatic("YeniClass metodu");
        yeniClass.print("Class metodu");
        yeniClass.setX(15);
        yeniClass.setZ(25);
        System.out.println("YeniClass icindeki z: " + yeniClass.getZ());


        Class1 yeniClass2 = new Class1();
        System.out.println(yeniClass2.getX());
        yeniClass2.setZ(10);
        System.out.println("YeniClass2 icindeki z: " + yeniClass2.getZ());
        yeniClass2.carpim(2, 5);

        Class2 yeniClass3 = new Class2();
        Class2 yeniClass4 = new Class2(2, 5);
        yeniClass3.setSayi1(2);
        yeniClass3.setSayi2(2);
        
        System.out.println("yeniClass3 carpimlari: " + yeniClass3.carpim());
        System.out.println("yeniClass4 carpimlari: " + yeniClass4.carpim());

    }
}
