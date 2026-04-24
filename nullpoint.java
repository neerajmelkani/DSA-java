public class nullpoint {
    public static void main(String[] args) {
        try {
            test();
        } catch (DemoException e) {
            e.printStackTrace();
        }
    }
    public static void test() throws DemoException {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            throw new DemoException("Chained Exception", e);
        }
    }
}

class DemoException extends Exception {
    public DemoException(String message, Exception cause) {
        super(message, cause);
    }
}