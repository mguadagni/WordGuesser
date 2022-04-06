
public class WGGame {

    private final static String[] PLAYABLE_WORDS = new String[] {
            "guessing", "these", "words",
            "is", "very", "easy"
    };

    public static void startGame () {

        System.out.println("GAME STARTED");

        int randomIndex = (int) (Math.random() * PLAYABLE_WORDS.length);

        System.out.println("GAME WORD: " + PLAYABLE_WORDS[randomIndex]);

        String gameWord = PLAYABLE_WORDS[randomIndex];
        String gwPlayerCopy = gameWord;

        System.out.println("The word you need to guess has " + gameWord.length() + " letters.");

        int playerGuessesLeft = 7;

        while (playerGuessesLeft > 0) {

            char userGuess = CLI.readAlphaChar("Guess a letter in the word");

            String updatedPlayerCopy = checkGuess(userGuess, gwPlayerCopy);

            if (updatedPlayerCopy.equals(gwPlayerCopy)) {

                System.out.println("You did not make a correct guess");
                playerGuessesLeft--;

            } else {

                int revealedChars = gwPlayerCopy.length() - updatedPlayerCopy.length();
                System.out.println("You revealed " + revealedChars + " characters with your guess");

            }

            gwPlayerCopy = updatedPlayerCopy;

            displayGameWord(gameWord, gwPlayerCopy);

            if (gwPlayerCopy.equals("")) break;

            System.out.println("Guesses left: " + playerGuessesLeft);

        }

        if (playerGuessesLeft > 1) {

            System.out.println("Congrats you won");

        } else {

            System.out.println("Better luck next time");

        }

    }

    private static String checkGuess(char userGuess, String gwPlayerCopy) {

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < gwPlayerCopy.length(); i++) {

            if (gwPlayerCopy.charAt(i) != userGuess) {

                temp.append(gwPlayerCopy.charAt(i));

            }

        }

        return temp.toString();

    }

    private static void displayGameWord (String gWord, String gWordPlayerCopy) {

        int indexOffset = 0;
        System.out.println("\nCurrent Guess: ");
        for (int i = 0; i < gWord.length(); i++) {

            if (
                    i-indexOffset < gWordPlayerCopy.length()
                    && gWord.charAt(i) == gWordPlayerCopy.charAt( i- indexOffset)
            ) {

                System.out.println("_");

            } else {

                System.out.println(gWord.charAt(i));
                indexOffset++;

            }

            System.out.println(" ");

        }

        System.out.println();

    }

}

