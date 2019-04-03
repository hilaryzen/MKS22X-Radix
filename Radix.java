public class Radix {
  public static void radixsort(int[] data) {
    MyLinkedList<Integer>[] buckets = new MyLinkedList[10];
    for (int i = 0; i < 10; i++) {
      buckets[i] = new MyLinkedList<Integer>();
    }
    MyLinkedList<Integer> numbers = new MyLinkedList<Integer>();
    //System.out.println(numbers);

    for (int num : data) {
      buckets[num % 10].add(num);
    }
    for (MyLinkedList<Integer> bucket : buckets) {
      System.out.println(bucket); //Debugging
      numbers.extend(bucket);
    }
  }
}
