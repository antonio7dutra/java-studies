import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result=0;
        char operator;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Choose an operator (+, -, /, *, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot be divide by zero!");
                    validOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Not a valid operation!");
                validOperation = false;
            }
        }

        if (validOperation == true){
            System.out.println(result);
        }

        scanner.close();
    }
}
