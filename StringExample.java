/*Assignment 1: Method Overloading

Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:

Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.*/
class StringHelper
  {
    void concatenate(String str1,String str2)
    {
      System.out.println("the concatenate two String");
      System.out.println((str1.concat(str2)));
    }
    void concatenate(String str1,String str2,String str3)
    {
      System.out.println("the concatenates of three strings");
      String str=str1.concat(str2);
      System.out.println((str.concat(str3)));
    }
  }
class StringExample
  {
    public static void main(String[] args)
    {
      StringHelper sh=new StringHelper();
      sh.concatenate("haii","hello");
      sh.concatenate("welcome","to","bitlabs");
    }
  }