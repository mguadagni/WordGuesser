import java.util.ArrayList;
import java.util.Arrays;

public class GuessingGame {

    private static ArrayList<Character> charStorage = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Word Guesser!");
        pickAWord();
        guessingGame();
    }

    static int numOfGuesses = 0;
    static int numOfDashes = 0;
    static String selectedWord = "";
    ArrayList<Character> wrongCharacterArray = new ArrayList<Character>();
    ArrayList<Character> correctCharacterArray = new ArrayList<Character>();

//    char[] wrongCharacterArray = {};
//    char[] correctCharacterArray = {};

    public static void pickAWord() {
        String[] playableWords = new String[] {
                "guessing", "these", "words",
                "is", "very", "easy"
        };
        int randomNumber = (int)(Math.random() * 5);
        selectedWord = playableWords[randomNumber];

        numOfDashes = 0;
        for (int i = 0; i < selectedWord.length(); i++){
            numOfDashes++;
        }
    }

    public static void guessingGame() {

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
            for (int i = 0; i < selectedWord.length(); i++) {
                if (guessedCharacter == selectedWord.charAt(i)) {
                    numOfChar++;

                }
            }
            int[] charArr = new int[numOfChar];
            numOfChar = 0;
            for (int i = 0; i < selectedWord.length(); i++) {
                if (guessedCharacter == selectedWord.charAt(i)) {
                    charArr[numOfChar] = i;
                    numOfChar++;
                }
            }

            if (numOfChar > 0) {
                System.out.println(guessedCharacter + " is correct and was found " + numOfChar + " times.");
                System.out.println("Guesses: " + numOfGuesses);
                System.out.println(Arrays.toString(charArr));

            } else {
                System.out.println(guessedCharacter + " was not found, try again.");
                System.out.println("Guesses: " + numOfGuesses);
                System.out.println(Arrays.toString(charArr));
            }

            //System.out.println(playableWords.indexOf(guessedCharacter));
            //System.out.println(playableWords.charAt(playableWords.indexOf(guessedCharacter)));
        }
    }
}



