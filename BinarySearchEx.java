import java.util.Scanner;
class Sample
  {
    public static void binarySearch(int a[],int first,int last,int key)
    {
      int mid=(first+last)/2;
      while(first<=last)
        {
          if(a[mid]<key)
          {
            first=mid+1;
          }
          else if(a[mid]==key)
          {
            System.out.println("element is found at position "+mid);
            break;
          }
          else
          {
            last=mid-1;
          }
          mid=(first+last)/2;
        }
      if(first>last)
      {
        System.out.println("element is not found");
      }
         }
  }
class BinarySearchEx
  {
    public static void main(String args[])
    {
      int arr[]={10,20,30,40,50,60};
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the element to search");
      int key=sc.nextInt();
      int first=0;
      int last=arr.length-1;
      Sample.binarySearch(arr,first,last,key);
    }
  }