import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        if (isNullOrEmpty(lastName)) return firstName;
        if (isNullOrEmpty(firstName)) return lastName;
        return firstName + " " + lastName;
    }

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}