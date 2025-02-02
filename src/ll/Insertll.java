package ll;

public class Insertll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    //---- insertion in linked list at last

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int a) {
            Node temp = new Node(a);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.display();

    }
}
