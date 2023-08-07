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

class Moon extends Earth {
    double gravity= 1.62;
    double density = 3.34;
    double radius = 1737.4;
    boolean hasLife = false;
    String name = "Moon";
    double mass = 7.35;
    double age = 4.53;


    public void displayInfo(){
        System.out.println("Printing child eartn value");
        System.out.println("Name " + name);
        System.out.println("Mass " + mass );
        System.out.println("Age " + age);
        System.out.println("radius " + radius);
        System.out.println("hasLife  :" + hasLife);
        System.out.println("density "+ density);
        System.out.println("gravity " + gravity);
    }
}


public class multilevelEg {
    
}
