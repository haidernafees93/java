public class runner {
    public static void main (String [] args)
    {
        linkedList listA = new linkedList();
        linkedList listB = new linkedList();
        linkedList listC = new linkedList();
        

        listA.add(6);
        listA.add(1);
        listA.add(7);

        //listA.reverse(listA);

        listB.add(2);
        listB.add(9);
        listB.add(5);

        //listB.reverse(listB);

        //listA.print();
        listC.forwardAddition(listA, listB);
    }
}