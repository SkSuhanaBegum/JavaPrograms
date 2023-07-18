//employee details by initializing the object using methods through array of objects
import java.util.Scanner;
class Emp1
  {
    String Emp_name;
    int Emp_Id;
    String Role;
    int Salary;
    public void display()
    {
      System.out.println("Name: "+Emp_name+ "\n" +"Emp-Id: "+Emp_Id+ " \n"+ "Role: "+Role+ "\n"+"Salary:"+Salary);
    }
    public void insertEmp1details(String name,int id,String role,int Sal)
    {
      Emp_name=name;
      Emp_Id=id;
      Role=role;
      Salary=Sal;
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the No.of Employees: ");
      int len=sc.nextInt();
      Emp1 emp[]=new Emp1[len];
      for(int i=0;i<len;i++)
        {
          emp[i]=new Emp1();
          System.out.println("Enter the"+(i+1)+" Empdetails");
          System.out.println("Enter Name: ");
          //emp[i].name=sc.next();
         System.out.println("Enter Id: ");
          //emp[i].id=sc.nextInt();
          System.out.println("Enter role: ");
          //emp[i].role=sc.nextInt();
          System.out.println("Enter Salary: ");
emp[i].insertEmp1details(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
        }
      for(int i=0;i<len;i++)
        {
          emp[i].display();
        }
    }
  }
