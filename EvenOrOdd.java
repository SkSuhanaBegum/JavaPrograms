import java.util.Scanner;
class EvenOrOdd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int num=sc.nextInt();
      if(num%2==0)
      {
        System.out.println("Given number is an even number");
      }
      else
      {
        System.out.println("Given number is an odd number");
      }
    }
  }