//Abstract class example
abstract class Shape
  {
    abstract void area();
    void display()
    {
   System.out.println("Area of the fallowing shapes");
  }
}
class Square extends Shape{
  public void area()
  {
    int side=24;
    System.out.println("Area of the Square is: "+(side*side));
  }
}
class Rectangle extends Shape{
  public void area()
  {
    int length=17;
    int breadth=24;
    System.out.println("Area of Rectangle: "+(length*breadth));
  }
}
class Triangle extends Shape{
  public void area()
  {
    int base=18;
    int height=8;
    System.out.println("Area of Triangle is: "+(0.5*base*height));
  }
}
class Area
  {
    public static void main(String[]args)
    {
      Rectangle rec1=new Rectangle();
      Square sq=new Square();
      Triangle tri=new Triangle();
      rec.display();
      rec1.area();
      sq.area();
      tri.area();
    }
  }