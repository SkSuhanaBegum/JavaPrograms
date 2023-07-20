/*Create a class Shape with a method area that returns 0. Derive two classes Circle and Square from Shape. Override the area method in both derived classes to calculate and return the area of a circle and a square, respectively. Allow the user to input the required parameters (e.g., radius for a circle, side length for a square).*/
import java.util.Scanner;
class Shape2
{
  void area(){
    System.out.println("prints area of both square and circle");
  }
}
class Circle extends Shape
{
  void area(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter radius of the circle");
  float radius= sc.nextFloat();
  System.out.println("Area of the circle is" +(3.14 * radius * radius));
  }
}
class Square extends Shape{
  void area()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter side of the square");
    float side= sc.nextFloat();
    System.out.println("Area of the square is " + (side * side));
      }
}
class ShaEx{
  public static void main(String args[]){
    Shape sh=new Shape();
  Shape cr=new Circle();
    Shape sq=new Square();
    sh.area();
    cr.area();
    sq.area();
  }
}