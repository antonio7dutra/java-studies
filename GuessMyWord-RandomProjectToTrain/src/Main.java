import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "Java123";
        String password;
        int guess = 0;


        System.out.println("Welcome to X Program");

        do{
            System.out.print("What's the password?: ");
            password = scanner.nextLine().trim();

                guess++;
                if (!password.equals(correctPassword)){
                    System.out.print("Wrong password, try again!\n");
                }
        }while(!password.equals(correctPassword));

        System.out.println("You entered the correct password! The number of guesses was: " + guess);


        scanner.close();
    }
}
