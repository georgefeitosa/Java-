// Cake.java
public class Cake {
    private String flavor;
    private int size;

    // Default constructor
    public Cake() {
    }

    // Non-default constructor
    public Cake(String flavor, int size) {
        this.flavor = flavor;
        this.size = size;
    }

    // Getters and setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // toString method
    @Override
    public String toString() {
        return flavor + " cake size is " + size + " inches";
    }
}
