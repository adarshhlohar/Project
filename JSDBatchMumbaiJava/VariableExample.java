
public class VariableExample {
    
    static String name = "Adarsh"; // Static variable

    // naon static method
    void display(){
        // local variable
        char my = 'm';
        int num = 89;
        System.out.println(my + "   "+ num);
    }

    long phone = 9356986567l; //instance variable
    public static void main(String args[]){
        System.out.println("My first programm in java");
        // ctreating an object/instace
        VariableExample obj = new VariableExample();

        obj.display(); //calling methode
        System.out.println(obj.phone); //accessing instance variable
        System.out.println(VariableExample.name);  // accessing static variable
    }
}
