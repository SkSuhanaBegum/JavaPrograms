import java.util.ArrayList;
class Book
  {
    int Book_Id;
    String Book_title;
   String Book_Name;
    int Publishing_year;
    Book(int book_Id,String book_title,String book_name, int Publishing_year)
    {
      this.Book_Id=book_Id;
      this.Book_title=book_title;
      this.Book_Name=book_name;
      this.Publishing_year=Publishing_year;
    }
    
  }
class Book_Publish
  {
    public static void main(String[]args)
    {
      ArrayList<Book> al=new ArrayList<Book>();
      Book b1=new Book(123,"Queen of Fire","Rangachari",2022);
      Book b2=new Book(245,"A child of Destiny","RamaKrishna",2020);
      Book b3=new Book(456,"Let us Dream","francis",2020);
      Book b4=new Book(116,"My Journey","Suhana",2045);
      Book b5=new Book(636,"Fly Like A Bird","Raju",2020);
      for(Book book:al)
        {
          System.out.println(book.Book_Id+ " "+book.Book_title+" "+book.Book_Name+" "+book.Publishing_year);
        }
    }
  }