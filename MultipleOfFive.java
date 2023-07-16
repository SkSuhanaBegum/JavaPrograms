import java.util.Scanner;
class MultipleOfFive
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int num=sc.nextInt();
      if(num%5==0)
      {
        System.out.println("Given number is a multiple of 5");
      }
      else
      {
        System.out.println("Given number is not a multiple of 5");
      }
    }
  }