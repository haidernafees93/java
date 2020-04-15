public class runner {
    public static void main (String [] args)
    {
        linkedlist listA = new linkedlist();

        listA.add(3);
        listA.add(5);
        listA.add(8);
        listA.add(5);
        listA.add(10);
        listA.add(2);
        listA.add(1);
        listA.add(4);
        listA.print();
        System.out.println();
        listA.partition(10);
    }
}