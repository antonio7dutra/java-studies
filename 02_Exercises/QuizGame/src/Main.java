import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {"When is my birthday (month, day, and year)?",
                              "What is my zodiac sign?",
                              "Am I left-handed or right-handed?",
                              "What's my shoe size?",
                              "What is my favorite color?"};

        String[][] options = {{"1. 07/07/2004", "2. 06/14/2009", "3. 01/12/2016", "4. 12/20/1978"},
                              {"1. Cancer", "2. Scorpio", "3. Leo", "4. Gemini"},
                              {"1. left-handed", "2. right-handed"},
                              {"1. 13", "2. 10", "3. 11 1/2", "4. 12"},
                              {"1. Pink", "2. Blue", "3. White", "4. Black"}};

        int[] answers = {1, 1, 2, 3, 4};
        int score = 0;

        System.out.println("**********************************");
        System.out.println("Welcome to the Antonio's Quiz Game");
        System.out.println("**********************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            int guess;

            while (true) {
                System.out.print("Enter your guess: ");

                while (!scanner.hasNextInt()) {
                    System.out.print("Please enter a number: ");
                    scanner.next();
                }

                guess = scanner.nextInt();

                if (guess >= 1 && guess <= options[i].length) {
                    break;
                }

                System.out.println("Choose a number between 1 and " + options[i].length);
            }


            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println(" Wrong! ");
                System.out.println("********");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
