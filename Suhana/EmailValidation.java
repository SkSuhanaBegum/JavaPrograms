import java.util.Scanner;
class EmailValidation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the email address");
      String email=sc.nextLine();
      int acount=0,count1=0,count2=0,dcount=0;
      for(int i=0;i<email.length();i++)
        {
          char ch=email.charAt(i);
          if(ch>='a'||ch<='z'||ch>='A'||ch<='Z')
          {
            acount++;
          }
          if(ch>='0'&&ch<='9')
          {
            dcount++;
          }
          if(ch=='@')
          {
            count1++;
          }
          if(ch=='.')
          {
            count2++;
          }
        }
          if(acount>0 && dcount>0 && count1>0 && count2>0)
          {
            System.out.println("Given mail id is valid");
          }
          else{
            System.out.println("Given mail id is invalid");
          }
        }
    }
