import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to " + BankAccount.BANK_NAME);
        System.out.println("Accounts before creating any: " + BankAccount.totalAccounts);

        BankAccount account1 = createAccount();
        BankAccount account2 = createAccount();

        System.out.println("Accounts after creating: " + BankAccount.totalAccounts);

        BankAccount current = account1;

        boolean running = true;
        while (running) {
            System.out.println("\n===========================");
            System.out.println("Current account: " + current.getOwnerName());
            System.out.println("1) Switch account");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Statement");
            System.out.println("5) Bank stats (static)");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice = readInt();

            switch (choice) {
                case 1 -> current = (current == account1) ? account2 : account1;

                case 2 -> {
                    System.out.print("Amount to deposit: ");
                    double amount = readDouble();
                    current.deposit(amount);
                }

                case 3 -> {
                    System.out.print("Amount to withdraw: ");
                    double amount = readDouble();
                    current.withdraw(amount);
                }

                case 4 -> current.printStatement();

                case 5 -> BankAccount.printBankStats();

                case 0 -> running = false;

                default -> System.out.println("Invalid option.");
            }
        }

        scanner.close();
        System.out.println("Bye!");
    }

    private static BankAccount createAccount() {
        while (true) {
            try {
                System.out.print("\nOwner name: ");
                String name = scanner.nextLine().trim();
                while (name.isEmpty()) {
                    System.out.print("Owner name (cannot be empty): ");
                    name = scanner.nextLine().trim();
                }

                System.out.print("Initial deposit (>= 0): ");
                double initialDeposit = readDouble();
                while (initialDeposit < 0) {
                    System.out.print("Initial deposit (cannot be negative): ");
                    initialDeposit = readDouble();
                }

                return new BankAccount(name, initialDeposit);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    private static int readInt() {
        while (true) {
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid integer: ");
            }
        }
    }


    private static double readDouble() {
        while (true) {
            String line = scanner.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }
}
