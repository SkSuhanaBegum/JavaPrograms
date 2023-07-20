/*Create a base class called Animal with a method make_sound that prints a generic sound made by an animal. Create two derived classes, Dog and Cat, that override the make_sound method to print "Woof" and "Meow" respectively.*/
class Animal
  {
    void make_sound()
    {
      System.out.println("Different animal can have different sounds");
    }
  }
class Dog extends Animal
  {
    void make_sound()
    {
      System.out.println(" Dog Sounds like Bow Bow");
    }
  }
class Cat extends Animal
  {
    void make_sound()
    {
      System.out.println("Cat Sounds like Meom meom");
    }
  }
class Example
  {
    public static void main(String[]args)
    {
      Animal am=new Animal();
      am.make_sound();
      Animal dog=new Dog();
      dog.make_sound();
      Animal cat=new Cat();
      cat.make_sound();
    }
  }