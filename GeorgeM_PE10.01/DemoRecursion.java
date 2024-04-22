public class DemoRecursion extends Object {
    static void callItself (int x){
        System.out.println("hello "+x++);
        callItself(x);
    }

    public static void main(String[] args) {
        int x=0;
        callItself(x);
    }
}