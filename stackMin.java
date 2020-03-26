public class stackMin {
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    private Node head;
    private int low;

    public void push(int y) {
        Node runner = new Node(y);
        if (head == null) {
            head = runner;
            low = head.data;
        } else {
            runner.next = head;
            head = runner;
            if (head.data < low) {
                low = head.data;
            }
        }
    }

    public int pop() {
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public int min() {
        return low;
    }

    public void print() {
        Node hCopy = head;
        while (hCopy.next != null) {
            System.out.print(hCopy.data + " -> ");
            hCopy = hCopy.next;
        }
        System.out.println(hCopy.data);
    }
}