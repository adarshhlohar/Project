package myProgram;

public class Cloth implements Productt{
	int pId = 11;
	String pName = "men shirt";
	long price = 2000;
	public void display() {
		System.out.println(pName + " " + pId + " " + price);
	}
	
	public static void main(String[] args) {
		Cloth c = new Cloth();
		c.display();
	}
}
