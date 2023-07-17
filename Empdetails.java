/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.*/
class Empdetails
  {
    String Emp_name;
    String Emp_designation;
    int Salary;
    public void insertEmpdetails(String Ename,String des,int sal)
    {
      Emp_name=Ename;
      Emp_designation=des;
      Salary=sal;
    }
    public void display()
    {
      System.out.println("Employee name: "+Emp_name);
      System.out.println("Employee designation: "+Emp_designation);
      System.out.println("Employee Salary: "+Salary);
    }
    public static void main (String[]args)
    {
      Empdetails ed=new Empdetails();
      Empdetails ed1=new Empdetails();
      ed.insertEmpdetails("Sonu","TeamLeader",35000);
      ed1.insertEmpdetails("Sonal","Project_Manager",55000);
      ed.display();
      ed1.display();
    }
  }