import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String PASSWORDPATTERN = "[0-9a-zA-Z@$!%*#?&]{8,}";

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput() {
        System.out.println("Enter Phone Number ");
        String Password = scanner.next();
        validateInput(PASSWORDPATTERN,Password);
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
