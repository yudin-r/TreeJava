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

    void print(treeNode treeNode, int level) {
        if (treeNode == null) return;
        print(treeNode.right, level+1);
        for (int i=0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(treeNode.value);
        print(treeNode.left, level+1);
    }

    void print(searchTree searchTree) {
        print(top, 0);
    }

    boolean isBalance() {
        return true;
    }

}
