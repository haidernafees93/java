public class runner {
    public static void main (String [] args)
    {
        queueViaStack listA = new queueViaStack();
        listA.push(5);
        listA.push(1);
        listA.push(2);
        listA.push(3);
        listA.push(4);
        listA.push(5);
        listA.push(6);
        listA.print();
        listA.MyQueue();
    }
}