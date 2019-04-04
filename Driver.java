import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    /*
    MyLinkedList<Integer> list = new MyLinkedList<Integer>();
    System.out.println(list.size());

    System.out.println(" ");

    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list.size());
    System.out.println(list);

    list.removeFront();
    list.removeFront();
    System.out.println(list.size());
    System.out.println(list);

    System.out.println(" ");
    MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
    list2.add(2);
    list2.add(1);
    System.out.println(list2);

    System.out.println(" ");
    list.extend(list2);
    System.out.println(list.size());
    System.out.println(list);

    System.out.println(" ");
    MyLinkedList<Integer> list3 = new MyLinkedList<Integer>();
    list3.add(4);
    list3.add(5);
    list3.add(6);
    list.extend(list3);
    System.out.println(list.size());
    System.out.println(list);
    */

    /*
    MyLinkedList<Integer> list3 = new MyLinkedList<Integer>();
    list3.add(4);
    list3.add(5);
    list3.add(6);
    MyLinkedList<Integer> list4 = new MyLinkedList<Integer>();
    list4.extend(list3);
    System.out.println(list3);
    System.out.println(list4);
    while (list4.hasNext()) {
      System.out.println(list4.next());
    }
    */

    int[] data = {3, 22, 4, 19, 11, 9, 42, 20, 107};
    Radix.radixsort(data);
    System.out.println("Data: " + Arrays.toString(data));
  }
}
