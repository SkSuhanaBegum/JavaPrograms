/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
class Cardetails
  {
   String Make;
    String Model;
    int year;
    public void insertCardetails(String mak,String mod,int yr)
    {
      Make=mak;
      Model=mod;
      year=yr;
    }
    public void display()
    {
      System.out.println("Car: "+Make);
      System.out.println("Car Model: "+Model);
      System.out.println("Year: "+year);
    }
    public static void main (String[] args)
    {
      Cardetails  car=new Cardetails();
      car.insertCardetails("ford","Henry Ford",1903);
      car.display();
    }
  }