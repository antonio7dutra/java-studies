import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        boolean hasId;
        String name;

        System.out.println("What's your name?: ");
        name = scanner.next();

        System.out.println("Hi, " + name + " How old are you?: ");
        age = scanner.nextInt();

        System.out.println("Do you have an ID? (true/false): ");
        hasId = scanner.nextBoolean();

        if (age >= 21 && hasId) {
            System.out.println("Acess granted! Welcome " + name);
        }

        else{
            System.out.println("Acess denied!");
        }
        scanner.close();
    }

}
