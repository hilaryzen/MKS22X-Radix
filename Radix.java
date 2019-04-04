public class Radix {
  public static void radixsort(int[] data) {
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for (int i = 0; i < 20; i++) {
      buckets[i] = new MyLinkedList<Integer>();
    }
    MyLinkedList<Integer> numbers = new MyLinkedList<Integer>();
    //System.out.println(numbers);

    //Finding length of longest number
    int max = Math.abs(data[0]);
    int length = 1; //Stores num of digits of longest number
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
      if (num < 0) {
        buckets[9 - (num % 10)].add(num);
      } else {
        buckets[10 + (num % 10)].add(num);
      }
    }
    for (MyLinkedList<Integer> bucket : buckets) {
      //System.out.println(bucket); //Debugging
      numbers.extend(bucket);
      bucket.clear();
    }
    int currentDigit = 2; //Stores digit that will be sorted next
    System.out.println(numbers);

    while (currentDigit <= length) {
      while (numbers.hasNext()) {
        int num = numbers.next();
        buckets[(num % (int)Math.pow(10, currentDigit)) / (int)Math.pow(10, currentDigit - 1)].add(num);
      }
      numbers.clear();
      for (MyLinkedList<Integer> bucket : buckets) {
        //System.out.println(bucket); //
        numbers.extend(bucket);
        bucket.clear();
      }
      currentDigit++;
      System.out.println(numbers);
    }

    //Copy numbers back to data
    int index = 0;
    numbers.reset();
    while (numbers.hasNext()) {
      data[index] = numbers.next();
      index++;
    }
  }
}
