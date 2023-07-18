//Student details by intializing the objet using methods through array of objects
import java.util.Scanner;
class Student1
  {
    String Name;
    int Rollno;
    String Sec;
    //static String clg=KBN;
    public void display()
    {
      System.out.println(Name+ " "+Rollno+ " "+Sec);
    }
    public void insert(String name,int No,String sec)
    {
      Name=name;
      Rollno=No;
      Sec=sec;
      //clg=clg;
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the No.of Students: ");
      int total=sc.nextInt();
      Student1 student[]=new Student1[total];
      for(int i=0;i<total;i++)
        {
          student[i]=new Student1();
          System.out.println("Enter the"+(i+1)+"Studentdata");
          System.out.println("Enter Name: ");
          System.out.println("RollNo: ");
          System.out.println("Sec: ");
          //System.out.println("Clg: ");
          student[i].insert(sc.next(),sc.nextInt(),sc.next());
        }
      for(int i=0;i<total;i++)
        {
          student[i].display();
        }
      
    }
    
  }