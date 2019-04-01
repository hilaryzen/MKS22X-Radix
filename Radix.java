import java.util.ArrayList;

public class Radix {
  public static void radixsort(int[] data) {
    ArrayList<MyLinkedList> buckets = new ArrayList<MyLinkedList>();
    for (int i = 0; i < 10; i++) {
      buckets.add(new MyLinkedList<Integer>());
    }
    for (int num = 0; num < data.length; num++) {
      buckets.get(data[num] % 10).add(data[num]);
    }
    System.out.println(buckets);
  }
}
