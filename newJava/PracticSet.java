package newJava;

class Cylinder{
	private int height;
	private int radius;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public Cylinder(int height, int radius) {
		super();
		this.height = height;
		this.radius = radius;
	}
	
	public double surfaceArea() {
		return 2* Math.PI*radius*height + 2*Math.PI *radius*radius;
	}
	
	public double volume() {
		return Math.PI*radius*radius*height;
	}
}

class Rectangel{
	private int length;
	private int breadth;
	
	public Rectangel() {
		this.length = 4;
		this.breadth = 5;
	}

	public Rectangel(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}


	
	
	
	
}



public class PracticSet {

	public static void main(String[] args) {
		
		/*
//		problem1
		Cylinder c = new Cylinder();
		c.setHeight(12);
		c.setRadius(9);
		
		System.out.println(c.getHeight());
		System.out.println(c.getRadius());
		
		
//		problem 2
		Cylinder c1 = new Cylinder(12, 9);
		System.out.println(c1.getHeight());
		System.out.println(c1.getRadius());
		
//		problem 3
//		surface area of Cyllinder
		Cylinder c2 = new Cylinder(12,9);
		System.out.println(c2.surfaceArea());		
		System.out.println(c2.volume());
		 */
		
//		problem3
		Rectangel r = new Rectangel(12,7);
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
	}

}
