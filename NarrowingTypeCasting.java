import java.util.Scanner;
class NarrowingTypeCasting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      long number=sc.nextLong();
      byte value=(byte)number;
      System.out.println(value);
     }
  } 
