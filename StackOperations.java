import java.util.Scanner;
class StackOperations
  {
    private int maxSize;
    private int stackArray[];
    private int top;
    public StackOperations(int size)
    {
      maxSize=size;
      stackArray=new int[maxSize];
      top=-1;
    }
    public void push(int value)
    {
      if(top<=maxSize-1)
      {
        top++;
        stackArray[top]=value;
        System.out.println("pushed : "+value);
      }
      else
        System.out.println("stack is full cannot push"+value);
    }
    public int pop()
    {
      if(top!=-1)
      {
      int poppedValue=stackArray[top];
      top--;
      return poppedValue;
    }
   else
    System.out.println("stack is empty we cannot pop");
return -1;
} 
 public void display()
    {
      if(top>=0)
      {
        System.out.println("stack :");
        for(int i=0;i<=top;i++)
          {
            System.out.println(stackArray[i]+"");
          }
        System.out.println();
      }
      else{
        System.out.println("stack is empty");
      }
    }
    public int peek()
    {
      if(top>=0)
      {
        int peekValue=stackArray[top];
        System.out.println("peeked:"+peekValue);
        return peekValue;
      }
      else{
        System.out.println("stack is empty we cannot peek");
        return -1;
      }
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      StackOperations s=new StackOperations(4);
      while(true)
        {
          System.out.println("1.insert \n 2.remove \n 3.peek \n 4.display \n 5.exit");
          System.out.println("enter the choice");
          int option=sc.nextInt();
          switch(option)
            {
              case 1:
                System.out.println("enter value to push into stack");
                int value=sc.nextInt();
                s.push(value);
                break;
              case 2:
                System.out.println(s.pop());
                break;
              case 3:
                s.peek();
                break;
              case 4:
                s.display();
                break;
              case 5:
                System.exit(0);
                break;
            }
        }
    }
  }