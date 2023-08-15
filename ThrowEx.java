import java.util.Scanner;
class ThrowEx
  {
    public static void validateVote(int age)
    {
      if(age<18)
      {
        throw new ArithmeticException("you are not eligible for voting");
      }
      else 
      {
        System.out.println("you are eligible for vote");
      }
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your age");
      int age=sc.nextInt();
      try{
      validateVote(age);
      }
      catch(Exception e)
        {
          System.out.println("exception is handled");
          System.out.println("your age is less than the 18 not eligible to vote");
        }
    }
  }