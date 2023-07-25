/*Assignment 2: Animal Interface Create an interface called Animal with the following methods:
sound(): Abstract method that returns a String representing the sound the animal makes.
eat(String food): Abstract method that takes a String parameter food representing the food the animal eats.
Now, create classes Dog, Cat, and Duck, implementing the Animal interface. Write appropriate code for each animal's sound and eating habit*/
interface Animal
  {
    public String sound();
    public void eat(String food);
  }
class Dog implements Animal{
  String dog_sound;
  public Dog(String dog_sound)
  {
    this.dog_sound=dog_sound;
  }
  public String sound()
  {
    return dog_sound;
  }
public void eat(String food)
  {
    System.out.println("dog eats "+food);
  }
}
class Cat implements Animal{
  String cat_sound;
  public Cat(String cat_sound)
  {
    this.cat_sound=cat_sound;
  }
  public String sound()
  {
    return cat_sound;
  }
  public void eat(String food)
  {
    System.out.println("cat Eats: "+food);
  }
}
class Duck implements Animal
  {
    String duck_sound;
    public Duck(String duck_sound)
    {
      this.duck_sound=duck_sound;
    }
    public String sound()
    {
      return duck_sound;
    }
    public void eat(String food)
    {
      System.out.println("duck eats: "+food);
    }
  }
class Example
  {
    public static void main(String[] args)
    {
      Dog puppy=new Dog("Bow....Bow....");
      String d=puppy.dog_sound;
      System.out.println("Dog sounds: "+d);
      puppy.eat("Chicken peace");
      Cat bel=new Cat("meom...meom....");
      String c=bel.cat_sound;
      System.out.println("Cat sounds: "+c);
      bel.eat("curd rice or curd");
      Duck duk=new Duck("Quack....Quack...");
      String u=duk.duck_sound;
      System.out.println("Duck sounds: "+u);
      duk.eat("Wheat or oats");
    }
  }