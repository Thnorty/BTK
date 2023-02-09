import java.util.Scanner;
public class Insan {
    private Scanner keyboard = new Scanner(System.in);
    private Banka banka;
    private String isim;
    private double paraTL;
    private double paraUSD;
    private String parola;

    public Insan(Banka banka, String isim) {
        paraTL = 0;
        paraUSD = 0;
        this.banka = banka;
        this.isim = isim;
        while(true) {
            System.out.println(isim + " icin parola yaz: ");
            parola = keyboard.nextLine();
            boolean kucukHarf = false;
            boolean buyukHarf = false;
            boolean uzunluk = false;
            for (int i = 0; i < parola.length(); i++) {
                if ('a' <= parola.charAt(i) && parola.charAt(i) <= 'z')
                    kucukHarf = true;
                else if ('A' <= parola.charAt(i) && parola.charAt(i) <= 'Z')
                    buyukHarf = true;
                if (i == 7)
                    uzunluk = true;
            }
            if (kucukHarf && buyukHarf && uzunluk) {
                System.out.println("parola guclu!!!!");
                break;
            }
            else 
                System.out.println("parola yetersiz!!");
        }
    }

    public void parolaDegistir() {
        while(true) {
            System.out.print("Eski parola: ");
            String parola = keyboard.nextLine();
            if (this.parola.equals(parola)) {
                System.out.println("parola dogru!!!");
                break;
            } else {
                System.out.println("parola yanlis!!!!");
            }
        }
        while(true) {
            System.out.println(isim + " icin parola yaz: ");
            parola = keyboard.nextLine();
            boolean kucukHarf = false;
            boolean buyukHarf = false;
            boolean uzunluk = false;
            for (int i = 0; i < parola.length(); i++) {
                if ('a' <= parola.charAt(i) && parola.charAt(i) <= 'z')
                    kucukHarf = true;
                else if ('A' <= parola.charAt(i) && parola.charAt(i) <= 'Z')
                    buyukHarf = true;
                if (i == 7)
                    uzunluk = true;
            }
            if (kucukHarf && buyukHarf && uzunluk) {
                System.out.println("parola guclu!!!!");
                break;
            }
            else 
                System.out.println("parola yetersiz!!");
        }
    }

    public void calis() {
        paraTL += 200;
        banka.setTL(banka.getTL() + 200);
    }

    public void yurtDisindaCalis() {
        paraUSD += 100;
        banka.setUSD(banka.getUSD() + 200);
    }

    public void harca() {
        paraTL -= 20;
        banka.setTL(banka.getTL() - 20);
    }

    public void yurtDisindanHarca() {
        paraUSD -= 5;
        banka.setUSD(banka.getUSD() - 5);
    }

    public void dolarAl(double yuzde) {
        System.out.print(isim + " icin parola: ");
        String parola = keyboard.nextLine();
        if (this.parola.equals(parola)) {
            double tl = paraTL*yuzde/100;
            paraTL -= tl;
            paraUSD += tl/18.83;
        } else {
            System.out.println("parola hatali!!!!!");
        }
    }

    public void liraAl(double yuzde) {
        System.out.print(isim + " icin parola: ");
        String parola = keyboard.nextLine();
        if (this.parola.equals(parola)) {
            double usd = paraUSD*yuzde/100;
            paraUSD -= usd;
            paraTL += usd*18.83;
        } else {
            System.out.println("parola hatali!!!!!");
        }
    }

    public static void paraAktarTL(Insan alan, Insan gonderen, double yuzde) {
        double miktar = gonderen.getTL()*yuzde/100.0;
        if(!alan.banka.getIsim().equals(gonderen.banka.getIsim())) {
            gonderen.setTL(gonderen.getTL() - miktar/100.0);
        }
        gonderen.setTL(gonderen.getTL() - miktar);
        alan.setTL(alan.getTL() + miktar);
    }
    public static void paraAktarUSD(Insan alan, Insan gonderen, double yuzde) {
        double miktar = gonderen.getUSD()*yuzde/100.0;
        gonderen.setUSD(gonderen.getUSD() - miktar);
        alan.setUSD(alan.getUSD() + miktar);
    }

    public void toplamParaOzeti() {
        System.out.println(isim + " parasi: (TL: " + this.getTL() + ") (USD: " + this.getUSD() + ")");
    }

    public void setTL(double para) {
        banka.setTL(banka.getTL() + (para - paraTL));
        paraTL = para;
    }
    
    public void setUSD(double para) {
        banka.setUSD(banka.getUSD() + (para - paraUSD));
        paraUSD = para;
    }

    public double getTL() {
        return paraTL;
    }

    public double getUSD() {
        return paraUSD;
    }

    public String getIsim() {
        return isim;
    }
}
