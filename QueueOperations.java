import java.util.Scanner;
class QueueEx
  {
   int queue[];
  int size;
  int front;
  int rear;
QueueEx(int s)
  {
  queue=new int[s];
  }
    public void enQueue(int data)
    {
      if(size==queue.length)
      {
        System.out.println("queue is full");
      }
      else{
        queue[rear]=data;
        rear=rear+1;
        size=size+1;
      }
    }
    public void deQueue()
    {
      if(size<=0){
      System.out.println("queue is empty");
    }
    else
    {
      System.out.println(queue[front]+"element has been removed");
      front=front+1;
      size=size-1;
    } 
}
public void show()
  {
    System.out.println("elements in queue");
  for(int i=0;i<size;i++)
    {
      System.out.println(queue[i]+"");
    }
  }
  public void isEmpty()
    {
      if(size==0)
      {
        System.out.println("queue is empty");
      }
    else{
      System.out.println("queue is not empty and the size is"+size);
    }
    }
   public void isFull()
     {
     if(size==queue.length)
     {
       System.out.println("queue is full");
     }
     else{
       System.out.println("queue is not full and size is"+size);
     }
     }
  }
class QueueOperations
  {
    public static void main(String[] args)
    {
      QueueEx qu=new QueueEx(5);
      Scanner sc=new Scanner(System.in);
      while(true)
        {
          System.out.println(" 1.insert \n 2.remove \n 3.show \n 4.isEMpty \n 5.isfull  \n 6.exit");
          System.out.println("enter the choice");
          int option=sc.nextInt();
          switch(option)
            {
              case 1:
                System.out.println("enter the value");
                int value=sc.nextInt();
                qu.enQueue(value);
                break;
              case 2:
                qu.deQueue();
                break;
              case 3:
                qu.show();
                break;
              case 4:
                qu.isEmpty();
                break;
              case 5:
                qu.isFull();
                break;
              case 6:
                System.exit(0);
                break;
            }
        }
    }
  }
