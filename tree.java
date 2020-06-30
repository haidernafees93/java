public class tree {

    int data;
    public tree leftchild;
    public tree rightchild;

    public tree(int x) {
        this.data = x;
    }

    public void insert(int x) {
        if (x == data) {
            return;
        }
        if (x < data) {
            if (leftchild == null) {
                leftchild = new tree(x);
                System.out.println("left null insertion");
            } else {
                System.out.println("left insertion");
                leftchild.insert(x);
            }
        }
        else {
            if (rightchild == null) {
                System.out.println("Right null insertion");
                rightchild = new tree(x);
            }
            else {
                System.out.println("right insertion");
                rightchild.insert(x);
            }
        }
    }
}