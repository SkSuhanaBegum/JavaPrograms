class Bird1
  {
    void eat()
    {
      System.out.println("Eats food");
    }
  }
class Parrot extends Bird1
  {
    void Fly()
    {
      System.out.println("Flys in Sky");
    }
  }
class Duck extends Parrot{
  void walk()
  {
    System.out.println("Walking");
  }
}
class Multilevel
  {
    public static void main(String[]args)
    {
      Duck s=new Duck();
      s.walk();
      s.Fly();
      s.eat();
    }
  }