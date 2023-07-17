/* 
Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.
*/
class Em
{
 String   Emp_name;
  String designation;
  int salary;
  Em(String name,String des, int sal)
  {
    Emp_name=name;
    designation=des;
    salary=sal;
 }
  public void display()
  {
    System.out.println(Emp_name + " " + designation + " " +salary);
  }
  public static void main(String args[])
  {
    Em Emp=new Em("shanu","manager",75000);
    Em Emp1=new Em("chaitu","manager",75000);
    Em Emp2=new Em("rashid","agent",50000);
    Emp.display();
    Emp1.display();
    Emp2.display();
  }
}