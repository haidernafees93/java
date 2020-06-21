public class runner {
    public static void main (String [] args)
    {
        stacksOfPlates listA = new stacksOfPlates();
        listA.push(3);
        listA.push(6);
        listA.push(7);
        listA.push(0);
        listA.push(3);
        listA.push(2);
        listA.push(5);
        listA.push(10);
        listA.print();

        listA.pop();
        listA.print();

        listA.pop();
        listA.print();

        listA.pop();
        listA.print();

        listA.pop();
        listA.print();

        listA.pop();
        listA.print();

        listA.pop();
        listA.print();

        listA.pop();
        listA.print();
    }
}