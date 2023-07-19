/*Assignment 2: Multilevel Inheritance

Create a class called "Vehicle" with the following attributes:
String make
String model
int numDoors
boolean isConvertible*/
class Vehicle
  {
    String name;
    String make;
    String model;
    int numDoors;
    //boolean isConvertible;
    void model()
    {
      System.out.println("Every car Having Different Model");
    }
  }
class TwoWheeler extends Vehicle
{
  TwoWheeler(String name,String make,String model,int numDoors)
  {
    System.out.println("Vehicle is: "+name+ "\n"+"Make: "+make+ "\n"+ "Model"+ model+ " \n"+"Doors:"+numDoors);
  }
}

class FourWheeler extends Vehicle
  {
    FourWheeler(String name,String make,String model,int numDoors)
  {
    System.out.println("Vehicle is: "+name+ "\n"+"Make: "+make+ "\n"+ "Model"+ model+ " \n"+"Doors:"+numDoors);
  }
  }
class Main
  {
    public static void main(String[]args)
    {
      TwoWheeler two=new TwoWheeler("Bike","Yamaha","Rx-100",0);
      TwoWheeler two1=new TwoWheeler("Cycle","BSA","Ladybird",0);
      //ThreeWheeler three=new ThreeWheeler("Auto","TataMotors","Tata",2);
      FourWheeler four=new FourWheeler("Car","Honda","Hyundai Exter",4);
    }
  }



/*class Threewheeler extends Vehicle
  {
    ThreeWheeler(String name,String make,String model,int numDoors)
  {
    System.out.println("Vehicle is: "+name+ "\n"+"Make: "+make+ "\n"+ "Model"+ model+ " \n"+"Doors"+numDoors);
  }
}*/