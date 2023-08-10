class Book {
    private String bName;
    private int bId;
    private String bAuthor;
    private double bPrice;

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public void setbIAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public double getbPrice() {
        return bPrice;
    }

    public void setbPrice(double bPrice) {
        this.bPrice = bPrice;
    }
}

public class EncapsulationEg {
    public static void main(String[] args) {
        Book b = new Book();
        b.setbId(12);
        System.out.println("The value of id is : " + b.getbId());

        b.setbIAuthor("Adarsh");
        System.out.println("The name of author is : " + b.getbAuthor());

        b.setbName("The Multiverse Adarsh");
        System.out.println("The of that book is  : " + b.getbName());

        b.setbPrice(2000);
        System.out.println("The price of that book is : " + b.getbPrice());
    }
}
