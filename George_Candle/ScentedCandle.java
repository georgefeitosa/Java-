// Part B: ScentedCandle class (child class of Candle)
class ScentedCandle extends Candle {
    // Additional data field
    private String scent;

    // Default constructor
    public ScentedCandle() {
    }

    // Non-default constructor
    public ScentedCandle(String color, int height, String scent) {
        super(color, height); // Call superclass constructor
        this.scent = scent;
        // No need to call setPrice here, as price calculation is done in the superclass constructor
    }

    // Get and set methods for scent
    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    // toString method (overriding superclass method)
    public String toString() {
        return "The " + getHeight() + " inches " + getColor() + " " + scent + " candle cost $" + String.format("%.2f", getPrice());
    }
}
