package yudinr.company;

public class Main {

    public static void main(String[] args) {
        searchTree searchTree = new searchTree();
        searchTree.add(3);
        searchTree.add(31);
        searchTree.add(16);
        searchTree.add(7);
        searchTree.add(55);
        searchTree.add(99);
        searchTree.add(0);
        searchTree.add(227);
        searchTree.add(4);
        searchTree.add(99);
        searchTree.add(19);
        searchTree.add(921);
        searchTree.add(0);

        searchTree.print(searchTree.top);
    }
}
