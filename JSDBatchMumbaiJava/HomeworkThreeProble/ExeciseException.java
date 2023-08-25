import java.util.Scanner;

class TaxCalculator{
    public double claculateTax(String empName, boolean isIndian, double empSal)throws Exception{

        if(isIndian == false){
            throw new Exception("CountryNotValidException");
        }

        if (empName == "") {
            throw new Exception("EmployeeNameInvalidException");
        }

        double taxAmount;
        if (empSal > 100000 && isIndian) {
            taxAmount = empSal* 8/100;
        }
        else if(empSal > 50000 && empSal <= 100000 && isIndian){
            taxAmount = empSal * 6/100;
        }
        else if(empSal > 30000 && empSal <= 50000 && isIndian){
            taxAmount = empSal * 5/100;
        }
        else if(empSal > 10000 && empSal <= 30000 && isIndian){
            taxAmount = empSal * 4/100;
        }
        else{
            throw new Exception("TaxNotEligibleException");
        }

        return taxAmount;
    }
}



public class ExeciseException {
    public static void main(String[] args) {
        TaxCalculator obj = new TaxCalculator();
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter Name");
        name = sc.nextLine();
        boolean isIndian;
        System.out.println("is Indian or not");
        isIndian = sc.nextBoolean();
        double empSal;
        System.out.println("Enter Salary");
        empSal = sc.nextDouble();

        try{
            System.out.println("Tax Amount is " + obj.claculateTax(name,isIndian,empSal));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
