import java.util.ArrayList;

public class Radix {
  public static void radixsort(int[] data) {
    ArrayList<MyLinkedList> buckets = new ArrayList<MyLinkedList>();
    for (int i = 0; i < 10; i++) {
      buckets.add(new MyLinkedList());
    }
    System.out.println(buckets);
  }
}
