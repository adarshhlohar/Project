package aaaa;

import myProgram.product;

class Accessories extends Product{
	public Accessories(int pId, String pName, long price, boolean availabel) {
		super(pId,pName,price,availabel);
	}

	public static void main(String[] args) {
		
		Accessories a = new Accessories(21,"Earphone",1400,true);
		a.display();
	}

}
