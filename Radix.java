public class Radix {
  public static void radixsort(int[] data) {
    MyLinkedList<Integer>[] buckets = new MyLinkedList[10];
    for (int i = 0; i < 10; i++) {
      buckets[i] = new MyLinkedList<Integer>();
    }
    MyLinkedList<Integer> numbers = new MyLinkedList<Integer>();
    //System.out.println(numbers);

    //Finding length of longest number
    int max = Math.abs(data[0]);
    int length = 1;
    for (int i = 1; i < data.length; i++) {
      if (Math.abs(data[i]) > max) {
        max = Math.abs(data[i]);
      }
    }
    //System.out.println(max);
    while (max / 10 > 0) {
      max = max / 10;
      length++;
    }
    //System.out.println(length);

    //Sorting by ones digit
    for (int num : data) {
      buckets[num % 10].add(num);
    }
    for (MyLinkedList<Integer> bucket : buckets) {
      //System.out.println(bucket); //Debugging
      numbers.extend(bucket);
      bucket.clear();
    }
    length--;
    System.out.println(numbers);

    while (length > 0) {

    }
  }
}
