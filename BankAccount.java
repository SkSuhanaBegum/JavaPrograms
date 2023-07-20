/*Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:

deposit(amount): Deposits the given amount.
deposit(amount, description): Deposits the given amount with a provided description.
withdraw(amount): Withdraws the given amount.
withdraw(amount, description): Withdraws the given amount with a provided description.*/
class BankAccount
  {
    double bankbalance=6000;
    void display()
    {
      System.out.println("Having balance: "+bankbalance);
    }
    void deposit(double amount)
    {
      System.out.println("deposit: "+amount);
      bankbalance=bankbalance+amount;
      System.out.println(" After Depositing: "+bankbalance);
    }
    void deposit(double amount,String description)
    {
      System.out.println(description+" "+amount);
    bankbalance=bankbalance+amount;
      System.out.println(" After Depositing: "+bankbalance);
    }
    void withDraw(double amount)
    {
      System.out.println("withdraw amount: "+amount);
      if(amount<bankbalance)
      {
        bankbalance=bankbalance-amount;
        System.out.println("after withdraw bankbalance is: "+bankbalance);
      }
      else
      {
        System.out.println("Insufficient balance");
      }
    }
    void withdraw(double amount,String descryption)
    {
      System.out.println(descryption+" "+amount);
      if(amount<bankbalance)
      {
        bankbalance=bankbalance-amount;
        System.out.println("after withdraw account is"+bankbalance);
      }
      else{
        System.out.println(" Insufficient balance");
      }
    }
  }
class Transaction
  {
    public static void main(String args[])
    {
    BankAccount ba=new BankAccount();  
      ba.display();
      ba.deposit(2000,"deposit amount");
    ba.withdraw(1000,"withdrawn amount");
    } 
  }