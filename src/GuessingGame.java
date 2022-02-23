public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Word Guesser!");
        guessingGame();
    }

    private static void guessingGame() {
        String playableWords = "michael";
        char guessedCharacter = UI.readString("Please enter your guess.").charAt(0);
        //System.out.println(guessedCharacter);

        boolean isCharPresent = false;

        for (int i = 0; i < playableWords.length(); i++) {
            if (guessedCharacter == playableWords.charAt(i)) {
                isCharPresent = true;
            }
        }

        if (isCharPresent) {
            System.out.println(guessedCharacter + " is correct");
        } else {
            System.out.println(guessedCharacter + " was not found, try again.");
        }

        System.out.println(playableWords.indexOf(guessedCharacter));
        System.out.println(playableWords.charAt(playableWords.indexOf(guessedCharacter)));
    }
}



