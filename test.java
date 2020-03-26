public class test {
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    private Node head;
    private int length = 0;

    public void add(int y) {
        Node temp = new Node(y);
        if (head == null) {
            head = temp;
        } else {
            Node h1 = head;
            while (h1.next != null) {
                h1 = h1.next;
            }
            h1.next = temp;
        }
        length++;
    }

    public int size(){
        return length;
    }

    public void print() {
        Node h1 = head;
        while (h1.next != null) {
            System.out.print(h1.data + " -> ");
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }

    public void delete(int position) {
        Node h1 = head;

        if (position == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < position - 1; i++) {
                h1 = h1.next;
            }
            h1.next = h1.next.next;
        }
        length--;
    }
}