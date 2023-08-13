class StringMethods
  {
    public static void main(String args[])
    {
      String s1="Bitlabs";
      String s2="TekWorks";
      String s3="Hello";
      String s4="Bitlabs";
      String s5=new String("Bitlabs");
    System.out.println("the length of s1 is "+s1.length());
      System.out.println("concatinating s3 and s1 "+s3.concat(s1));
      System.out.println("concatinating s3 and s2 "+s3.concat(s2));
      System.out.println("s1==s4 is "+(s1==s4));
      System.out.println("s1==s5 is "+(s1==s5));
      System.out.println("s1 equals s5 is "+s1.equals(s5));
  }
  }