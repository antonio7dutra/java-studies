import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number it will start: ");
        int start = scanner.nextInt();

        System.out.println("Print a message every how many numbers?: ");
        int step = scanner.nextInt();

        for (int i = start ; i > 0 ; i--){
            if (i % step <= 0 ){
                System.out.println(i + " Checkpoint");
                Thread.sleep(1000);
            }
            else{
                System.out.println(i);
                Thread.sleep(1000);
            }
        }

        scanner.close();
    }
}
