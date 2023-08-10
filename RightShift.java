import java.util.Scanner;
class RightShift
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
      System.out.println("Enter the shifiting Position: ");
      int pos=sc.nextInt();
      System.out.println("Before Shifting: ");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+ " ");
        }
      System.out.println();
      int temp=a[size-1];
      for(int i=0;i<pos;i++)
        {
        for(int j=size-1;j>0;j--)
            {
              a[j]=a[j-1];
            }
          }
      a[0]=temp;
      System.out.println("after performing Right Shift on" + pos + "Position");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+ " ");
        }
      
    }
  }