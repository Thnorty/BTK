public class IfElse {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 5.5;
        if (x == y) {
            System.out.println("Esit");
        }
        else if (x == 5.0) {
            System.out.println("x'in degeri 5.0'mis");
        }
        else {
            System.out.println("Esit degil");
        }
        boolean esitlik = (x == y);
        if (esitlik) {
            System.out.println("Bu da esit");
        }
        String string1 = "yazi";
        String string2 = "yazi";
        if (string1 == string2) {
            System.out.println("Iki string esit");
        }
        
        int sayimiz = 1;
        switch (sayimiz) {
            case 1:
                System.out.println("ilk yer");
                break;
            case 2:
                System.out.println("ikinci yer");
                break;
            default:
                System.out.println("switch");
                break;
        }

        boolean bool = false;
        if (bool) {
            System.exit(0);
        }
        else {
            System.out.println("false");
        }
        char char1 = 'a';
        System.out.println((char)(char1));
        System.out.println((char)(char1+1));
    }
}
