/*Custom Unchecked Exception Build a simple calculator program in Java. Create a custom unchecked exception called CalculatorException. This exception should be thrown when any invalid mathematical operation or input is provided to the calculator (e.g., division by zero, invalid operator, etc.). Implement the calculator's functionality and handle the CalculatorException in a way that displays an appropriate error message.*/
import java.util.Scanner;
class CalculatorException extends Exception
  {
    CalculatorException(String message)
    {
      super(message);
      }
class CalculatorOperation
  {
    public static double calciValidate(double num1,double num2,char  op) throws CalculatorException
    {
     double result;
      switch (op)
        {
          case '+':
             return num1+num2;
          case '-':
             return num1-num2;
          case '*':
           return num1*num2;
          case '/':
        if(num2==0)
    {
      throw new CalculatorException("divided by zero is not allowed");
      return num1/num2;
    }
      else
    {
        System.out.println("invalid symbol");
      }
    }
  }
  }
class CalculatorExcep
  {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter num1 ");
      int num1=sc.nextInt();
      System.out.println("enter num2");
      int num2=sc.nextInt();
      System.out.println("enter the operator");
      char op=sc.next().charAt(0);
      try{
        CalculatorOperation.calciValidate(num1,num2,op);
      }
      catch(CalculatorException e)
        {
          System.out.println(e);
        }
      System.out.println("exception handled");
    }
  }