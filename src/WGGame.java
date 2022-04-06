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

        while (true) {

            if (true) {

                gwPlayerCopy = gwPlayerCopy.substring(0, 2) + gwPlayerCopy.substring(3);

            }

            break;

        }

    }

}

//67.00 on slack video