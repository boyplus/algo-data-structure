public class LinkedList {
  Node head;

  LinkedList() {
    this.head = null;
  }

  void addToTail(int data) {
    if (this.head == null) {
      this.head = new Node(data);
    } else {
      Node current = this.head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new Node(data);
    }
  }

  void removeTail() {
    Node current = this.head;
    Node previous = null;
    while (current.next != null) {
      current = current.next;
    }
  }

  void print() {
    Node current = this.head;
    while (current != null) {
      if (current != head) {
        System.out.print(", ");
      }
      System.out.print(current.data);
      current = current.next;
    }
    System.out.println();

  }
}
