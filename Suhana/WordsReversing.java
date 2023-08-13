import java.util.Scanner;
class WordsReversing
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      reverse(str1);
    }
      public static void reverse(String str1[])
        {
      for(int i=(str1.length-1);i>=0;i--)
        {
          System.out.println(str1[i]);
        }
    }
  }