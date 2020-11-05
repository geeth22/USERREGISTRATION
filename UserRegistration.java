/*  User Registration System needs to ensure all validations are in place during the User Entry  */


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput() {
        System.out.println("Enter first name ");
        String firstName = scanner.next();
        validateInput(NAMEPATTERN,firstName);
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


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput() {
        System.out.println("Enter last name ");
        String lastName = scanner.next();
        validateInput(NAMEPATTERN,lastName);
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


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput() {
        System.out.println("Enter email id ");
        String EmailId = scanner.next();
        validateInput(EMAILPATTERN,EmailId);
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


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String PASSWORDPATTERN = "^(?=.*[A-Z])[0-9a-zA-Z@$!%*#?&]{8,}$";

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


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String PASSWORDPATTERN = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@$!%*#?&]{6,}$";

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


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public static final String PASSWORDPATTERN = ^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
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


import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRegistration {

    public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

    public static void main(String[] args) {

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.emailpatternTest();
    }
	private void emailpatternTest() {
        String sampleEmail1 = "abc@yahoo.com";
        String sampleEmail2 = "abc-100@yahoo.com";
        String sampleEmail3 = "abc.100@yahoo.com";
        String sampleEmail4 = "abc111@abc.com";
        String sampleEmail5 = "abc-100@abc.net";
        String sampleEmail6 = "abc.100@abc.com.au";
        String sampleEmail7 = "abc@1.com";
        String sampleEmail8 = "abc@gmail.com.com";
        String sampleEmail9 = "abc+100@gmail.com";


        ArrayList<String> emailIdList = new ArrayList<String>();
        emailIdList.add(sampleEmail1);
        emailIdList.add(sampleEmail2);
        emailIdList.add(sampleEmail3);
        emailIdList.add(sampleEmail4);
        emailIdList.add(sampleEmail5);
        emailIdList.add(sampleEmail6);
        emailIdList.add(sampleEmail7);
        emailIdList.add(sampleEmail8);
        emailIdList.add(sampleEmail9);

        for (String emailId : emailIdList) {
            if (Pattern.matches(EMAILPATTERN, emailId)) {
                System.out.println(emailId + " - valid ");
            } else {
                System.out.println(emailId + " - Invalid ");
            }
        }
    }
}
   

