/*Write a program that takes a sentence as input and capitalizes the first letter of each word in the sentence. Assume that words are separated by spaces.*/
import java.util.Scanner;
class CapitalLetter
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String words[]=str.split(" ");
      int size;
      for(int i=0;i<words.length;i++)
        {
          //size=words[i].length();
                words[i]=words[i].toUpperCase();
              }
             /* else
              {
                continue;
              }*/
             for(int i=0;i<words.length;i++)    
            { 
          System.out.print(words[i]+" ");
            }
        }
    }
