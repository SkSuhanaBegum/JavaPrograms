//WAP to count frequency of each character in a string
import java.util.Scanner;
class CharacterFrequency
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
      for(int i=0;i<size;i++)
        {
          int count=1;
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
            }
          System.out.println(arr[i]+" is repeated for "+count+" times");
        }
      }
  }