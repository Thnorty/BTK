public class Excep {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int x = 5/0;
            array[6] = 2;
            System.out.println("devam");
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
        } finally {
            System.out.println("Cikti");
        }

        System.out.println("-------------------");

        try {
            int x = 5;
            int y = 0;
            if (y == 0) {
                throw new MyException();
            }
            int z = x/y;
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Try-catch'den ciktim");
        }
    }
}