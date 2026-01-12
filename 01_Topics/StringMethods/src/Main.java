import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        name = name.trim();

        if(name.isEmpty()){
            System.out.println("Name can't be empty!");
        }

        else if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password!");
        }

        else if(name.contains("  ")){
            System.out.println("Your name can't contain double spaces!");
        }

        else{
int length = name.length();
char firstLetter = name.charAt(0);
char lastLetter = name.charAt(length - 1);

            System.out.println("Hello " + name);
            System.out.println("Total characters: " + length);
            System.out.println("First letter: " + firstLetter);
            System.out.println("Last letter: " + lastLetter);
        }

                scanner.close();
    }
            }
