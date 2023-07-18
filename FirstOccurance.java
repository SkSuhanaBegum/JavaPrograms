import java.util.Scanner;
class FirstOccurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the character to find the first occurance of that character in the given string");
      char ch=sc.next().charAt(0);
      int i;
      for(i=0;i<str.length();i++)
        {
         if(str.charAt(i)==ch)
         {
          break;
         }
        }
      System.out.println("The first occurance of the "+ch+" in the given string is "+i);
     /* int position=str.indexOf(ch);
      System.out.println("The first occurance of the "+ch+" in the given string is "+position);*/
     /* int pos=str.indexOf(ch,0);
      System.out.println("The first occurance of the "+ch+" in the given string is "+pos);*/
    }
  }