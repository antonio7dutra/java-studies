import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Tv's you got at home?");
        int tvs = scanner.nextInt();

        String poorOrRich = (tvs >= 3) ? "RICH" : "POOR";
        System.out.println("You are: " + poorOrRich);

        scanner.close();

    }
}
