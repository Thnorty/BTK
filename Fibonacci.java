public class Fibonacci {
    public static final int FIBONACCI = 10;
    public static void main(String[] args) {
        int number1, number2, number3;
        number1 = 0;
        number2 = 1;
        String fibonacciSerisi = "0 1 ";
        for (int i = 0; i < FIBONACCI; i++) {
            number3 = number1 + number2;
            fibonacciSerisi += number3 + " ";
            number1 = number2;
            number2 = number3;
        }
        System.out.println(fibonacciSerisi);
    }
}
