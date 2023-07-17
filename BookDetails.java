/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
class BookDetails
  {
  String Book_title;
    String Author;
    int Publication_year;
    public void insertBookDetails(String bt,String a,int p)
    {
       Book_title=bt;
      Author=a;
      Publication_year=p;
    }
    public void display()
    {
      System.out.println("Book Name is: "+Book_title);
      System.out.println("Author of the book is: "+Author);
      System.out.println("Publication of the book year is: "+ Publication_year);
    }
    public static void main(String[] args)
    {
      BookDetails Bo=new BookDetails();
      BookDetails Bo1=new BookDetails();
      Bo.insertBookDetails("Listen to Your Heart: The London Adventure"," Ruskin Bond",2022);
      Bo1.insertBookDetails("Queen of Fire","Devika Rangachari",2022);
      Bo.display();
      Bo1.display();
    }
    
  }