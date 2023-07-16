import java.util.Scanner;
class DivisibleOrNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      if(a%b==0)
      {
        System.out.println(a +" is divisible by "+b);
      }
      else{
         System.out.println(a +" is not divisible by "+b);
      }
    }
  }