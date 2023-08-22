import java.util.*;
class Hash
  {
    public static void main(String[] args)
    {
      HashSet<String>Fruits=new HashSet<String>();
      Fruits.add("Apple");
      Fruits.add("Sapota");
      Fruits.add("Watermelon");
      Fruits.add("Banana");
      Fruits.add("Banana");
      Fruits.add(" ");
      Fruits.add(" ");
      Iterator ys=Fruits.iterator();
      while(ys.hasNext())
        {
          System.out.println(ys.next());
        }
    }
  }