class Galaxy {
    String name = "newGalxy";
    double age = 777.7;
    double mass = 998789.76;

    void displayInfo() {
        System.out.println("The name is :" + name);
        System.out.println("The mass is :" + mass);
        System.out.println("And the age is :" + age);
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

public class singleInheritanceEg {
    public static void main(String[] args) {

        // all the info about earth
        Earth obj = new Earth();
        obj.name = "mars";
        obj.age = 10;
        obj.mass = 7.9000;
        obj.radius = 6265.75;
        obj.hasLife = true;
        obj.displayInfo();
        obj.printt();
    }
}
