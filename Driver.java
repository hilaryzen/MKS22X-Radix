public class Driver {
  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<Integer>();
    System.out.println(list.size());

    System.out.println(" ");

    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list.size());
    System.out.println(list);
  }
}
