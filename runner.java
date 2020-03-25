public class runner {
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
    }
}