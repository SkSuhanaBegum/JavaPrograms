import java.util.Scanner;
class Multiplication
  {
    public static void main(String args[])
    {
      double a,b,product;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      a=sc.nextDouble();
      System.out.println("Enter b value");
      b=sc.nextDouble();
      product=a*b;
      System.out.println("Product of "+ a+ " and "+b+" is"+product);
       }
  }