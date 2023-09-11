package myProgram;


public class modifierEg {
	
	String name  = "Adarsh";

	public static void main(String[] args) {
		Book b = new Book(); //Object of book class
//		putting book member values with set
		b.setbId(201);
		b.setbName("Multiverse Of Adarsh");
		b.setbPrice(200000);
		
		
//		printing with get
		System.out.println(b.getbId() + " " + b.getbName() + " " + b.getbPrice());
	}	
}