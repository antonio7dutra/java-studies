public class Person {

    String firstName;
    String lastName;

    Person(String name, String lastName){
        this.firstName = name;
        this.lastName = lastName;
    }

    void showName(){
        System.out.println(this.firstName + " " + this.lastName);
    }

}
