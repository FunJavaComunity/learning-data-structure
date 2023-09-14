package linkedlist;

public class LinkedList {
    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key){
        Link current = first;
        while(current.data != key){
            if (current.next == null){
                return null;
            } else {
                current = current.next;
            }
        }

        return current;
    }

    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while (current.data != key){
            if (current.next == null){
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first){
            first = first.next;
        } else {
            previous.next = current.next;
        }

        return current;
    }

    public void displayList(){
        System.out.println("List (first --> last) :");

        Link current = first;
        while (current != null){
            current.display();
            current = current.next;
        }

        System.out.println("");
    }
}
