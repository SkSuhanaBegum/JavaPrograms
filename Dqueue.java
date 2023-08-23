import java.util.*;
class Dqueue
  {
    public static void main(String[] args)
    {
      ArrayDeque<String>deque = new ArrayDeque<String>();
      deque.add("Suhana");
      deque.add("Buela");
      deque.add("Push");
      deque.add("Jyo");
      deque.add("Dani");
       
        System.out.println("element() :"+deque.element());
        System.out.println("peek():"+deque.peek());
      System.out.println("peekFirst: "+deque.peekFirst());
      System.out.println("peekLast: "+deque.peekLast());
      System.out.println("poll: "+deque.poll());
      System.out.println("offerFirst(): "+deque.offerFirst("sonu"));
      System.out.println("offerLast(): "+deque.offerLast("yuva"));
      Iterator itr=deque.iterator();
        System.out.println("iterating the elements");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(deque);
      }
  }