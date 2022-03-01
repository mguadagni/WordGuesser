import java.util.ArrayList;
import java.util.Arrays;

public class GuessingGame {

    private static ArrayList<Character> charStorage = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Word Guesser!");
        guessingGame();
    }

    static int numOfGuesses = 0;

    private static void guessingGame() {
        String[] playableWords = new String[] {
                "guessing", "these", "words",
                "is", "very", "easy"
        };
        int randomNumber = (int)(Math.random() * 5);
        String playedWord = playableWords[randomNumber];

        int numOfDashes = 0;
        for (int i = 0; i < playedWord.length(); i++){
            numOfDashes++;
        }

        while(true) {
            System.out.println("_".repeat(numOfDashes));
            char guessedCharacter = UI.readString("Please enter your guess.").charAt(0);
            numOfGuesses++;
            //System.out.println(guessedCharacter);
//        int numOfChar = 0;
//
//        for (int i = 0; i < playableWords.length(); i++) {
//            if (guessedCharacter == playableWords.charAt(i)) {
//                numOfChar++;
//                charStorage.add(playableWords.charAt(i));
//            }
//        }

            int numOfChar = 0;
            for (int i = 0; i < playedWord.length(); i++) {
                if (guessedCharacter == playedWord.charAt(i)) {
                    numOfChar++;
                }
            }
            int[] charArr = new int[numOfChar];
            numOfChar = 0;
            for (int i = 0; i < playedWord.length(); i++) {
                if (guessedCharacter == playedWord.charAt(i)) {
                    charArr[numOfChar] = i;
                    numOfChar++;
                }
            }

            if (numOfChar > 0) {
                System.out.println(guessedCharacter + " is correct and was found " + numOfChar + " times.");
                System.out.println("Guesses: " + numOfGuesses);
                System.out.println(Arrays.toString(charArr));
                guessingGame();
            } else {
                System.out.println(guessedCharacter + " was not found, try again.");
                System.out.println("Guesses: " + numOfGuesses);
                System.out.println(Arrays.toString(charArr));
//                guessingGame();
            }

            //System.out.println(playableWords.indexOf(guessedCharacter));
            //System.out.println(playableWords.charAt(playableWords.indexOf(guessedCharacter)));
        }
    }
}



