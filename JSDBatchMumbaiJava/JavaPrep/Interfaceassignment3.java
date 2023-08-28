// Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.

interface BankAccount{
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount implements BankAccount{
    double balance;

    public void deposit(double amount){
        balance += amount;
        System.out.println("The total balance of youre account after depositing :"+amount+ " is :" +balance);
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient fund");
        }else{
            balance -= amount;
            System.out.println("The balance after withdarwing " + amount + " is :" + balance);
        }
    }
}


public class Interfaceassignment3 {
    public static void main(String[] args) {
        CheckingAccount CA = new CheckingAccount();
        CA.deposit(200);
        CA.withdraw(50);
    }
}
