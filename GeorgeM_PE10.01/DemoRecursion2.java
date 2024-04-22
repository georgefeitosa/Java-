import java.util.concurrent.TimeUnit;

public class DemoRecursion2 extends Object {
    static void callItself(int x) {
        try {
            System.out.println("hello " + x++);
            TimeUnit.MILLISECONDS.sleep(100); // Introducing some delay to observe output
            callItself(x);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException: " + e.getMessage());
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError: Maximum recursion depth reached.");
        }
    }

    public static void main(String[] args) {
        int x = 0;
        callItself(x);
    }
}
