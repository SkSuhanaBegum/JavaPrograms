/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."*/
class Vehicle
  {
    void start_engine()
    {
      System.out.println("Engine Start");
    }
  }
class Car extends Vehicle
  {
    void start_engine()
    {
      System.out.println("car engine Starting");
    }
  }
class Motorcycle extends Vehicle
  {
    void start_engine()
    {
      System.out.println("Motorcycle engine starting.");
    }
  }
class EngineEx
  {
    public static void main(String[]args)
    {
      Vehicle vc=new Vehicle();
      vc.start_engine();
      Vehicle car=new Car();
      car.start_engine();
      Vehicle mc=new Motorcycle();
      mc.start_engine();
    }
  }