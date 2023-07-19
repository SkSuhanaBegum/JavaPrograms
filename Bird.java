class Bird
  {
    void eat()
    {
      System.out.println("Eats food");
    }
  }
    class Cuckoo extends Bird
    {
      void song()
      {
        System.out.println("Sings");
      }
    }
    class SingleInheritance
      {
        public static void main(String[] args)
        {
      Cuckoo c=new Cuckoo();
      c.song();
      c.eat();
        }
      }