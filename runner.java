public class runner {
    public static void main (String [] args)
    {
        bfs listA = new bfs();
        
        listA.push(1);
        listA.push(2);
        listA.push(3);
        listA.moveLeft();
        listA.push(4);
        listA.push(5);
        listA.moveReturn();
        listA.moveRight();
        listA.push(6);
        listA.push(7);
        listA.BreadFirstSearch();
    }
}