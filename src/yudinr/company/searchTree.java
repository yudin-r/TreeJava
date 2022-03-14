package yudinr.company;

public class searchTree {
    treeNode top;

    void add(int value) {
        if (top == null) this.top = new treeNode(value);
        else {
            treeNode temp = top;
            while (true) {
                if (value > temp.value && temp.right != null) temp = temp.right;
                else if (value < temp.value && temp.left != null) temp = temp.left;
                else if (value == temp.value) break;
                else if (value > temp.value) {
                    temp.right = new treeNode(value);
                    break;
                }
                else {
                    temp.left = new treeNode(value);
                    break;
                }
            }
        }
    }

    void print(treeNode treeNode) {
        if (treeNode == null) return;
        print(treeNode.right);
        System.out.println(treeNode.value);
        print(treeNode.left);
    }

    void print() {
        print(top);
    }

    boolean isBalance() {
        return true;
    }

}
