public class Bilgisayar {
    private String cpu, gpu;
    private int ram, depolama, fiyat, yas;

    public Bilgisayar(String cpu, String gpu, int ram, int depolama, int yas) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.depolama = depolama;
        this.yas = yas;
        fiyatBelirle();
    }

    public void ozellikler() {
        System.out.println("Bu bilgisayarin islemcisi: " + cpu);
        System.out.println("Bu bilgisayarin ekran karti: " + gpu);
        System.out.println("Bu bilgisayarda " + ram + "gb ram var.");
        if (depolama >= 1024)
            System.out.println("Bu bilgisayarda " + (double)(depolama)/1024 + "tb depolama alani var.");
        else
            System.out.println("Bu bilgisayarda " + depolama + "gb depolama alani var.");
        System.out.println("Bu bilgisayarin fiyati: " + fiyat + " tl.");
    }

    public static void ramiKarsilastir(Bilgisayar bilgisayar1, Bilgisayar bilgisayar2) {
        if (bilgisayar1.ram > bilgisayar2.ram)
            System.out.println("Birinci bilgisayarda daha fazla ram var.");
        else if (bilgisayar1.ram < bilgisayar2.ram)
            System.out.println("Ikinci bilgisayarda daha fazla ram var.");
        else
            System.out.println("Iki bilgisayarin rami esit.");
    }

    public void ramiKarsilastir(Bilgisayar bilgisayar) {
        if (bilgisayar.ram > this.ram)
            System.out.println("Ikinci bilgisayarda daha fazla ram var.");
        else if (bilgisayar.ram < this.ram)
            System.out.println("Birinci bilgisayarda daha fazla ram var.");
        else
            System.out.println("Iki bilgisayarin rami esit.");
    }

    public void yasiArttir() {
        yas++;
    }

    public void fiyatBelirle() {
        fiyat = 0;
        if (cpu.equals("i9"))
            fiyat += 100;
        else if (cpu.equals("i7"))
            fiyat += 75;
        else if (cpu.equals("i5"))
            fiyat += 50;
        else if (cpu.equals("i3"))
            fiyat += 25;
        
        if (gpu.equals("RTX 4090"))
            fiyat += 150;
        else if (gpu.equals("RTX 3090"))
            fiyat += 100;
        else if (gpu.equals("RTX 3080"))
            fiyat += 75;
        else if (gpu.equals("RTX 3070"))
            fiyat += 50;
        else if (gpu.equals("RTX 3060"))
            fiyat += 25;

        fiyat += ram*50;
        fiyat += depolama*1;
        fiyat -= yas*50;
    }
}
