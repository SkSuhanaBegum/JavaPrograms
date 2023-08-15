import java.util.Scanner;
class InvalidAgeException extends Exception
  {
    InvalidAgeException(String message)
    {
      super(message);
    }
  }
class VoteEligible 
  {
    public static void validatAge(int age) throws InvalidAgeException
    {
      if(age<18)
      {
        throw new InvalidAgeException("invalid age");
      }
      else 
      {
        System.out.println("you are eligible");
      }
    }
  }
class ExceptionEx
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the age");
      int age=sc.nextInt();
      try
        {
        VoteEligible.validatAge(age);
      }
      catch(Exception e)
        {
          e.printStackTrace();
        }
          System.out.println("you are not eligible because your age is lessthan 18");
        }
    }
  
