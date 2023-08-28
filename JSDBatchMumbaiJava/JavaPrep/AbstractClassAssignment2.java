abstract class BankAccount{
    int accountNumber;
    double balance;

    BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract public void deposit(int amount);
    abstract public void withdraw(int amount);
}


class CheckingAccount extends BankAccount{
    CheckingAccount(int accountNumber,double balance){
        super(accountNumber, balance);
    }

    @Override
    public void deposit(int amount ){
        this.balance += amount;
        System.out.println("The balance after depositing is :"+balance);
    }

    @Override
    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insufficient Amount in your Account");
        }
        else{
            balance -= amount;
            System.out.println("The balance after withdrawing is :"+balance);
        }
    }
}


public class AbstractClassAssignment2 {
    public static void main(String[] args) {
        CheckingAccount CA = new CheckingAccount(1001, 30000);

        CA.deposit(1000);
        CA.withdraw(2000);
        CA.withdraw(400000);
    }
}
