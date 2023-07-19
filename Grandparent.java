class Grandparent
  {
    void money()
    {
      System.out.println(" Money shares her childrens");
    }
  }
class Father extends Grandparent
  {
    void displain()
    {
      System.out.println("To tell how to behave around us");
    }
  }
class Son extends Father
  {
    void Attitude()
    {
      System.out.println(" Same as his Father");
    }
  }
class Daughter extends Father
{
  void features()
  {
    System.out.println("Same as her mother");
  }
}
class Hybrid{
 public static void main(String[] args)
  {
  Daughter dr=new Daughter();
      dr.features();
      dr.displain();
      Son sn=new Son();
      sn.Attitude();
sn.displain();
  Father dad=new Father();
  dad.displain();
      
    }
  }