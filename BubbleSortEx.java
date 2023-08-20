import java.util.Scanner;
class BubbleSort
  {
    public static void bubbleSort(int array[],int size)
    {
      int temp=0;
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(array[i]>array[j])
              {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
              }
            }
        }
    }
  }
class BubbleSortEx
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("Enter the array elements");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
      BubbleSort.bubbleSort(array,size);
      System.out.println("after sorting the elements are:");
      for(int i=0;i<size;i++)
        {
          System.out.println(array[i]+"");
        }
    }
  }