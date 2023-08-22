import java.util.*;

class TreeSetEx {
  public static void main(String[] args) {
    TreeSet<Integer> ys = new TreeSet<Integer>();
    ys.add(18);
    ys.add(17);
    ys.add(24);
    ys.add(29);
    ys.add(31);
    ys.add(116);
    for (Integer data : ys) {
      System.out.println(data);
    }
    System.out.println("head set" + ys.headSet(31));
    System.out.println("Tail set" + ys.tailSet(17, false));
    System.out.println("tail set" + ys.tailSet(31, true));
    System.out.println("Sub Set" + ys.subSet(18, true, 116, false));

  }
}