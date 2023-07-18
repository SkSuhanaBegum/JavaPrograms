import java.util.Scanner;
class LastOccurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the character to find the last occurance index position in the given string");
      char ch=sc.next().charAt(0);
      int i;
     /* int pos=str.lastIndexOf(ch);
      System.out.println("last occcurance of the "+ch+" in the given string is "+pos);*/
      for(i=0;i<str.length();i++)
        {
          if(str.charAt(0)==ch)
          {
            
          }
        }
          System.out.println(i);
    }
  }