import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String NUMBERPATTERN = "^[\+0-9]{3}[ ]?[0-9]{10}$";

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput() {
        System.out.println("Enter Phone Number ");
        String PhoneNumber = scanner.next();
        validateInput(NUMBERPATTERN,PhoneNumber);
    }

    private void validateInput(String pattern, String input) {

        if(Pattern.matches(pattern, input)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
