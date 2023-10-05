import java.util.*;
class MemberNotFoundException extends Exception{
  MemberNotFoundException(String message){
    super(message);
  }
}
class Book
  {
    int Book_id;
    String Title;
    String Author;
    String Genre;
    int Quantity;
    Book(int Book_id,String Title,String Author,String Genre, int Quantity)
    {
      this.Book_id=Book_id;
      this.Title=Title;
      this.Author=Author;
      this.Genre=Genre;
      this.Quantity=Quantity;
    }
  }
class LibraryMember
  {
    int Member_id;
    String Fullname;
    int age;
    String Mobile_No;
    LibraryMember(int Member_id,String Fullname,int age, String Mobile_No)
    {
      this.Member_id=Member_id;
      this.Fullname=Fullname;
      this.age=age;
      this.Mobile_No=Mobile_No;
    }
  }
class Bookdetails
  {
    ArrayList<Book>booklist=new ArrayList<Book>();
    ArrayList<LibraryMember>memberlist=new ArrayList<LibraryMember>();
    Scanner sc=new Scanner(System.in);
    void addBook()
    {
      int id;
      while(true)
        {
          System.out.println("Enter the Book_Id: ");
       id=sc.nextInt();
      boolean isUnique=true;
          for(Book value:booklist)
            {
              if(value.Book_id==id)
              {
                System.out.println(" Enter Unique Id");
                isUnique=false;
                break;
              }
            }
          if(isUnique)
          {
            System.out.println("id is valid");
            break;
          }
        }
      sc.nextLine();
      System.out.println("Enter the Book_Title:");
      String title=sc.nextLine();
       System.out.println("Enter the Book Author:");
      String author=sc.nextLine();
    System.out.println("Enter the Book Genre:");
      String genre=sc.next();
      System.out.println("Enter the Quantity");
      int quantity=sc.nextInt();
      Book book=new Book(id,title,author,genre,quantity);
      booklist.add(book);
      System.out.println("Book is Added");
    }
      void viewAllBooks()
    {
      if(booklist.size()>0)
      {
      System.out.println("Display All Books");
      for(Book data:booklist)
        {
          
          System.out.println("Book_id: "+data.Book_id);
          System.out.println("Book Title: "+data.Title);
          System.out.println("Book Author: "+data.Author);
          System.out.println("Book Genre: "+data.Genre);
          System.out.println("Book Quantity: "+data.Quantity);
System.out.println("-----------");
        }
        }
      else{
        System.out.println("Books are not at added");
      }
    }
    void searchBookBy_Id()
    {
      if(booklist.size()>0)
      {
        boolean bookFound=false;
        System.out.println("Enter Serching book_id: ");
        int id=sc.nextInt();
        for(Book value:booklist)
          {
            if(value.Book_id==id)
            {
              System.out.println("Book_id: "+value.Book_id);
          System.out.println("Book Title: "+value.Title);
          System.out.println("Book Author: "+value.Author);
          System.out.println("Book Genre: "+value.Genre);
          System.out.println("Book Copies: "+value.Quantity);
              bookFound=true;
            }
          }
        if(bookFound==false)
        {
          System.out.println("No Such ID is found");
        }
      }
      else{
        System.out.println("The list is empty");
      }
    }
    void searchBookBy_Title()
    {
      if(booklist.size()>0)
      {
        boolean bookFound=false;
        System.out.println("Enter Serching title: ");
        String  title=sc.next();
        for(Book value:booklist)
          {
            String data=value.Title;
            if(data.equalsIgnoreCase(title))
            {
              System.out.println("Book_id: "+value.Book_id);
          System.out.println("Book Title: "+value.Title);
          System.out.println("Book Author: "+value.Author);
          System.out.println("Book Genre: "+value.Genre);
          System.out.println("Book Copies: "+value.Quantity);
              bookFound=true;
            }
          }
        if(bookFound ==false)
        {
          System.out.println("No Such title is found");
        }
      }
      else{
        System.out.println("The list is empty");
      }
    }
    void searchBookBy_Author()
    {
      if(booklist.size()>0)
      {
        boolean bookFound=false;
        System.out.println("Enter Serching Author: ");
        String author=sc.next();
        for(Book value:booklist)
          {
            String name=value.Author;
            if(name.equalsIgnoreCase(author))
            {
              System.out.println("Book_id: "+value.Book_id);
          System.out.println("Book Title: "+value.Title);
          System.out.println("Book Author: "+value.Author);
          System.out.println("Book Genre: "+value.Genre);
          System.out.println("Book Copies: "+value.Quantity);
              bookFound=true;
            }
          }
        if(bookFound==false)
        {
          System.out.println("No Such Author is found");
        }
      }
      else{
        System.out.println("The list is empty");
      }
    }
    void searchBookBy_Genre()
    {
      if(booklist.size()>0)
      {
        boolean bookFound=false;
        System.out.println("Enter Serching Genre: ");
        String genre=sc.next();
        for(Book value:booklist)
          {
            String name=value.Genre;
            if(name.equals(genre))
            {
              System.out.println("Book_id: "+value.Book_id);
          System.out.println("Book Title: "+value.Title);
          System.out.println("Book Author: "+value.Author);
          System.out.println("Book Genre: "+value.Genre);
          System.out.println("Book Copies: "+value.Quantity);
              bookFound=true;
            }
          }
        if(bookFound==false)
        {
          System.out.println("No Such Genre is found");
        }
      }
      else{
        System.out.println("The list is empty");
      }
    }
    void addLibraryMember()
    {
      int id;
      while(true)
        {
           System.out.println("enter member id");
           id=sc.nextInt();
          boolean isUnique=true;
          for(LibraryMember value:memberlist)
            {
              if(value.Member_id==id)
              {
                isUnique=false;
                System.out.println("Member id must be unique");
                break;
              }
            }
          if(isUnique)
          {
            System.out.println(" member id is valid");
            break;
          }
        }
      sc.nextLine();
      System.out.println("enter the full name");
      String fullName=sc.nextLine();
      System.out.println("enter the age");
      int age=sc.nextInt();
      String mobileNo;
      while(true)
        {
      System.out.println("enter mobile number");
          mobileNo=sc.next();
          if(mobileNo.length()==10 && (mobileNo.startsWith("9")||mobileNo.startsWith("8")||mobileNo.startsWith("7")||mobileNo.startsWith("6")))
          {
            System.out.println("Mobile number is valid");
            break;
          }
          else{
            System.out.println("enter valid mobile number");
          }
       }
      LibraryMember member=new LibraryMember(id,fullName,age,mobileNo);
      memberlist.add(member);
      System.out.println("one member record is added");
    }
  
    void displayAllLibraryMembers()
    {
      if(memberlist.size()>0)
      {
         System.out.println("Added library members details: ");
        for(LibraryMember value:memberlist)
          {
            System.out.println("Member id: "+value.Member_id);
            System.out.println("Name: "+value.Fullname);
            System.out.println("Age of the member: "+value.age);
            System.out.println("Mobile number: "+value.Mobile_No);
          }
      }
      else{
        System.out.println("Members list is empty");
      }
    }

void searchForMemberby_Id()
  {
  if(memberlist.size()>0)
  {
    System.out.println("Enter member id to search:");
    int id=sc.nextInt();
    boolean memberFound=false;
    for(LibraryMember value:memberlist)
      {
        if(value.Member_id==id)
        {
          System.out.println("Member id: "+value.Member_id);
            System.out.println("Name: "+value.Fullname);
            System.out.println("Age of the member: "+value.age);
            System.out.println("Mobile number: "+value.Mobile_No);
          memberFound=true;
        }
      }
    if(memberFound==false)
        {
          System.out.println("There as  no  such library member with this given id");
        }
      }
      else
      {
        System.out.println("Members list is empty");
      }
  }
    void searchForMemberby_name()
    {
      if(memberlist.size()>0)
      {
        sc.nextLine();
        System.out.println("Enter name to search:");
        String name=sc.nextLine();
        boolean memberFound=false;
        for(LibraryMember value:memberlist)
          {
            String data=value.Fullname;
            if(data.equals(name))
            {
              System.out.println("Member id: "+value.Member_id);
            System.out.println("Name: "+value.Fullname);
            System.out.println("Age of the member: "+value.age);
            System.out.println("Mobile number: "+value.Mobile_No);
              memberFound=true;
            }
          }
        if(memberFound=false)
        {
          System.out.println("No book available by this name");
        }
      }
      else{
        System.out.println("List is empty");
      }
    }
    void searchForMemberby_ageRange()
    {
      if(memberlist.size()>0)
      {
        boolean memberFound=false;
        System.out.println("Enter starting age");
        int startAge=sc.nextInt();
        System.out.println("Enter ending age");
        int endAge=sc.nextInt();
        for(LibraryMember value:memberlist)
          {
            if(value.age>=startAge && value.age<=endAge)
            {
              System.out.println("Member id: "+value.Member_id);
            System.out.println("Name: "+value.Fullname);
            System.out.println("Age of the member: "+value.age);
            System.out.println("Mobile number: "+value.Mobile_No);
              memberFound=true;
            }
          }
        if(memberFound==false)
        {
          System.out.println("No such type of members within the given age range");
        }
      }
      else{
        System.out.println("Members list is empty");
      }
    }
     void borrowBook() throws MemberNotFoundException
    {
      System.out.println("enter library member id");
      int id=sc.nextInt();
      boolean memberFound=false;
      for(LibraryMember value:memberlist)
        {
          if(value.Member_id==id)
          {
            memberFound=true;
           System.out.println("enter book id to borrow");
            int b_id=sc.nextInt();
            boolean bookFound=false;
            for(Book data:booklist)
              {
                if(data.Book_id==b_id)
                {
                  bookFound=true;
                  if(data.Quantity>0)
                  {
                    System.out.println("enter how many books you want to borrow");
                    int count=sc.nextInt();
                    if(count<=data.Quantity)
                    {
                    data.Quantity=data.Quantity-count;
                    System.out.println("Book Issued successfully");
                    }
                    else{
                      System.out.println("enter sufficient number of books to borrow");
                    }
                  }
                  else{
                    System.out.println("we can not issue the book because Insufficent quantities");
                  }
                }
              }
            if(bookFound==false)
            {
              System.out.println("There is no such type of book with given id");
            }
          }
        }
          if(memberFound==false){
            throw new MemberNotFoundException("There is no such type of member with the given id");
          }

    }
     void returnBook() throws MemberNotFoundException
    {
      System.out.println("enter library member id");
      int m_id=sc.nextInt();
      boolean memberFound=false;
      for(LibraryMember value:memberlist)
        {
          if(value.Member_id==m_id)
          {
            memberFound=true;
            System.out.println("enter book id to return the book and to update the number of copies");
            int b_id=sc.nextInt();
            boolean bookFound=false;
            for(Book data:booklist)
              {
                if(data.Book_id==b_id)
                {
                  bookFound=true;
                  System.out.println("how many books you are returning");
                  int count=sc.nextInt();
                  data.Quantity=data.Quantity+count;
                  System.out.println("Book retuned successfully");
                }
              }
            if(bookFound==false)
            {
              System.out.println("There is no such type of book with given id");
            }
          }
        }
          if(memberFound==false){
            throw new MemberNotFoundException("There is no such type of member with the given id");
          }
        }
    void catogoriesList()
    {
      do{
        System.out.println("Enter your choice");
        System.out.println("1.Add Book");
        System.out.println("2.View All Book Details");
        System.out.println("3. Search for a Book By Id");
        System.out.println("4. Search for a Book By Title");
        System.out.println("5. Search for a Book By Author");
        System.out.println("6. Search for a Book By Genre");
        System.out.println("7.Add Library Member");
        System.out.println("8.View all Library Members");
        System.out.println("9.Search for a Member By Id");
        System.out.println("10.Search for a Member By Name");
        System.out.println("11.Search for a Member By Age");
        System.out.println("12.Borrow a Book");
        System.out.println("13.Return a  Book");
        System.out.println("14.Exit");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
        int option=sc.nextInt();
        switch(option)
          {
            case 1:
              System.out.println("Enter the book details");
              addBook();
              break;
            case 2:
             viewAllBooks();
              break;
            case 3:
            searchBookBy_Id();
              break;
            case 4:
              searchBookBy_Title();
              break;
            case 5:
            searchBookBy_Author();
              break;
            case 6:
              searchBookBy_Genre();
              break;
            case 7:
              addLibraryMember();
              break;
            case 8:
              displayAllLibraryMembers();
              break;
            case 9:
              searchForMemberby_Id();
              break;
            case 10:
              searchForMemberby_name();
              break;
            case 11:
              searchForMemberby_ageRange();
              break;
            case 12:
              try{
                borrowBook();
              }
              catch(Exception e){
                System.out.println(e);
              }
                break;
            case 13:
            try{
                returnBook();;
              }
              catch(Exception e){
                System.out.println(e);
              }
                break;
            case 14:
              System.exit(0);
              break;
              default:
              System.out.println("Enter a valid  Option");
              
          }
        
      } while(true);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      Bookdetails book=new Bookdetails();
      book.catogoriesList();
        }
}


