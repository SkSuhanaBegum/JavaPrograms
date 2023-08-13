class StartsEndsWith
  {
public static void main(String args[])
  {
    String str="Pushpa";
    boolean result=str.startsWith("Push");
    System.out.println("stats with Push "+result);
   boolean result1=str.startsWith("Sh");
  System.out.println("starts With Sh"+result1);
    boolean result2=str.endsWith("pa");
    System.out.println("ends with pa "+result2);
    boolean result3=str.endsWith("Pa");
    System.out.println("ends with Pa "+result3);   
  }
  }