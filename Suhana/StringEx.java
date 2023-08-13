//WAP to find total number of alphabets, digits or special character in a string.
import java.util.Scanner;
class StringEx
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string value");
      String str=sc.nextLine();
      int digit_count=0,alpha_count=0,spe_count=0;
      for(int i=0;i<str.length();i++)
        {
          if(((str.charAt(i)>='a')&&(str.charAt(i)<='z'))||((str.charAt(i)>='A')&&(str.charAt(i)<='Z')))
             {
            alpha_count++;
             }
          else if((str.charAt(i)>='0')&&(str.charAt(i)<='9'))
          {
            digit_count++;
          }
          else
          {
            spe_count++;
          }
         }
      System.out.println("number of digits in the given string are "+digit_count);
      System.out.println("number of alphabets in the given string are "+alpha_count);
      System.out.println("number of special characters in the given string are "+spe_count);
    }
  }