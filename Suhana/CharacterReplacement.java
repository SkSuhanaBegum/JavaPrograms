/*Write a program that takes a string as input and replaces all occurrences of a specified character with another character. Prompt the user to enter the original string, the character to be replaced, and the replacement character.*/
import java.util.Scanner;
class CharacterReplacement
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the character to be replaced");
      char ch=sc.next().charAt(0);
      System.out.println("enter the character with which we want to replace");
      char ch1=sc.next().charAt(0);
      //using method
      ///String str1=str.replace(ch,ch1);
     // System.out.println("the replaced string is "+str1);
      //without using method 
      char str1[]=str.toCharArray();
      int size=str1.length;
      for(int i=0;i<size;i++)
        {
          if(str1[i]==ch)
          {
            str1[i]=ch1;
          }
        }
      System.out.print("The replaced string is "+" ");
      for(int i=0;i<size;i++)
          {
        System.out.print(str1[i]+"");
          }
      }
  }