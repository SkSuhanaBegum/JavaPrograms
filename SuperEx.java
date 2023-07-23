//when we have parent and child class having the same variable name then if you are calling the parent class variable in the child class we have to use super keyword.
class SuperEx
  {
    String name="Suhana";
    String city="Vijayawada";
  }
class Frnd extends SuperEx{
  String name="Suhana Frnd";
  String city="Hyderabad";
  void display()
  {
    System.out.println(super.name+" "+super.city);
    System.out.println(name+ " "+city);
  }
}
class Example
  {
    public static void main(String[]args)

    {
      Frnd fd=new Frnd();
      fd.display();
      
    }
  }