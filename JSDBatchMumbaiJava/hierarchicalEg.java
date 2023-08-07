/**
 * Galaxy
 */
class Galaxy {

    String name = "newGalxy";
    double age = 777.7;
    double mass = 998789.76;

    void displayInfo() {
        System.out.println("The name is : " + name);
        System.out.println("The mass is : " + mass);
        System.out.println("And the age is : " + age);
    }
}

class Earth extends Galaxy {

    boolean hasLife;
    double radius;

    void displayInfo() {
        super.displayInfo();
        System.out.println("the radius is " + radius);
        System.out.println("It has life " + hasLife);
    }

    void printt() {
        super.displayInfo();
    }
}

class Mars extends Galaxy {
    // child class property
    String color = "Red";
    String seasons = "Spring";
    String name = "Mars";
    double mass = 2.9;
    double age = 4.53;

    public void displayInfo() {
        System.out.println("Printing child mars value");
        System.out.println("Name " + name);
        System.out.println("Mass " + mass + " Solar masses");
        System.out.println("Age " + age + "Billions of year");
        System.out.println("Color " + color);
        System.out.println("Seasons " + seasons);
        System.out.println("----------------------");
    }
}

public class hierarchicalEg {
    public static void main(String[] args) {
        Earth e = new Earth();
        e.printt();
        e.displayInfo();

        Mars m = new Mars(); // child class object
        m.displayInfo();
    }
}
