package Local;
class BankAccount{
    int accountno;
    String accountholdername;
    double balance;

    public BankAccount(int accountno,String accountholdername,double balance){
        this.accountholdername=accountholdername;
        this.accountno=accountno;
        this.balance=balance;
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.print("Deposited");
        }
        else{
            System.out.println("Invalid response");
        }
    }

    void withdraw(double amount){
        if(amount>0){
            balance-=amount;

        }
    }

    double getbalnce(){
        return balance;
    }

}
class Savings extends BankAccount{
    public Savings(int accountno,String accountholdername,int balance){
        super(accountno,accountholdername,balance);
        
    }

    @Override
    void withdraw(double amount){
        if(amount>1000){
            if(balance<1000){
                System.out.print("Invalid");
            }
        }
    }
}

class RecurringAccount extends Savings{
    public RecurringAccount(int accountno,String accountholdername,int balance){
        super(accountno, accountholdername, balance);
    }
    @Override
    void withdraw(double amount){
        if(amount<2000){
            balance-=amount;
            System.out.println(+balance);
        }
    }



}
public class Bank {
    public static void main(String args[]){
        Savings save =new Savings(12345,"SRI",567);
        save.getbalnce();
        save.deposit(3500);
        save.withdraw(100);
        RecurringAccount recur=new RecurringAccount(34567,"Ram",234);
        recur.withdraw(1200);
        recur.deposit(234);
    }
    
}

