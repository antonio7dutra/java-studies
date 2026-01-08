public class Product {
    String name;
    double price;
    int qty;

    Product(){
        this("Unknown", 0, 0);
    }

    Product(String name){
        this(name, 0, 0);
    }

    Product(String name, double price){
        this(name, price, 0);
    }

    Product(String name, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

}
