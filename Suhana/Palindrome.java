import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String reverse="";
     /* for(int i=(str.length()-1);i>=0;i--)
        {
          reverse=reverse+str.charAt(i);
        }*/
      for(int i=0;i<str.length();i++)
        {
        reverse=str.charAt(i)+reverse;
        }
     System.out.println(reverse);
     if(str.equals(reverse))
      {
        System.out.println("given string is a palindrome");
      }
      else
      {
        System.out.println("given string is not a palindrome");
      }
  }
  }