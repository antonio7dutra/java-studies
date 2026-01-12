public class Main {
    public static void main(String[] args) {
        Product product0 = new Product();
        Product product1 = new Product("Iphone");
        Product product2 = new Product("Iphone", 1000);
        Product product3 = new Product("Iphone", 1000, 2);


        System.out.println(product0.name);
        System.out.println(product0.price);
        System.out.println(product0.qty);

        System.out.println(product1.name);
        System.out.println(product1.price);
        System.out.println(product1.qty);

        System.out.println(product2.name);
        System.out.println(product2.price);
        System.out.println(product2.qty);

        System.out.println(product3.name);
        System.out.println(product3.price);
        System.out.println(product3.qty);
    }
}
