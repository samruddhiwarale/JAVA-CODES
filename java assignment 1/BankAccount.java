import java.util.Scanner;
   public class BankAccount
       {
  private String accountHolder;
   private int accountNumber;
     private double balance;
    BankAccount(String name, int number,double initialBalance) 
           {
        if(initialBalance< 0) 
        {
         throw new IllegalArgumentException
     ("Initial balance cannot be negative.");
    }
 accountHolder=name;
accountNumber =number;
 balance =initialBalance;
    }
    public void deposit(double amount) 
    {
     if (amount<= 0) 
     {
    System.out.println("Invalid deposit amount.");
        } else {
    balance=balance+amount;
    System.out.println("Deposit Successful");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount<=0) {
System.out.println("Invalid withdrawal amount.");
 } else if (amount>balance) 
        {
System.out.println("Insufficient balance.");
     } else {
     balance= balance- amount;
    System.out.println("Withdrawal Successful") ;
        }
    }
    public static void main(String[] args)
    {
              Scanner sc=new Scanner(System.in);
    try 
     {
       System.out.print("Account Holder:");
     String name= sc.nextLine();
System.out.print("Account Number: ");
  int number=sc.nextInt() ;
System.out.print("Initial Balance: ");
      double initialBalance=sc.nextDouble();
System.out.print("Deposit: ");
    double depositAmount= sc.nextDouble();
System.out.print("Withdrawal: ");
   double withdrawalAmount= sc.nextDouble();
     if (number<=0) 
     {
System.out.println("Invalid account number.") ;
                return;
      }
  BankAccount account=new              BankAccount(name,number,         initialBalance);
System.out.println("\nAccount Holder:"+name);
    System.out.println("Account Number:"+ number);
account.deposit(depositAmount);
account.withdraw(withdrawalAmount);
System.out.println("Final Balance: "+account.balance);
 }
catch (IllegalArgumentException e) {
System.out.println("Error:"+ e.getMessage());
     } catch (java.util.InputMismatchException e)
        {
System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
