class ArrayIndexExcepEx
  {
    public static void main(String[] args)
    {
      int arr[]={12,23,43,51,65};
      try
        {
        System.out.println(arr[6]);
      }
      catch(Exception e)
        {
          System.out.println(e);
          System.out.println("exception occured");
        }
   }
  }