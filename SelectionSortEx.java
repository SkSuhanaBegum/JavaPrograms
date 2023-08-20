import java.util.Scanner;
class Sample
  {
    public void selectionSorting(int array[],int size)
    {
      int i,j,temp=0;
      for(i=0;i<size;i++)
        {
          int min=i;
          for(j=i+1;j<size;j++)
            {
              if(array[j]<array[min])
              {
                min=j;
              }
            }
          temp=array[min];
          array[min]=array[i];
          array[i]=temp;
        }
    }
  }
class SelectionSortEx
  {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
      Sample s=new Sample();
      s.selectionSorting(array,size);
      System.out.println("after sorting the elements are");
      for(int i=0;i<size;i++)
        {
          System.out.println(array[i]+"");
        }
    }
  }