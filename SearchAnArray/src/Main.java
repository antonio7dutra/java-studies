import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 5, 4, 3, 7};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine().toLowerCase();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("We couldn't find this element!");
        }

        scanner.close();
    }
}
