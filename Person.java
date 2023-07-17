/*Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Person
  {
    String PersonName;
    int Person_Age;
    String Address;
    Person(String name,int age,String Add)
    {
      PersonName=name;
      Person_Age=age;
      Address=Add;
    }
    public void display()
    {
      System.out.println("Person Name: "+PersonName);
      System.out.println("Person_Age: "+Person_Age);
      System.out.println("Address: "+Address);
    }
    public static void main(String[]args)
    {
      Person person=new Person("Reina",22,"32-15/2-90 BNR nagar 3rd line");
      Person person1=new Person("Rey",23,"32-15/1-90 BNR nagar 2nd line");
      Person person2=new Person("Sonu",22,"32-15/2-90 BNR nagar 3rd line");
      Person person3=new Person("Sona",23,"Little Flower St 3rd line");
      person.display();
      person1.display();
      person2.display();
      person3.display();
      }
  }
  