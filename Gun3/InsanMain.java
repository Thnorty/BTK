public class InsanMain {
    public static void main(String[] args) {
        Ogrenci ahmet = new Ogrenci("Ahmet", 10);
        System.out.println("Insanin ismi: " + ahmet.insaninIsmi());
        System.out.println("Ogrencinin ismi: " + ahmet.ogrencininIsmi());
        System.out.println("Ogrencinin numarasi: " + ahmet.ogrencininNumarasi());
        KizOgrenci ayse = new KizOgrenci("Ayse", 11);
        System.out.println("Ogrencinin ismi: " + ayse.ogrencininIsmi());
        System.out.println("Ogrencinin ismi: " + ayse.ogrencininNumarasi());
        System.out.println("Ogrencinin ismi: " + ayse.insaninIsmi());
    }
}