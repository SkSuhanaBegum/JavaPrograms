//display the book details by initializing the object using methods through array of objects
import java.util.Scanner;
class Book
  {
  String title;
  int id;
  String author;
  int year;
public void displayDetails() {
    System.out.println(title + " " + id + " " + author + " " + year);
  }
public void setDetails(String t, int i, String a, int y) {
    title = t;
    id = i;
    author = a;
    year = y;
  }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("how many number of books");
    int count = sc.nextInt();
    Book b[] = new Book[count];
    for (int i = 0; i < count; i++)// i=0//i=1//i=2
    {
      System.out.println("enter book" + (i + 1) + " details");
      b[i] = new Book();
      System.out.println("enter the title of the book");
      // String =sc.next();
      System.out.println("enter the id of the book");
      // int bid=sc.nextInt();
      System.out.println("enter author of the book");
      // String babnameuthor=sc.next();
      System.out.println("enter year");
      // int byear=sc.nextInt();
      // b[i].setDetails(bname,bid,bauthor,byear);
      b[i].setDetails(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
    }
    for (int i = 0; i < count; i++) {
      b[i].displayDetails();
    }
  }
}