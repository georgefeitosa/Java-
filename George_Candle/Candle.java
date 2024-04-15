import java.util.Random;

// Part A: Candle class
class Candle {
    // Data fields
    private String color;
    private int height;
    private double price;

    // Default constructor
    public Candle() {
    }

    // Non-default constructor
    public Candle(String color, int height) {
        this.color = color;
        this.height = height;
        this.price = height * 2.0; // Price is determined by height
    }

    // Get methods
    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    // Set methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = height * 2.0; // Update price when height is set
    }

    // toString method
    public String toString() {
        return "The " + height + " inches " + color + " candle cost $" + String.format("%.2f", price);
    }
}
