/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a method named setStudentDetails that takes arguments for each variable and initializes the object. Display the student's details using a separate method.*/
class Studentdetails {
  String name;
  int Roll_No;
  String Grade;

  public void insertStudentdetails(String na, int roll, String gr) {
    name = na;
    Roll_No = roll;
    Grade = gr;
  }

  public void display() {
    System.out.println(" Student Name: " + name);
    System.out.println(" Student Roll_No: " + Roll_No);
    System.out.println("Grade: " + Grade);
  }

  public static void main(String[] args) {
    Studentdetails sd = new Studentdetails();
    Studentdetails sd1 = new Studentdetails();
    sd.insertStudentdetails("Suhana", 2105116, "a");
    sd1.insertStudentdetails("Rey", 2105117, "b");
    sd.display();
    sd1.display();
  }
}
