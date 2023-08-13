import java.util.Scanner;
class CountingOccurances
  {
public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the character");
      char ch=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<str.length();i++)
        {
         if(str.charAt(i)==ch)
         {
           count++;
         }
        }
      System.out.println("the number of occurances of a given character in the string "+count);
    }
  }