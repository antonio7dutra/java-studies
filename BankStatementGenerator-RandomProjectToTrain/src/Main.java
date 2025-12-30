import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double startingBalance;

        do {
            System.out.print("What's the starting balance?: ");
            startingBalance = scanner.nextDouble();
            scanner.nextLine();
        } while (startingBalance < 0);

        int size;

        do {
            System.out.print("How many transactions will you be doing today? (1-3): ");
            size = scanner.nextInt();
            scanner.nextLine();
        } while (size < 1 || size > 3);


        char[] types = new char[size];
        String[] desc = new String[size];
        double[] amounts = new double[size];


        for (int i = 0; i < size; i++) {

            String input;
            char type = 0;

            do {
                System.out.print("\nTransaction " + (i + 1) + " - Type (D=deposit, W=withdraw): ");
                input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Type cannot be empty.");
                    continue;
                }

                type = Character.toUpperCase(input.charAt(0));

                if (type != 'D' && type != 'W') {
                    System.out.println("Invalid type. Please enter D or W.");
                }

            } while (input.isEmpty() || (type != 'D' && type != 'W'));

            types[i] = type;


            String description;
            do {
                System.out.print("Description: ");
                description = scanner.nextLine().trim();
            } while (description.isEmpty());

            desc[i] = description;


            double amount;
            do {
                System.out.print("Amount (> 0): ");
                amount = scanner.nextDouble();
                scanner.nextLine(); // clear buffer
            } while (amount <= 0);

            amounts[i] = amount;
        }


        double balance = startingBalance;
        double totalDeposits = 0;
        double totalWithdraws = 0;

        System.out.println("\n================ BANK STATEMENT ================");
        System.out.printf("Starting balance: $%.2f%n%n", startingBalance);

        for (int i = 0; i < size; i++) {

            if (types[i] == 'D') {
                balance += amounts[i];
                totalDeposits += amounts[i];

                System.out.println((i + 1) + ") DEPOSIT - " + desc[i] + " - $" + String.format("%.2f", amounts[i]));
            } else {
                balance -= amounts[i];
                totalWithdraws += amounts[i];

                System.out.println((i + 1) + ") WITHDRAW - " + desc[i] + " - $" + String.format("%.2f", amounts[i]));
            }

            System.out.println("   Balance: $" + String.format("%.2f", balance));
            System.out.println();
        }

        double netChange = balance - startingBalance;

        System.out.println("Summary:");
        System.out.println("Total deposits: $" + String.format("%.2f", totalDeposits));
        System.out.println("Total withdraws: $" + String.format("%.2f", totalWithdraws));
        System.out.println("Ending balance: $" + String.format("%.2f", balance));
        System.out.println("Net change: " + (netChange >= 0 ? "+" : "") + "$" + String.format("%.2f", netChange));
        System.out.println("================================================");


        System.out.print("\nSearch description (press Enter to skip): ");
        String query = scanner.nextLine().trim().toLowerCase();

        if (!query.isEmpty()) {
            boolean foundAny = false;

            System.out.println("\nSearch results for: \"" + query + "\"");

            for (int i = 0; i < size; i++) {
                if (desc[i].toLowerCase().contains(query)) {
                    foundAny = true;

                    String typeName = (types[i] == 'D') ? "DEPOSIT" : "WITHDRAW";
                    System.out.println((i + 1) + ") " + typeName + " - " + desc[i] + " - $" + String.format("%.2f", amounts[i]));
                }
            }

            if (!foundAny) {
                System.out.println("No transactions matched your search.");
            }
        }

        scanner.close();
    }
}
