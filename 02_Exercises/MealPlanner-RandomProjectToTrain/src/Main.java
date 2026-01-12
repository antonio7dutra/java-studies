import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size;
        String[] foods;

        do {
            System.out.print("How many foods do you want?: ");
            size = scanner.nextInt();
            scanner.nextLine();
        } while (size < 1);

        foods = new String[size];


        for (int i = 0; i < foods.length; i++) {

            String input;

            do {
                System.out.print("Enter a food: ");
                input = scanner.nextLine().trim();
            } while (input.isEmpty());

            foods[i] = input;
        }


        int picks;
        do {
            System.out.print("How many random picks do you want? (1-" + size + "): ");
            picks = scanner.nextInt();
            scanner.nextLine();
        } while (picks < 1 || picks > size);


        System.out.println("\nFull list:");
        for (int i = 0; i < foods.length; i++) {
            System.out.printf("%d) %s%n", (i + 1), foods[i]);
        }


        System.out.println("\nToday's picks:");
        for (int i = 0; i < picks; i++) {
            int index = random.nextInt(size);
            System.out.println("- " + foods[index]);
        }

        scanner.close();
    }
}
