import java.util.Scanner;
class ReverseNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to find out the reverse of that number");
      int n=sc.nextInt();
      int reverse=0,digit=0;
      while(n>0)
        {
         digit=n%10;
        reverse=(reverse*10)+digit;
          n=n/10;
        }
      System.out.println("Reverse of the given number is "+reverse);
    }
    
  }