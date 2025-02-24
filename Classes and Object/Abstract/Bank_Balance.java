import java.util.*;
abstract class BankAccount
{
    private long accountNumber;
    private double balance;
    BankAccount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Account Number : ");
        accountNumber=sc.nextLong();
        if(accountNumber==98765432)
            balance=7499.00;
        else 
            balance=0.00;
    }
    static double interestRate;
    abstract void calculateInterest();
    protected void display()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Interest: "+interestRate);
    }
    protected double getBalance()
    {
        return balance;
    }
}
class SavingsAccount extends BankAccount
{
    SavingsAccount()
    {
        super();
    }
    public void calculateInterest()
    {
        super.interestRate=0.04*getBalance();
        display();
    }
 
}
class CurrentAccount extends BankAccount
{
    CurrentAccount()
    {
        super();
    }
    public void calculateInterest()
    {
        super.interestRate=0.027*getBalance(); 
        display();
    }
}
public class Bank_Balance
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        
        System.out.println("1 for Savings Account\n2 for Current Account");
        int n=in.nextInt();
        switch(n)
        {
            case 1:
                SavingsAccount s=new SavingsAccount();
                s.calculateInterest();
                break;
            case 2:
                CurrentAccount c=new CurrentAccount();
                c.calculateInterest();
                break;
    }
    }
}