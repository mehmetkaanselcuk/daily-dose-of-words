import java.util.Scanner;
import java.util.Random;

class DailyQuoteAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] quotes = {
                "Struggles are what turn ordinary people into powerful ones.",
                "Even the smallest step forward is progress.",
                "What matters isn’t that you fall, but that you rise again.",
                "Good things take time.",
                "Believe in yourself and the rest will follow."
        };
        System.out.println("Hi there! Here's your quote for today:");
        int index = random.nextInt(quotes.length);
        System.out.println("\"" + quotes[index] + "\"");
        System.out.println("\nWould you like to share your own quote? (yes/no)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please type your quote:");
            String userQuote = scanner.nextLine();
            System.out.println("Your quote: \"" + userQuote + "\"");
        }
        System.out.println("\nA little inspiration is enough for today. See you!");
        scanner.close();
    }
}
