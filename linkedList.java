
public class linkedList {
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    private Node head;

    public void add(int x) {
        Node temp = new Node(x);
        if (head == null) {
            head = temp;
        } else {
            Node h1 = head;
            while (h1.next != null) {
                h1 = h1.next;
            }
            h1.next = temp;
        }
    }

    public void print() {
        Node h1 = head;
        while (h1.next != null) {
            System.out.print(h1.data + " -> ");
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }

    public linkedList reverse(linkedList x) {
        Node pre = null;
        Node h1 = x.head;
        Node runner = h1.next;
        linkedList listC = new linkedList();

        while (runner.next != null) {
            h1.next = pre;
            pre = h1;
            h1 = runner;
            runner = runner.next;
        }
        h1.next = pre;
        pre = h1;
        h1 = runner;
        h1.next = pre;

        Node hC = h1;
        

        while (hC.next != null) {
            //System.out.print(hC.data + " -> ");
            listC.add(hC.data);
            hC = hC.next;
        }
        listC.add(hC.data);
        //System.out.println(hC.data);
        return listC;
    }

    public linkedList addition(linkedList a, linkedList b) {
        Node h1 = a.head;
        Node h2 = b.head;
        int carry = 0;
        Node resultStart = null;
        Node resultEnd = null;

        while (h1.next != null) {
            Node temp = new Node((h1.data + h2.data + carry) % 10);
            carry = (h1.data + h2.data + carry) / 10;
            if (resultStart == null) {
                resultStart = temp;
                resultEnd = resultStart;
            } else {
                resultEnd.next = temp;
                resultEnd = resultEnd.next;
            }
            h1 = h1.next;
            h2 = h2.next;
        }

        Node temp = new Node((h1.data + h2.data + carry));
        resultEnd.next = temp;

        Node r = resultStart;
        
        linkedList listC = new linkedList();
        while (r.next != null) {
            //System.out.print(r.data + " -> ");
            listC.add(r.data);
            r = r.next;
        }
        //System.out.println(r.data);
        listC.add(r.data);
        return listC;   
    }

    public void forwardAddition(linkedList a, linkedList b) {
        linkedList listA = new linkedList();
        linkedList listB = new linkedList();
        linkedList listC = new linkedList();
        listA = reverse(a);
        listB = reverse(b);
        //listA.print();
        //listB.print();
        listC = addition(listA, listB);
        listC = reverse(listC);
        listC.print();
    }
}