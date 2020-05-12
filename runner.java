public class runner {
    public static void main(String[] args) {
        sortstack listA = new sortstack();
        listA.push(3);
        listA.push(2);
        listA.push(8);
        listA.push(4);
        listA.push(7);
        listA.push(5);
        listA.push(6);
        listA.push(0);
        listA.push(1);
        listA.print();
        listA.sorting(listA);
    }
}