import java.util.Scanner;
class Emp
  {
    int Emp_ID;
    String Emp_name;
    String Dept;
    int Emp_Salary;
    public void display()
    {
      System.out.println("Emp name is: "+Emp_name);
      System.out.println("Emp ID is: "+Emp_ID);
      System.out.println("Dept is: "+Dept);
      System.out.println("Emp Salary is: " +Emp_Salary);
    }
    public static void main(String[]args)
    {
      Emp ep=new Emp();
      Emp ep1=new Emp();
      Emp ep2=new Emp();
      ep.Emp_ID=2132;
      ep.Emp_name="Sonal";
      ep.Dept="Computers";
      ep.Emp_Salary=22000;
      ep1.Emp_ID=2134;
      ep1.Emp_name="Sonu";
      ep1.Dept="Computers";
      ep1.Emp_Salary=23000;
      ep2.Emp_ID=2134;
      ep2.Emp_name="Sofi";
      ep2.Dept=" Science";
      ep2.Emp_Salary=22000;
      ep.display();
      ep1.display();
      ep2.display();
    }
  }