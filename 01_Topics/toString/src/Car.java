public class Car {
    String make;
    String model;
    String color;
    int year;

    Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString(){
        return this.year + " " + this.color + " " + this.make + " " + this.model;
    }

}
