//Interface example
interface Calculator
  {
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
  }
class Arithmetic implements Calculator{
  public void add(int a,int b)
  {
    System.out.println(a+b);
  }
  public void sub(int a,int b)
  {
    System.out.println(a-b);
  }
  public void mul(int a, int b)
  {
    System.out.println(a*b);
  }
  public void div(int a, int b)
  {
    System.out.println(a/b);
  }
}
class InterfaceEx
  {
    public static void main(String[]args)
    {
      Calculator cul=new Arithmetic();
      cul.add(17,31);
      cul.sub(29,18);
      cul.mul(24,22);
      cul.div(98,5);
    }
  }