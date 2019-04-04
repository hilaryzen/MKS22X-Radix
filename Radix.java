public class Radix {
  public static void radixsort(int[] data) {
    //Buckets store digits from -9 to 9
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for (int i = 0; i < 20; i++) {
      buckets[i] = new MyLinkedList<Integer>();
    }
    MyLinkedList<Integer> numbers = new MyLinkedList<Integer>(); //Stores data
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

    //Sorting by ones digit and converting array to linked list
    for (int num : data) {
      //Placing number in bucket
      if (num < 0) {
        buckets[9 - (Math.abs(num) % 10)].add(num);
      } else {
        buckets[10 + (Math.abs(num) % 10)].add(num);
      }
    }
    //Combines all the buckets to form an ordered data
    for (MyLinkedList<Integer> bucket : buckets) {
      //System.out.println(bucket); //Debugging
      numbers.extend(bucket);
      bucket.clear();
    }
    int currentDigit = 2; //Stores digit that will be sorted next
    //System.out.println(numbers);

    //Sorting using rest of the digits starting from tens place
    while (currentDigit <= length) {
      while (numbers.hasNext()) {
        int num = numbers.next();
        //Separates digit being considered
        int digit = (Math.abs(num) % (int)Math.pow(10, currentDigit)) / (int)Math.pow(10, currentDigit - 1);
        if (num < 0) {
          buckets[9 - digit].add(num);
        } else {
          buckets[10 + digit].add(num);
        }
      }
      numbers.clear();
      for (MyLinkedList<Integer> bucket : buckets) {
        //System.out.println(bucket); //
        numbers.extend(bucket);
        bucket.clear();
      }
      currentDigit++;
      //System.out.println(numbers);
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
