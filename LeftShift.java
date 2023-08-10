import java.util.Scanner;
class LeftShift
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int size=sc.nextInt();
      System.out.println("Enter the elements into the Array: ");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }

      System.out.println("Enter the position value which we can shift: ");
      int pos=sc.nextInt();
      System.out.println("Before shifting: ");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+ " ");
        }
      System.out.println();
      for(int i=0;i<pos;i++)
        {
          int temp=a[0];
          for(int j=0;j<size-1;j++)
            {
              a[j]=a[j+1];
            }
          a[size-1]=temp;
        }
      System.out.println("after performing left Shift on " + pos + "position");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+ " ");
        }
      
    }
  }