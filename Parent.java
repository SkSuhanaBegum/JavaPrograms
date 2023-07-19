class Parent
  {
    void Behaviour()
    {
      System.out.println("Behaviour of childrens same as parents");
    }
  }
 class Sister extends Parent
  {
     void features()
    {
      System.out.println("Same features of her Mother");
    }
  }
class Brother extends Parent{
  void attitude()
  {
    System.out.println("Same attitude of his Father");
  }
}
class Hierachy
  {
    public static void main(String[]args)
    {
      Brother bro=new Brother();
      bro.attitude();
      bro.Behaviour();
      Sister sis=new Sister();
      sis.features();
      sis.Behaviour();
    }
  }