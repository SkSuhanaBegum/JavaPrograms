//Create a superclass called "Animal" with the following attributes:String name,int legs,String breed
class Animal
  {
    String name;
    int legs;
    String breed;
    void types()
    {
      System.out.println("Animals are having different types");
    }
  }
class Name extends Animal
  {
    Name(String name,int legs,String breed)
    {
    System.out.println("Animal name: "+name+ "\n"+ "Legs: "+legs+ "\n"+ "Breed: "+breed);
  }
  
 public static void main(String[]args)
  {
  Name na=new Name("Dog",4,"Hunting");
  Name na1=new Name("Cat",4,"domestic");
  }
  }

