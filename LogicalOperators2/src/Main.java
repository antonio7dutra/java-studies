import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isBanned = true;
        boolean isAdmin;
        String name;
        String password;

        System.out.print("What's your name? ");
        name = scanner.nextLine();

        System.out.print("Hi, " + name + ". Are you an admin? (true/false): ");
        isAdmin = scanner.nextBoolean();
        scanner.nextLine(); //  consume leftover newline

        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        // Password validation
        if (password.length() >= 8 && password.length() <= 12) {
            System.out.println("Your password is valid!");
        } else {
            System.out.println("Your password is invalid!");
        }

        // Final access logic
        if (password.length() >= 8 && password.length() <= 12 && isAdmin && !isBanned) {
            System.out.println("Welcome " + name);
        } else {
            System.out.println("You are not supposed to be here!");
        }

        scanner.close();
    }
}