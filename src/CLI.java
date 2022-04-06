import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CLI {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readString (String question) {

        System.out.println(question + "\nInput: ");
        return SCANNER.nextLine();

    }

    public static char readAlphaChar (String question) {

        while (true) {

            try {

                System.out.println(question);
                System.out.println("Alphabetical Character: ");

                String userInput = SCANNER.nextLine().trim().toLowerCase(Locale.ROOT);

                if (userInput.length() == 0) {

                    System.out.println("\nNothing was given as input. You need to enter a character.\n");

                } else {

                    char userChar = userInput.charAt(0);

                    if (matchesAlphaChar(userInput)) {

                        return userChar;

                    }

                    System.out.println("\nYou must only enter an alphabetical character\n");

                }

            } catch (Exception e) {

                System.out.println("An error unknown occurred");
                System.out.println(e + "\n" + e.getMessage());

            }

        }

    }

    public static char readAlphaChar (String question, ArrayList<Character> allGuesses) {

        while (true) {

            try {

                System.out.println(question);
                System.out.println("Alphabetical Character: ");

                String userInput = SCANNER.nextLine().trim().toLowerCase(Locale.ROOT);

                if (userInput.length() == 0) {

                    System.out.println("\nNothing was given as input. You need to enter a character.\n");

                } else {

                    char userChar = userInput.charAt(0);

                    if (allGuesses.contains(userChar)) {

                        System.out.println("\nYou have already used that character, try again...");
                        continue;

                    }

                    if (matchesAlphaChar(userInput)) {

                        return userChar;

                    }

                    System.out.println("\nYou must only enter an alphabetical character\n");

                }

            } catch (Exception e) {

                System.out.println("An error unknown occurred");
                System.out.println(e + "\n" + e.getMessage());

            }

        }

    }

    public static int readInt (String question, int min, int max) {

        while (true) {

            try {

                System.out.println(question);
                System.out.println("Number (" + min + " - " + max + "): ");

                int userInt = SCANNER.nextInt();

                SCANNER.nextLine();

                if (userInt >= min && userInt <= max) {

                    return userInt;

                }

                System.out.println("Number must be in the range (" + min + " - " + max + ")");

            } catch (InputMismatchException e) {

                System.out.println("You must enter a whole number, try again...");
                SCANNER.nextLine();

            } catch (Exception e) {

                System.out.println("An error unknown occurred");
                System.out.println(e + "\n" + e.getMessage());
                return 0;

            }

        }
    }

    private static boolean matchesAlphaChar(String testStr) {

        Pattern p = Pattern.compile("^[a-z]");
        Matcher m = p.matcher(testStr);
        return m.find();

    }

}
