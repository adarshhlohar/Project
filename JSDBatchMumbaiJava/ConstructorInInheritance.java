class Base{
    int x ;
    Base(){
        System.out.println("I am a base class constructor ");
    }
    Base(int x){
        this.x= x;
        System.out.println("I am a overloaded constructor from base with the value : " + x);
    }
}

class Derived extends Base{
    Derived( int x){
        super(x);
        System.out.println("I am a Derived class Constructor " );
    }

    Derived(int x, int y){
        super(x);
        System.out.println("This is overlaoded constructor from derived with value y  : " +y);
    }
}


public class ConstructorInInheritance {
    public static void main(String[] args) {
        Derived d= new Derived(6);
        Derived d2 = new Derived(23,4);
    }
}
