/*Assignment 1: Method Overloading
Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:
Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.
Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:
Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.*/
class Calculator
  {
    void add (int a,int b)
    {
      System.out.println("addition of two variables: "+(a+b));
    }
    void add(int a,int b,int c)
    {
      System.out.println("addition of three variables: "+(a+b+c));
    }
    void add(int a,int b,int c,int d)
    {
      System.out.println("addition of four variables: "+(a+b+c+d));
    }
  }
    class Calculate
      {
        public static void main(String[]args)
        {
          Calculator cl=new Calculator();
          cl.add(12,31);
          cl.add(45,25,35);
          cl.add(17,31,71,13);
      
        }
      }