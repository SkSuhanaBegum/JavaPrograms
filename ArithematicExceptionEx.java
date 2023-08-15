class ArithematicExceptionEx
  {
    public static void main(String[] args)
    {
      int num1=39,num2=0;
      try
        {
      int div=num1/num2;
      }
      catch(Exception e)
        {
          System.out.println(e);
      System.out.println("exception raised");
    }
  }
  }