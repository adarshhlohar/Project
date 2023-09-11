package myProgram;

public class Product {
	protected int pId;
	protected String pName;
	protected long price;
	protected boolean availabele;
	
	
	public Product(int pId, String pName, long price, boolean availabele) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.availabele = availabele;
	}
	
	protected void display() {
		System.out.println();
	}
	
}
