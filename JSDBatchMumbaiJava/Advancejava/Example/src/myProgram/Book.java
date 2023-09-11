package myProgram;

// java bean class
public class Book {
//	private member
	private int bId;
	private String bName;
	private long bPrice;
	
	
//	public getter setter
	protected int getbId() {
		return bId;
	}
	protected void setbId(int bId) {
		this.bId = bId;
	}
	
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	
	public long getbPrice() {
		return bPrice;
	}
	public void setbPrice(long bPrice) {
		this.bPrice = bPrice;
	}
	
	
}
