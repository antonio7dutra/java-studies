import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        //int num0fFruits = fruits.length;
        /*
        for (int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
         Arrays.sort(fruits);
         */
        Arrays.fill(fruits, "pineapple");

        for (String fruit : fruits){
            System.out.println(fruit);

        }
    }
}
