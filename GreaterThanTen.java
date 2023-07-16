import java.util.Scanner;
class GreaterThanTen
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int num=sc.nextInt();
      if(num==10)
      {
        System.out.println("Given number is equal to 10");
      }
      else
      {
        System.out.println("Given number is not equal to 10");
      }
    }
  }