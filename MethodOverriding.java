class Shape
  {
    int length=12,breadth=13;
  int side=12;
    double pi=3.14;
    int r=12;
    void area()
    {
      System.out.println("the area of rectangel,area of circle,area of square");
    }
  }
class Rectangle extends Shape
{
  void area()
  {
    System.out.println("the area of reactangle"+(length*breadth));
  }
}
class Square extends Shape
{
  void area()
  {
    System.out.println("the area of square"+(side*side));
  }
}
class Circle extends Shape
{
  void area()
  {
    System.out.println("the area  of the circle"+(pi*r*r));
  }
}
class MethodOverriding
  {
    public static void main(String[] args)
    {
     Shape shape=new Shape();
      shape.area();
      Shape rectangle=new Rectangle();
      rectangle.area();
      Shape square=new Square();
      square.area();
      Shape circle=new Circle();
      circle.area();
    }
  }
