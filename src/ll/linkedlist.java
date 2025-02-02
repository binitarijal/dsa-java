package ll;

public class linkedlist {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    //------given in order------
    public static void displayrecur(Node head) {
       if(head==null) return;
        System.out.print(head.val +" ");
        display(head.next);
    }

    //-------display in reverse recursion------

    public static void reversedisplay(Node head){
        if(head==null) return;
        reversedisplay(head.next);
        System.out.print(head.val+ " ");
    }
        public static class Node{
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }

        }
        public static void main(String[] args){
            Node a = new Node(2);
            Node b = new Node(3);
            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(6);

// 2->3->4

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            display(a);
            displayrecur(a);
            reversedisplay(a);

//
//        Node temp=a;
//        while(temp!=null){
//            System.out.println(temp.val);
//            temp=temp.next;
        }
    }

