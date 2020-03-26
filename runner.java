public class runner {
<<<<<<< HEAD
    public static void main (String [] args)
    {
        removeDups listA = new removeDups();

        listA.add(3);
        listA.add(4);
        listA.add(4);
        listA.add(4);
        listA.add(7);
        listA.add(3);
        listA.add(5);
        listA.add(3);
        listA.add(5);
        listA.add(10);
        listA.add(10);
        listA.add(10);
        listA.print();
        listA.comparison();
        listA.print();
=======
    public static void main(String[] args) {
        stackMin listA = new stackMin();
        listA.push(4);
        listA.push(2);
        listA.push(1);
        listA.push(4);
        listA.print();

        System.out.println("listA pop = " + listA.pop());
        listA.print();

        System.out.println("listA min = " + listA.min());
>>>>>>> 62860e85fdff7f6bd275f9136271d9fad5838301
    }
}