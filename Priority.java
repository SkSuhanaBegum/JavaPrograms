import java.util.*;
class Priority
  {
    public static void main(String[] args)
    {
      PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
      queue.add(17);
      queue.add(31);
      queue.add(18);
      queue.add(29);
      queue.add(24);
      Iterator itr=queue.iterator();
      System.out.println("Iterating the elements");
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      System.out.println(queue);
      System.out.println("element: "+queue.element());
      System.out.println("peek: "+queue.peek());
      System.out.println("poll: "+queue.poll());
      System.out.println("offer: "+queue.offer(116));
       System.out.println(queue);
      System.out.println("Remove: "+queue.remove(31));
      System.out.println(queue);
    }
  }