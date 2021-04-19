package main.java;

public class Main {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        Node root = new Node(5);
        root.setLeft(new Node(3, 2, 5));
        Node tmp = new Node(0, 2, 8);
        root.setRight(new Node(7, new Node(1), tmp));
        tmp.getRight().setRight(new Node(5));
        BinaryTree tree = new BinaryTree();
        String stree = "      5"
                + newLine
                + "  3       7"
                + newLine
                + "2   5   1    0"
                + newLine
                + "           2    8"
                + newLine
                + "                   5";
        System.out.println("Tree:");
        System.out.println(stree);
        System.out.println("Median:");
        System.out.println(tree.median(root));
        System.out.println("Average value:");
        System.out.println(tree.average(root));
        System.out.println("Subtree:");
        String subtree = "  0  "
                + newLine
                + "2   8"
                + newLine
                + "       5";
        System.out.println(subtree);
        System.out.println("Sum of values in subtree:");
        System.out.println(tree.sum(tmp));

    }
}
