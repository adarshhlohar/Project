abstract class Shape{
    abstract public void calculateArea();
}

class Circle extends Shape{
    double radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        double Area = Math.PI * radius*radius;
        System.out.println("The Area of circle is :" + Area);
    }
}

class Rectangle extends Shape{
    double height;
    double width;

    Rectangle(int height,int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea(){
        double Area = height * width;
        System.out.println("The Area of Rectangle is :" + Area);
    }
}

public class AbstractClassAssignment {
    public static void main(String[] args) {
        Circle obj1 = new Circle(4);
        Rectangle obj2 = new Rectangle(4, 5);

        obj1.calculateArea();
        obj2.calculateArea();
    }
}
