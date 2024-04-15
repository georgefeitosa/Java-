// DemoCakes.java
public class DemoCakes {
    public static void main(String[] args) {
        // Creating an array of 5 cakes
        Cake[] cakes = new Cake[5];

        // Assigning cakes
        cakes[0] = new Cake("Vanilla", 8);
        cakes[1] = new DecoratedCake("Strawberry", 12, "HAPPY BIRTHDAY");
        cakes[2] = new DecoratedCake("Chocolate", 6, "VALENTINE");

        // Outputting all the cakes using enhanced loop
        System.out.println("Demo of Cake Classes");
        for (Cake cake : cakes) {
            if (cake != null) {
                System.out.println(cake);
            } else {
                System.out.println("null");
            }
        }
    }
}
