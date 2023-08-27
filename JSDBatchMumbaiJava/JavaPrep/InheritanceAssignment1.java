
class Vehicle {
    String brand;
    String model;
    int year;

    public void drive() {
        System.out.println("Driving the car.........");
    }
}

class Car extends Vehicle {
    String color;

    public void honk() {
        System.out.println("The car is honking.....");
    }
}

public class InheritanceAssignment1 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "Honda";
        car1.model = "Amaze";
        car1.year = 2022;
        car1.color = "White";

        car1.drive();
        car1.honk();

    }
}
