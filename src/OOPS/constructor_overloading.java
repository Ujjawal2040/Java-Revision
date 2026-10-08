package OOPS;



public class constructor_overloading{

    String name;
    int roll_number;

    // Constructor 1: no arguments
    constructor_overloading() {
        name = "Unknown";
        roll_number = 0;
    }

    // Constructor 2: String parameter
    constructor_overloading(String name) {
        this.name = name;
        this.roll_number = 0;
    }

    // Constructor 3: String + int
    constructor_overloading(String name, int roll_number) {
        this.name = name;
        this.roll_number = roll_number;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_number);
    }

    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student("Ujjawal");
        student s3 = new student("Ujjawal", 101);

        s1.display();
        s2.display();
        s3.display();
    }
}
