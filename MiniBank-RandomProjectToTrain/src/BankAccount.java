public class BankAccount {


    public static final String BANK_NAME = "Dutra Bank";

    public static int totalAccounts = 0;

    private String ownerName;
    private double balance;


    public BankAccount(String ownerName, double initialDeposit) {
        ownerName = (ownerName == null) ? "" : ownerName.trim();
        if (ownerName.isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be empty.");
        }
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Initial deposit cannot be negative.");
        }

        this.ownerName = ownerName;
        this.balance = initialDeposit;
        totalAccounts++;
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be greater than 0.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw must be greater than 0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdraw successful.");
    }

    public void printStatement() {
        System.out.println("=== Statement ===");
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Owner: " + ownerName);
        System.out.printf("Balance: $%.2f%n", balance);
    }

    public static void printBankStats() {
        System.out.println("=== Bank Stats ===");
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Total accounts created: " + totalAccounts);
    }

    public String getOwnerName() {
        return ownerName;
    }
}

