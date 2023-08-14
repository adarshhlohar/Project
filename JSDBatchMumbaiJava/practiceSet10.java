
class Cirlce{
    public int radius;

    Cirlce(int r){
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*radius;
    }
}

class Cyllinder extends Cirlce{
    int height;

    Cyllinder(int r, int h){
        super(r);
        this.height = h;
    }

    public double Volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

public class practiceSet10 {
    public static void main(String[] args) {
        Cyllinder obj = new Cyllinder(4,12);
        System.out.println("The area of Circle is : "+ obj.area());
        System.out.println("The volume of cyllinder is : "+ obj.Volume());
    }
}
