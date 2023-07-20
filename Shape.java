//method overloading example 
class Shape
  {
    void area()
    {
      System.out.println("to display areas for shapes");
    }
    void area(float length,float breadth)
    {
      System.out.println("Area of rectangle is: "+(length*breadth));
    }
    void area(double side)
    {
      System.out.println("Area of Square is: "+(side*side));
    }
    void area(int base,int height)
    {
      System.out.println("Area of Triangle:"+(0.5*base*height));
    }
    void area(float radius)
    {
      System.out.println("Area ofCircle is: "+(3.14*radius*radius));
    }
  }
class Main
  {
    public static void main(String[]args)
    {
      Shape sh=new Shape();
      sh.area();
      sh.area(24.4f,22.3f);
      sh.area(17.0);
      sh.area(31.17f);
      
    }
  }