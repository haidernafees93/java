public class runner {
    public static void main (String [] args)
    {
        stack listA = new stack();

        System.out.println("Pushing started!");
        listA.push(3);
        listA.push(4);
        listA.push(5);
        listA.push(6);
        listA.print();

        System.out.println("Peeking started!");
        System.out.println(listA.peek());
        listA.print();

        System.out.println("Poping started!");
        listA.pop();
        listA.print();
        listA.pop();
        listA.print();
        listA.pop();
        listA.print();
        listA.pop();
        System.out.println();
    }
}