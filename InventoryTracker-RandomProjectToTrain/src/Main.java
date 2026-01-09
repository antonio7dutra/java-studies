import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] inventory = new Product[5];

        Product product1 = new Product("Mouse", 30, 1);
        Product product2 = new Product("Keyboard", 50 , 1);

        inventory[0] = product1;
        inventory[1] = product2;

        boolean running = true;
        int choice;

        while (running) {

            System.out.println("Welcome to the Inventory Tracker!");
            System.out.println("1. Add Product");
            System.out.println("2. List Inventory");
            System.out.println("3. Sell product");
            System.out.println("4. Restock Product");
            System.out.println("5. Exit");

            System.out.print("Choose an option from 1-5: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> {

                    int slot;
                    slot = findEmptySlot(inventory);

                    if (slot == -1){
                        System.out.println("Inventory full");
                    }

                    else {

                        String name;
                        double price;
                        int qty;

                        do {
                            System.out.print("Enter product name: ");
                            name = scanner.nextLine().trim();

                        } while (name.isEmpty());

                        System.out.println("Name accepted: " + name);

                        do {
                            System.out.print("Enter a price: ");

                            while (!scanner.hasNextDouble()) {
                                System.out.println("Invalid price. Try again.");
                                scanner.nextLine();
                                System.out.print("Enter price: ");
                            }

                            price = scanner.nextDouble();
                            scanner.nextLine();

                        } while (price <= 0);

                        do{
                            System.out.print("How many " + name + "s" + " you want to add?: ");
                            while(!scanner.hasNextInt()){
                                System.out.println("Invalid quantity! Try again.");
                                scanner.nextLine();
                                System.out.print("Enter a quantity: ");
                            }
                            qty = scanner.nextInt();
                            scanner.nextLine();
                        }while(qty <= 0);

                        Product p = new Product(name, price, qty);
                        inventory[slot] = p;

                        System.out.println("Added at slot: " + slot);
                        inventory[slot].print();

                        //System.out.println("Next empty slot: " + slot);
                    }

                    pause(scanner);
                }


                case 2 -> {
                    listInventory(inventory);
                    pause(scanner);
                }


                case 3 -> {
                    listInventory(inventory);
                    sellProduct(inventory, scanner);
                    pause(scanner);
                }


                case 4 -> {
                    listInventory(inventory);
                    restockProduct(inventory, scanner);
                    pause(scanner);
                }


                case 5 -> running = false;
                default -> System.out.println("Invalid option. Choose 1-5.");
            }
        }

        scanner.close();
    }

    static void listInventory(Product[] inventory){
        for (int i = 0; i < inventory.length; i++) {

            if (inventory[i] == null) {
                System.out.println(i + ": (empty)");
            }

            else {
                System.out.print(i + ": ");
                inventory[i].print();
            }
        }
    }
    static void pause(Scanner scanner) {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
        System.out.println();
    }
    static int findEmptySlot(Product[] inventory){
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] == null){
                return i;
            }
        }
        return -1;
    }
    static void sellProduct(Product[] inventory, Scanner scanner){
        int slot;
        do{
            System.out.print("Which slot index to sell (0-4)?: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid slot. Try again.");
                scanner.nextLine();
                System.out.print("Which slot index to sell (0-4)?: ");
            }
            slot = scanner.nextInt();
            scanner.nextLine();
        }while(slot < 0 || slot >= inventory.length || inventory[slot] == null);

        Product selected = inventory[slot];

        int amount;
        do{
            System.out.print("How many to sell?: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid amount. Try again.");
                scanner.nextLine();
                System.out.print("How many to sell?: ");
            }
            amount = scanner.nextInt();
            scanner.nextLine();
        }while(amount <= 0 || amount > selected.qty);

        selected.qty -= amount;
        int remaining = selected.qty;

        System.out.println("Sold " + amount + " " + selected.name + " | remaining: " + remaining);

        if(remaining == 0){
            inventory[slot] = null;
            System.out.println("Slot " + slot + " is now empty.");
        }
    }
    static void restockProduct(Product[] inventory, Scanner scanner){
        int slot;
        do{
            System.out.print("Which slot index to restock (0-4)?: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid slot. Try again.");
                scanner.nextLine();
                System.out.print("Which slot index to restock (0-4)?: ");
            }
            slot = scanner.nextInt();
            scanner.nextLine();
        }while(slot < 0 || slot >= inventory.length || inventory[slot] == null);

        Product selected = inventory[slot];

        int amount;
        do{
            System.out.print("How many to add?: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid amount. Try again.");
                scanner.nextLine();
                System.out.print("How many to add?: ");
            }
            amount = scanner.nextInt();
            scanner.nextLine();
        }while(amount <= 0);

        selected.qty += amount;
        System.out.println("Restocked " + selected.name + " | new qty: " + selected.qty);
    }


}
