package myProgram;

public class ExceptionEg2 {
	//method to check student age 
	static void checkAge(int age) throws AgeCheckException{
		if(age<20 || age>25) {
			// throws an object of custom exception
			throw new AgeCheckException("Student age is incorrect");
		}
		else {
			System.out.println("Student is eligible to enroll in course");
		}
	}
	
	public static void main(String[] args) throws AgecheckException {
//		throw : used to throw an exception explicitly, can be checked at compile or runtime.
//		throws : 
		checkAge(22);  //calling method
	}

}
