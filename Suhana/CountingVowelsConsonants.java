import java.util.Scanner;
class CountingVowelsConsonants
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string value");
      String str=sc.nextLine();
      int vowel_count=0,cons_count=0;
      for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')||(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'))
          {
            vowel_count++;
          }
          else
          {
            cons_count++;
          }
        }
      System.out.println("number of vowels in the given string are "+vowel_count);
      System.out.println("number of consonants in the given string are "+cons_count);
    }
  }