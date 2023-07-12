import java.util.Scanner;
public class Assignment
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first value");
    float a=sc.nextFloat();
    System.out.println("Enter the second value");
    float b=sc.nextFloat();
    System.out.println("a+=b is "+(a+=b));
    System.out.println("a-=b is "+(a-=b));
    System.out.println("a*=b is "+(a*=b));
    System.out.println("a/=b is "+(a/=b));
    System.out.println("a%=b is "+(a%=b));
    }
 }