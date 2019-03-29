public class MyLinkedList<E> {
  private class Node{
	  private E data;
	  private Node next,prev;

		public Node(E value) {
			data = value;
		}

		public E getData() {
			return data;
		}

		public E setData(E value) {
			E old = data;
			data = value;
			return old;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node other) {
			next = other;
		}

		public Node prev() {
			return prev;
		}

		public void setPrev(Node other) {
			prev = other;
		}

		public String toString() {
			return "" + getData();
	  }
  }

  private int length;
	private Node start,end;

	//Empty list constructor
	public MyLinkedList() {
		length = 0;
	}

  //Reset list to empty state
  public void clear() {
    length = 0;
    start = null;
    end = null;
  }

  public int size() {
    return length;
  }

  public String toString() {
    if (start == null) {
			return "[]";
		}
		Node current = start;
		String ans = "[" + current.getData();
		//Loops through elements using their index
		for (int i = 1; i < size(); i++) {
			current = current.next();
			ans += ", " + current.getData();
		}
		return ans + "]";
  }

  //Adds a node at the end of the list
	public boolean add(E value) {
		Node newNode = new Node(value);
		if (size() == 0) {
			//The new node becomes the start and end
			start = newNode;
			end = newNode;
			length = 1;
		} else {
			newNode.setPrev(end);
			length += 1;
			end.setNext(newNode);
			//The new node becomes the end
			end = newNode;
		}
		return true;
	}

  //Connects two linked lists
  public void extend(MyLinkedList<E> other) {
		end.setNext(other.start);
		other.start.setPrev(end);
		end = other.end;
		length = size() + other.size();
		other.length = 0;
		other.start = null;
		other.end = null;
	}

  //Removes the first element
  public E removeFront() {
    E old = start.getData();
    if (size() == 1) {
      start = null;
      end = null;
    } else {
      start = start.next();
      start.setPrev(null);
    }
    return old;
  }

}
