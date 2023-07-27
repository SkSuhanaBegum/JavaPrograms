import java.util.Scanner;
public class Grading
{
public static void main(String args[])
  {
    double percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter physics marks");
    double physics=sc.nextDouble();
    System.out.println("Enter chemistry marks");
    double chemistry=sc.nextDouble();
    System.out.println("Enter maths marks");
    double maths=sc.nextDouble();
    System.out.println("Enter telugu marks");
    double telugu=sc.nextDouble();
    System.out.println("Enter english marks");
    double english=sc.nextDouble();
    double total_marks= 
(physics+chemistry+maths+telugu+english);
    System.out.println("Enter the Maximum_marks");
    double Maximum_marks=sc.nextDouble();
    percentage=(total_marks/Maximum_marks)*100;
    System.out.println("percentage is "+ percentage);
    if(percentage>=90)
    {
      System.out.println("Grade A");
    }
    else if(percentage>=80&&percentage<90))
    {
      System.out.println("Grade B");
    }
   else if(percentage>=70&&percentage<80)
    {
      System.out.println("Grade c");
    }
   else if(percentage>=60&&percentage<70)
    {
      System.out.println("Grade D");
    }
    else if(percentage>=40&&percentage<60)
    {
      System.out.println("Grade E");
    }
    else
    {
     System.out.println("Fail"); 
    }
   }
}
  