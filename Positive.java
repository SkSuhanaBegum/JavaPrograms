import java.util.Scanner;
class Positive
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int n=sc.nextInt();
      if(n>0)
      {
        System.out.println("Given number is a positive number");
      }
      else if(n<0)
      {
      System.out.println("Given number is a negative number");  
      }
    else 
      {
      System.out.println("Given number is a zero");  
      }
      
    }
  }