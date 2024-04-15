// DecoratedCake.java
public class DecoratedCake extends Cake {
    private String theme;

    // Default constructor
    public DecoratedCake() {
    }

    // Non-default constructor
    public DecoratedCake(String flavor, int size, String theme) {
        super(flavor, size);
        this.theme = theme;
    }

    // Getter and setter for theme
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", theme is " + theme + "!";
    }
}
