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
        String playableWords = "assist";
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
        for(int i = 0; i < playableWords.length(); i++){
            if(guessedCharacter == playableWords.charAt(i)){
                numOfChar++;
            }
        }
        int[] charArr = new int[numOfChar];
        numOfChar = 0;
        for(int i = 0; i < playableWords.length(); i++){
            if(guessedCharacter == playableWords.charAt(i)){
                charArr[numOfChar] = i;
                numOfChar++;
            }
        }

        //System.out.println(charStorage);

        if (numOfChar > 0) {
            System.out.println(guessedCharacter + " is correct and was found " + numOfChar + " times.");
            System.out.println("Guesses: " + numOfGuesses);
            System.out.println(Arrays.toString(charArr));
            guessingGame();
        } else {
            System.out.println(guessedCharacter + " was not found, try again.");
            System.out.println("Guesses: " + numOfGuesses);
            System.out.println(Arrays.toString(charArr));
            guessingGame();
        }

        //System.out.println(playableWords.indexOf(guessedCharacter));
        //System.out.println(playableWords.charAt(playableWords.indexOf(guessedCharacter)));
    }
}



