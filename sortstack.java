public class sortstack {
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

    public int peek() {
        return head.data;
    }

    public void print() {
        Node h1 = head;
        while (h1.next != null) {
            System.out.print(h1.data + " -> ");
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }

    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        return false;
    }

    public void sorting(sortstack x) {
        sortstack listA = new sortstack();
        
        while (!x.isEmpty()) {
            int temp = x.pop();

            if (listA.isEmpty()) {
                listA.push(temp);
            }
            else {
                if (temp > listA.peek()) {
                    while (!listA.isEmpty() && listA.peek() < temp) {
                        x.push(listA.pop());
                    }
                    listA.push(temp);
                }
                else {
                    listA.push(temp);
                }
            }
        }
        listA.print();
    }
}