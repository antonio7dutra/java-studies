public class Main {
    public static void main(String[] args) {
        /* .toString() = Method inherited from the object class.
                     Used to return a string representation of an object.
                     By default, it returns a hash code as a unique identifier.
                     It can be overridden to provide meaningful details.
        */

        Car car1 = new Car("Dodge", "Challenger", "Red", 2026);
        Car car2 = new Car("Ford", "Mustang", "White", 2026);

        System.out.println(car1);
        System.out.println(car2);
    }
}
