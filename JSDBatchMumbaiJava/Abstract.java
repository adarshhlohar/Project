abstract class product{
    String pName;
    long  price;

    abstract void display();
}


class Electronics extends product{
    String brand = "LG";
    String desc = "super Fast cooling";
    String pName = "LG AC X1";
    long price = 34000;

    void display(){
        System.out.println("" + pName + " " + brand + " " + desc + " " +price );
    }
}

public class Abstract {
    public static void main(String[] args) {
        product e = new Electronics();
        e.display();
    }
}
