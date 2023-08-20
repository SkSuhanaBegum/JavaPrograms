import java.util.Scanner;
class InsertionSortEx
  {
    public static void insertionSort(int arr[],int size)
    {
      int i,j,key;
      for(i=1;i<size;i++)
        {
          key=arr[i];
          j=i-1;
          while(j>=0 && key<=arr[j])
            {
              arr[j+1]=arr[j];
              j=j-1;
            }
          arr[j+1]=key;

        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("before sorting");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      insertionSort(arr,size);
      System.out.println();
      System.out.println("after sorting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
  }