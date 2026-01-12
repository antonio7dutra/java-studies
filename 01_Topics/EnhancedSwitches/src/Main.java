import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*

        Grade	Result
        10, 9	A
        8, 7	B
        6, 5	C
        4, 3, 2, 1	D
        anything else	Invalid

        */

        int grade;

        System.out.println("Type your grade in numbers to convert to letters: ");
        grade = scanner.nextInt();

        String result = switch(grade){
            case 10, 9 -> "A";
            case 8, 7 -> "B ";
            case 6, 5 -> "C";
            case 4, 3, 2, 1 -> "D";
            default -> "Invalid";
        };

        if (grade >= 7){
            System.out.println("Congratulations your grade was: " + result + ". " + "You did well! Keep up the good work, boss");
        }

        else {
            System.out.println("Your grade was: " + result + ". " + "Try harder next time. Don't give up! You can do it!");
        }


        scanner.close();
    }
}
