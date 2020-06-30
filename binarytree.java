import java.util.Queue;
import java.util.LinkedList;

public class binarytree {
    private tree root;

    public void insert(int x) {
        if (root == null) {
            root = new tree(x);
        } else {
            root.insert(x);
        }
    }
    
    public void BreadFirstSearch() {
        Queue<tree> list = new LinkedList<>();
        list.add(root);

        while (!list.isEmpty()) {
            tree h1 = list.remove();
            if (h1.leftchild != null) {
                list.add(h1.leftchild);
            }
            if (h1.rightchild != null) {
                list.add(h1.rightchild);
            }
            System.out.print(h1.data + " ");
        }
    }
    
}