import java.util.Scanner;

public class UI {
    public static Scanner scanner = new Scanner(System.in);

    public static String readString (String question) {
        System.out.println(question + "\nInput: ");
        String inputString = scanner.nextLine();
        return inputString;

    }
}
