/*Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message.*/
import java.util.Scanner;
class InsufficientFundsException extends Exception
  {
    InsufficientFundsException(String Messege)
    {
      super(Messege);
    }
  }
class DrawMoney
  {
   double balance=15000; 
    public void drawMoney(int amount)throws InsufficientFundsException
      {
      if(amount>=balance)
      {
        throw new InsufficientFundsException("Amount is not Sufficient to Withdraw"+balance);
      }
      else{
        System.out.println("Withdrawal Success");
      balance=balance-amount;
        System.out.println("After WithDraw: "+balance);
      }
      }
  }
class BankOperation
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Withdraw amount: ");
      int amount=sc.nextInt();
      try{
        DrawMoney dm=new DrawMoney();
        dm.drawMoney(amount);
      }
      catch(InsufficientFundsException e)
        {
          System.out.println(e);
        }
      System.out.println("Withdraw Exception");
      
    }
  }