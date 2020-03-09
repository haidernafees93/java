public class Stacks{
    class Stack{
        int data;
        Stack next;
        
        Stack(int x){
            this.data = x;
            this.next = null;
        }
    }

    private Stack head;
    Stack p = null;
    
    public void push(int x){
        Stack temp = new Stack(x);
        if(head == null){
            head = temp;
        }
        else{
            Stack r = temp;
            head.next = p;
            p = head;
            head = r;
            head.next = p;
        }
    }

    public void print(){
        Stack h1 = head;
        while(h1.next != null){
            System.out.print(h1.data + " -> ");
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }
}