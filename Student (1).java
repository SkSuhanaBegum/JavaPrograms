/*Create a class named "Student" with private attributes: name, rollNumber, age, and marks.
Implement getter and setter methods for all attributes.
Ensure that the marks attribute can only be accessed through getter and setter methods, not directly.
Add a method named calculateGrade() that calculates the grade based on the marks and returns it as a string (e.g., "A+", "B", "C", etc.).
Add a method named displayDetails() that displays the student's name, roll number, age, marks, and grade.
In the main method, create an array of Student objects to store information for multiple students. Prompt the user to input data for each student, calculate their grades, and display their details.*/
import java.util.Scanner;
class Student
  {
    private String name;
    private int rollno;
    private int age;
    private int marks;
    String grade;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
    public void setRollno(int rollno)
    {
      this.rollno=rollno;
    }
    public int getRollno()
    {
      return rollno;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return age;
    }
    public void setMarks(int marks)
    {
      this.marks=marks;
    }
    public int getMarks()
    {
      return marks;
    }
    public String calculateGrade()
    {
      if((getMarks()>=90)&&(getMarks()<=100))
      {
       grade="A Grade";
       return grade;
      }
      else if((getMarks()<90)&&(getMarks()>=75))
      {
        grade="B Grade";
        return grade;
      }
      else if((getMarks()<75)&&(getMarks()>=60))
      {
        grade="C Grade";
        return grade;
      }
      else if((getMarks()<60)&&(getMarks()>=45))
      {
        grade="D Grade";
        return grade;
      }
      else
      {
       grade="Fail";
        return grade;
      }
    }
    public void displayDetails()
    {
      System.out.println("Name: "+getName());
      System.out.println("Rollno: "+getRollno());
      System.out.println("Age: "+getAge());
      System.out.println("Marks: "+getMarks());
      System.out.println("Grade: "+ calculateGrade());
    }
  }
class DataEncaps2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter how many students data we have to store");
      int count=sc.nextInt();
      Student st[]=new Student[count];
      for(int i=0;i<st.length;i++)
        {
          st[i]=new Student();
          System.out.println("enter the student name");
          st[i].setName(sc.next());
          System.out.println("enter the roll no");
          st[i].setRollno(sc.nextInt());
          System.out.println("enter the age");
          st[i].setAge(sc.nextInt());
          System.out.println("enter marks");
          st[i].setMarks(sc.nextInt());
        }
      for(int i=0;i<st.length;i++)
        {
          st[i].displayDetails();
        }
        }
    }