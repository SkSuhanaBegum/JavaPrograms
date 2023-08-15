import java.util.Scanner;
class InvalidMobilenoException extends Exception
{
  InvalidMobilenoException(String message)
  {
    super(message);
  }
}
class ValidateNumber
  {
    public static void validateMobileNo(long mobileno)throws InvalidMobilenoException
    {
      String str=String.valueOf(mobileno);
      if(str.length()!=10)
      {
        throw new InvalidMobilenoException("mobile no is invalid");
      }
      else{
        System.out.println("mobile no is valid");
      }
    }
  }
class MobileValiExcep
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the mobile no");
    long mobileno=sc.nextLong(); 
    try
    {
      ValidateNumber.validateMobileNo(mobileno);
    }
catch(InvalidMobilenoException e)
      {
        System.out.println(e);
      }
      System.out.println("exception handeled");
    }
  }
