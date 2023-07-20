/*Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:
Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.*/
class MathOperations
  {
    void arithmetic()
    {
      System.out.println("Different operators can perform Different operations");
    }
    void arithmetic(int a,int b)
    {
      System.out.println("Addition: "+(a+b));
    }
    void arithmetic(float a,int b)
    {
      System.out.println("Subtraction: "+(a-b));
  }
    void arithmetic(double a,int b)
    {
      System.out.println("Multiplication: "+(a*b));
    }
    void arithmetic(float a,float b)
    {
      System.out.println("Division: "+(a/b));
    }
  }
class Operations
  {
    public static void main(String[]args)
    {
      MathOperations mat=new MathOperations();
      mat.arithmetic();
      mat.arithmetic(856,456);
      mat.arithmetic(45.32f,22);
      mat.arithmetic(56,89);
      mat.arithmetic(32.5f,14.36f);
      
    }
  }