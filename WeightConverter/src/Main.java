import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * Weight Converter
        * Declare variables
        * welcome message
        * prompt for user input
        * option 1 convert lbs to kgs
        * option 2 convert kgs to lbs
        * else print not a valid choice
        * */

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the Weight Converter 1.0");
        System.out.println("1: Convert kgs to lbs.");
        System.out.println("2: Convert lbs to kgs.");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;

            System.out.printf("Your weight in lbs is: %.2f", newWeight);
        }

        else if(choice == 2){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight / 2.20462;

            System.out.printf("Your weight in kgs is: %.2f", newWeight);
        }

        else {
            System.out.println("You didn't choose a valid option");
        }
        scanner.close();
    }
}
