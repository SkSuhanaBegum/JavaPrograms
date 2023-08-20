import java.util.Scanner;
class Sample
  {
    public void linearSearch(int array[],int key)
    {
      boolean isFind=false;
      int index=-1;
      for(int i=0;i<array.length;i++)
        {
          if(array[i]==key)
          {
            isFind=true;
            index=i;
            break;
          }
        }
      if(isFind==true)
      {
        System.out.println(key+"the element is found at "+index+" position");
      }
    }
  }
class LinearSearchEx
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      Sample s=new Sample();
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
      System.out.println("enter the elemnet which you want to search");
      int key=sc.nextInt();
      s.linearSearch(array,key);
    }
  }