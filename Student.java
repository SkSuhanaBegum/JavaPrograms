/*
Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.
  */
class Student
  {
  String name;
  int Roll_No;
  String Grade;
    Student(String name,int roll,String grade)
    {
      name=name;
      Roll_No=roll;
      Grade=grade;
    }
     public void display()
    {
    System.out.println(" Student Name: " + name);
    System.out.println(" Student Roll_No: " + Roll_No);
    System.out.println("Grade: " + Grade);
  }
    public static void main(String[]args)
    {
      Student s=new Student("Suhana",6,"A");
      Student s1=new Student("Rey",7,"A");
      Student s2=new Student("Suhas",8,"A");
      s.display();
      s1.display();
      s2.display();
    }
  }