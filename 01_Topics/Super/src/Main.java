public class Main {
    public static void main(String[] args) {
        //super = refers to the parent class (subclass <- superclass)
        //        Used in constructors and methods overriding
        //        Calls the parent constructor to initialize attributes.

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.5);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000.55);

        student.showName();
        student.showGpa();
        System.out.println();
        employee.showName();
        employee.showSalary();

    }
}
