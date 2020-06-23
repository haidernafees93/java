public class runner {
    public static void main(String[] args) {
        binarytree listA = new binarytree();

        listA.insert(2);
        listA.insert(1);
        listA.insert(3);
        listA.insert(8);
        listA.insert(6);
        listA.insert(5);
        listA.insert(7);
        listA.BreadFirstSearch();
        System.out.println();
    }
}