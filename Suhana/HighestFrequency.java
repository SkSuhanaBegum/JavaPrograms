//WAP to find highest frequency character in a string.
import java.util.Scanner;
class HighestFrequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      char arr[]=str.toCharArray();
      int size=arr.length;
      boolean a[]=new boolean[size];
      char ch=' ';
       for(int i=0;i<size;i++)
        {
          a[i]=false;
        }
      int max=0;
      for(int i=0;i<size;i++)
        {
          int count=1;
          if(a[i]==true)
            continue;
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
              {
                count++;
                a[j]=true;
              }
              if(i==0)
              {
                max=count;
                ch=arr[i];
              }
            }
          //System.out.println(count);
          //System.out.println(max);
              if(max<count)
              {
                max=count;
                ch=arr[i]; 
              }
          //System.out.println(ch);
              /*else
             {
            continue;
          }*/
        }
          System.out.println("In the given string "+ch+" is occured for more times");
     }
  }