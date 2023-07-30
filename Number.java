import java.util.*;
class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String message)
  {
    super(message);
  }
}
class Number 
  {
    public static void validate(long mobileno) throws InvalidMobileNumberException
    {
      String str=String.valueOf(mobileno);
      if(str.length()!=10)
      {
        throw new InvalidMobileNumberException("mobile number is invalid");
      }
      else
           System.out.println("is valid");

    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter mobile number");
      long number=sc.nextLong();
      try{
      validate(number);
      }
      catch(InvalidMobileNumberException e)
        {
          e.printStackTrace();
        }
      System.out.println("exception handled");
    }
  }