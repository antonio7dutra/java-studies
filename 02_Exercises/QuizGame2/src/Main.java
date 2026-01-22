import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        int score = 0;
        String[] questions = {{"1. What is the largest organ in the human body?"},
                              {"2. What is the chemical symbol for water?"},
                              {"3. Which planet is closest to the sun?"},
                              {"4. What is the largest ocean?"},
                              {"5. What was the largest empire in history"}};

        int[] answers = {{},
                         {},
                         {},
                         {},
                         {}};

        //Welcome Message
        //Choose to play or to exit
        //If user choose to play = show the first question. (It will be 5 questions)
        //show 4 different answers for each question,
        //Validate the answer (cannot have letters or special characters, only integers numbers)
        //After each answer the program say if it was wrong or correct and move to the next question.
        //When the user finishes the 5 questions the program will show a score from 1-5 showing how many he got right
        //End the program




        scanner.close();
    }
}
