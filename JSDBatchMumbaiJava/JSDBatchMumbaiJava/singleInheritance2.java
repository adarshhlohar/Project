class A{
    String color = "White";
    void work(){
        System.out.println("Hi.... Parent working");
    }
}

class B extends A {
    String color = "black";
    void work() {
        System.out.println("Hii.... Child working");
    }

    void printt() {
        super.work();
        System.out.println("parent colour : " + super.color);
        System.out.println("child color :" + color);
    }
}

public class singleInheritance2{
    public static void main(String[] args) {
        B b = new B();
        b.printt();
        b.work();
    }
}