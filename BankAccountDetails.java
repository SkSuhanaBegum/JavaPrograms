import java.util.Scanner;
class BankAccountDetails
  {
    String name;
    long accountNo;
    int amount;
    int deposite;
    int withdraw;
    public void balance()
    {
      System.out.println("the balance amount in the account:"+amount);
    }
    public void deposite()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the deposite money");
      deposite=sc.nextInt();
      amount=amount+deposite;
      System.out.println("the amount after depositing:  " 
 + amount);
    }
    public void withDraw()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the withdraw money");
      withdraw=sc.nextInt();
      if(amount>withdraw)
      {
        withdraw=amount-withdraw;
        amount=withdraw;
        System.out.println("Withdrawal completed");
        System.out.println("The balance amount after withdraw: " + amount);
      }
        else
        {
          System.out.println("insuffucient amount");
        }
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      BankAccountDetails b=new BankAccountDetails();
      System.out.println("enter account holders name");
      b.name=sc.next();
      System.out.println("enter the accountnumber");
      b.accountNo=sc.nextInt();
      System.out.println("enter the balance amount");
      b.amount=sc.nextInt();
      b.balance();
      b.deposite();
      b.withDraw();
      
    }
  }