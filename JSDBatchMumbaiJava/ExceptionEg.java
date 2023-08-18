public class ExceptionEg {

    
    public static void main(String[] args) {
        // exception may occur in code
        try{
            System.out.println("we are learning exception");
            int num = 456;
            System.out.println(num/0);
        }
        // handle exception
        catch(Exception e){
            System.out.println(e);
        }
        // necessary code                 
        finally{
            System.out.println("hellloooo");
        }
    }
}
