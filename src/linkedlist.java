import java.util.HashSet;
import java.util.LinkedList;

public class linkedlist {
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int count = 0;

    //insert a Node
    public void add(int x)
    {
        Node temp = new Node(x);
        if(head == null)
        {
            head = temp;
            count++;
        }
        else
        {
            Node hCopy = head;
            while(hCopy.next != null)
            {
                hCopy = hCopy.next;
            }
            hCopy.next = temp;
            count++;
        }
    }
    //return the length of the linked list
    public int length()
    {
        System.out.println(count);
        return count;
    }

    //print the linked list
    public void print()
    {
        Node hCopy = head;
      /*  for(int i = 0; i < count; i++)
        {
            System.out.println(hCopy.data);
            hCopy = hCopy.next;
        }*/
      while(hCopy.next != null)
      {
          System.out.print(hCopy.data + " -> ");
          hCopy=hCopy.next;
      }
        System.out.println(hCopy.data);
    }

    //delete a Node
    private void delete(int position)
    {
        Node hCopy = head;
        
        for(int i = 0; i < position; i++)
        {
            hCopy = hCopy.next;
        }
        hCopy.next = hCopy.next.next;
    }

    //loop detection
    public Boolean loopDetection()
    {
        Node h = head;
        Node runner = head.next;

        while(runner.next != null)
        {
            if(runner == h)
            {
                return true;
            }
            runner = runner.next.next;
            h = h.next;
        }
        return false;
    }

    //reverse the linked list


    public void createCircle()
    {
        Node h = head;
        h=h.next;
        h=h.next;
        Node temp = h;
        temp =temp.next.next;
        temp.next = h;

    }

    //remove duplicates from the list
    public void redup()
    {
        HashSet<Integer> set = new HashSet<>();
        Node h = head;
        Node runner = h.next;
        set.add(h.data);

        while(runner.next != null)
        {
            boolean increment = true;
            if(!set.contains(runner.data))
            {
                set.add(runner.data);
            }
            else
            {
                h.next = runner.next;
                increment = false;
            }
            if(increment)
                h = h.next;
            runner = runner.next;
        }
        if(set.contains(runner.data))
        {
            //System.out.println(runner.data);
            //System.out.println(h.data);
            h.next = null;
            //System.out.println("h.data");
            //System.out.println(h.data);
        }
    }
    
    // addition of linked_list
    public void addition(linkedlist a, linkedlist b)
    {
        Node h = a.head;
        Node h1 = b.head;
        Node temp = new Node(0);
        int quotient = 0;

        while(h != null)
        {
            temp.data = h.data + h1.data + quotient;
            quotient = temp.data / 10;
            temp.data = temp.data % 10;
            add(temp.data);
            h = h.next;
            h1 = h1.next;
        }
    }
}
