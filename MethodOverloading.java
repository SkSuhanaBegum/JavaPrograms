class Shape
  {
    public void area()
    {
      System.out.println("the area of rectangle,arae of circle,area of square");
    }
    public void area(int length,int breadth)
    {
      System.out.println("area of rectangle is:"+(length*breadth));
    }
    public void area(int side)
    {
      System.out.println("area of the square is:"+(side*side));
    }
    public void area(double pi,int r)
    {
      System.out.println("area of the circle"+(pi*r*r));
    }
  }
class MethodOverloading
  {
    public static void main(String[] args)
    {
      Shape sc=new Shape();
      sc.area();
      sc.area(12,13);
      sc.area(2);
      sc.area(3.14,2);
    }
  }