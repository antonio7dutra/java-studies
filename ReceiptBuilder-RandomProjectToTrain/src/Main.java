import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        String[] items;
        double[] prices;
        int[] qty;

        // 1) Size
        do {
            System.out.print("How many items you want?: ");
            size = scanner.nextInt();
            scanner.nextLine();
        } while (size < 1);

        items = new String[size];
        prices = new double[size];
        qty = new int[size];

        // 2) Input
        for (int i = 0; i < items.length; i++) {

            String name;
            do {
                System.out.print("What's the name of the item: ");
                name = scanner.nextLine().trim();
            } while (name.isEmpty());
            items[i] = name;

            double price;
            do {
                System.out.print("What's the price?: ");
                price = scanner.nextDouble();
                scanner.nextLine();
            } while (price <= 0);
            prices[i] = price;

            int quantity;
            do {
                System.out.print("What's the quantity?: ");
                quantity = scanner.nextInt();
                scanner.nextLine();
            } while (quantity < 1);
            qty[i] = quantity;
        }

        // 3) Receipt + subtotal
        double subtotal = 0;

        System.out.println("\n==================== RECEIPT ====================");
        System.out.printf("%-3s %-20s %5s %10s %12s%n", "#", "Item", "Qty", "Price", "Line Total");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < items.length; i++) {
            double lineTotal = prices[i] * qty[i];
            subtotal += lineTotal;

            System.out.printf(
                    "%-3d %-20s %5d %10.2f %12.2f%n",
                    (i + 1),
                    items[i],
                    qty[i],
                    prices[i],
                    lineTotal
            );
        }

        System.out.println("-------------------------------------------------");

        // 4) Tax + total
        double taxRate = 0.07;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.printf("%-30s %15.2f%n", "Subtotal:", subtotal);
        System.out.printf("%-30s %15.2f%n", "Tax (7%):", tax);
        System.out.printf("%-30s %15.2f%n", "TOTAL:", total);
        System.out.println("=================================================\n");

        scanner.close();
    }
}
