
public class threeInOne {
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    private Node head;

    public void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

    public int pop() {
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public void print() {
        Node h1 = head;
        while (h1.next != null) {
            System.out.println(h1.data + " -> ");
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }

    public void split(int[] arr) {
        threeInOne listA = new threeInOne();
        threeInOne listB = new threeInOne();
        threeInOne listC = new threeInOne();

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < size; i++) {
            if ((i + 3) == size) {
                listA.push(arr[i]);
                listB.push(arr[i + 1]);
                i = i + 1;
            } else {
                listA.push(arr[i]);
                listB.push(arr[i + 1]);
                listC.push(arr[i + 2]);
                i = i + 2;
            }
        }
        // listA.print();
        // listB.print();
        // listC.print();
    }
}