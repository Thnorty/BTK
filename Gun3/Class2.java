public class Class2 {
    //Instance variable
    private int sayi1;
    private int sayi2;

    public Class2() {
        System.out.println("Class2 objesi olusturdun.");
        sayi1 = 0;
        sayi2 = 0;
    }

    public Class2(int sayi1, int sayi2) {
        System.out.println("Class2 objesi olusturdun.");
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    public int toplam() {
        return sayi1+sayi2;
    }

    public int carpim() {
        return sayi1*sayi2;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi1() {
        return sayi1;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    public int getSayi2() {
        return sayi2;
    }
}
