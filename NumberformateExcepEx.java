class NumberformateExcepEx
  {
    public static void main(String[] args)
    {
      String str="123abc@";
      try
         {
      int str1=Integer.valueOf(str);
         }
      catch(Exception e)
        {
      System.out.println(e);
          System.out.println("exception occured");
    }
  }
  }