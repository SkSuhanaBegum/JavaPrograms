/*ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.
*/
class Account 
  {
    long acountNo;
    String accHolderName;
    double balance;
   double  deposite=1000;
    double withdraw=2000;
    Account(long acountNo,String accHolderName,double balance)
    {
      this.acountNo=acountNo;
      this.accHolderName=accHolderName;
      this.balance=balance;
    }
    void deposit()
    {
      balance=balance+deposite;
      System.out.println("the balance amount after deposite"+deposite);
    }
    void withdraw()
    {
      if(balance>withdraw)
      {
        withdraw=balance-withdraw;
        System.out.println("after withdraw the balance amount"+withdraw);
      }
      else
        System.out.println("insufficient amount");
    }
    void checkBalance()
    {
      System.out.println(balance);
    }
  }
class ATMStimulatorEx
  {
    public static void main(String[] args)
    {
       Account ac=new Account(123456798l,"john",15000);
      ac.deposit();
      ac.withdraw();
      ac.checkBalance();
    }
  }