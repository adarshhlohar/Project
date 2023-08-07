
public class OperatorExample {

    static void calcArithmatic(){
        int num1=80;
        int num2=87;
        int res;
        System.out.println("The addition is "+(num1+num2));
        System.out.println("The substraction is "+(num1-num2));
        System.out.println("The multiplication is "+(num1*num2));
        System.out.println("The Division is "+(num1/num2));
        System.out.println("The Modulo is "+(num1%num2));
    }

    static void calcRelation(){
        double num1=89.45,num2=45.46;
        System.out.println("Greater number is "+(num1>num2));
        System.out.println("Lesser number is "+(num1<num2));
    }

    static void calcUnary(){
        int num1 = 6;
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num1++);
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num1++);
        System.out.println(num1);
    }

    static void calcAssignment(){
        int num1 = 768;
        num1+=20;
        System.out.println("The value of num1 is " + num1);
        int num2 = 54;
        num2-=20;
        System.out.println("the value of num2 is " + num2);

    }

    static void calcTernary(){
        int num1=90,num2=56;
        int res = (num1<num2)?num1:num2;
        System.out.println(res);
    }

    static void  calcLogical(){
        double num1=46.76,num2=87.56,num3=89.56;
        System.out.println(num1<num2 || num2<num3);
        System.out.println(num1<num2 && num2<num3);
    }
    public static void main(String args[]){
        calcArithmatic();
        calcRelation();
        calcAssignment();
        calcUnary();
        calcTernary();
        calcLogical();
    }
}
