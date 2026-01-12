import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[2][1] = "eggs";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
