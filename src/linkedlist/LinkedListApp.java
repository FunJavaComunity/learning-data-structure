package linkedlist;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(3);
        linkedList.insertFirst(28);
        linkedList.insertFirst(37);
        linkedList.insertFirst(6);

        linkedList.displayList();
    }
}
