import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your domain is: " + domain);
            System.out.println("Your username is: " + username);
        }

        else{
            System.out.println("A email must contain @");
        }

        scanner.close();
    }
}
