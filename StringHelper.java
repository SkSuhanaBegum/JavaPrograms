/*Assignment 1: Method Overloading
Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:
Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.*/
class StringHelper
  {
    void concatenate(String s1,String s2)
    {
      System.out.println("Concatenating two strings: "+s1.concat(s2));
    }
    void concatenate(String s1,String s2,String s3)
    {
       String sr=s1.concat(s2);
      System.out.println("Concatenating three Strings: "+(sr.concat(s3)));
    }
  }
class Ex
  {
    public static void main(String[]args)
    {
      StringHelper st=new StringHelper();
      st.concatenate("TwoStrings","Concate");
      st.concatenate("ThreeStrings","Concate","Example");
    }
  }