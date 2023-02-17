public class MyException extends Exception {

    public MyException() {
        super("MyException hatasi");
    }

    public MyException(String message) {
        super(message);
    }

    public String getMessage() {
        return "mesaj";
    }
}
