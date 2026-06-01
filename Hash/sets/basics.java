package Hash.sets;

import java.util.HashSet;

public class basics {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    System.out.println(set.size());
    System.out.println(set);
    System.out.println(set.contains(21)+ " "+set.contains(10));
    set.remove(40);
    System.out.println(set.size());
  }
}
