import java.util.Random;

// Part C: DemoCandles application
public class DemoCandles {
    public static void main(String[] args) {
        // Instantiate an array of 7 Candle and ScentedCandle objects
        Candle[] candles = new Candle[7];
        Random rand = new Random();

        // Randomly generate 4 Candle objects
        for (int i = 0; i < 4; i++) {
            String color = getRandomColor();
            int height = rand.nextInt(6) + 5; // Random height between 5 and 10 inches
            candles[i] = new Candle(color, height);
        }

        // Randomly generate 3 ScentedCandle objects
        for (int i = 4; i < 7; i++) {
            String color = getRandomColor();
            int height = rand.nextInt(6) + 5; // Random height between 5 and 10 inches
            String scent = getRandomScent();
            candles[i] = new ScentedCandle(color, height, scent);
        }

        // Output objects
        System.out.println("Demo of Candles");
        for (Candle candle : candles) {
            System.out.println(candle);
        }
    }

    // Method to get a random color
    private static String getRandomColor() {
        String[] colors = {"white", "yellow", "red", "green"};
        Random rand = new Random();
        return colors[rand.nextInt(colors.length)];
    }

    // Method to get a random scent
    private static String getRandomScent() {
        String[] scents = {"pine", "carnation"};
        Random rand = new Random();
        return scents[rand.nextInt(scents.length)];
    }
}
