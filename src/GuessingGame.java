public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Word Guesser!");
        guessingGame();
    }

    private static void guessingGame() {
        String playableWords = "Michael";
        String guessedCharacter = UI.readString("Please enter your guess.");
        System.out.println(guessedCharacter);
    }
}
