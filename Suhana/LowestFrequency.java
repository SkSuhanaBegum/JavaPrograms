//WAP to find lowest frequency character in a string.
import java.util.Scanner;
class LowestFrequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      char arr[]=str.toCharArray();
      int size=arr.length;
      boolean arr1[]=new boolean[size];
      for(int i=0;i<size;i++)
        {
          arr1[i]=false;
        }
      char ch=' ';
      int min=0;
      for(int i=0;i<size;i++)
        {
          int count=0;
          if(arr1[i]==true)
          {
            continue;
          }
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
              {
                count++;
                arr1[j]=true;
              }
              if(i==0)
              {
                min=count;
                ch=arr[i];
              }
            }
          if(min>count)
          {
            min=count;
            ch=arr[i];
          }
        }
      System.out.println("In the given string "+ ch +" has occured less times");
    }
  }