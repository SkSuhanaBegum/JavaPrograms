import java.util.Scanner;
class CheckingEqualOrNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      if(a==b)
      {
        System.out.println("Two numbers are equal");
      }
      else{
         System.out.println("Two numbers are not equal");
      }
    }
  }