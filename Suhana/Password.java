import java.util.Scanner;
class Password
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the password");
      String pass=sc.nextLine();
      int ucount=0,lcount=0,dcount=0;
      char ch=0;
      int len=pass.length();
      password(pass,ucount,lcount,dcount,ch,len);
    }
    public static void password(String pass,int ucount,int lcount,int dcount,char ch,int len)
    {
      if(len>=8)
      {
      for(int i=0;i<len;i++)
        {
          ch=pass.charAt(i);
          if(ch>='a'||ch<='z')
          {
            lcount++;
          }
          if(ch>='A'||ch<='Z')
          {
            ucount++;
          }
          if(ch>='0'&&ch<='9')
          {
            dcount++;
          }
        }
      }
        else
        {
          System.out.println("password must contain atleast 8 characters");
        }
      if(lcount>=1 && ucount>=1 && dcount>=1)
      {
        System.out.println("valid password");
      }
      else
        {
        System.out.println("invalid password");
        }
  }
  }