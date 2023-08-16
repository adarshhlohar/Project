package myProgram;

public class ExceptionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
            System.out.println("we are learning exception");
            int num = 456;
            System.out.println(num/2);
            
            String a = "java";
            int a2 = Integer.parseInt(a);
            System.out.println(a2);
            
            String a3 = null;
            System.out.println(a3.length());
        }
        // handle exception
        catch(ArithmeticException e){
            System.out.println(e);
        }
		catch(Exception e) {
			System.out.println(e);
		}
		
        // necessary code                 
        finally{
            System.out.println("hellloooo");
        }
	}

}
