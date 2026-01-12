public class Main {
    public static void main(String[] args) {

        Car[] cars = {new Car("Mustang", "Red"),
                      new Car("Challenger", "Black"),
                      new Car("Camaro", "White")};

        for(Car car : cars){
            car.drive();
        }

        //IS THE SAME THING AS:

        /*
        Car car1 = new Car("Challenger", "Black");
        Car car2 = new Car("Camaro", "White");
        Car car3 = new Car("Mustang", "Red");


        Car[] cars = {car1, car2, car3};


        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }
        */

    }
}
