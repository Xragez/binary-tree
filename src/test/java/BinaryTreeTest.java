package test.java;

import main.java.BinaryTree;
import main.java.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class BinaryTreeTest {

    @Test
    public void median_3_treeWithOddNumOfNodes(){

        //given
        Node node = new Node(6, 2, 3);
        BinaryTree tree = new BinaryTree();

        //when
        float result = tree.median(node);

        //then
        Assertions.assertEquals(3.0, result);

    }

    @Test
    public void median_5_treeWithEvenNumOfNodes(){

        //given
        Node node = new Node(6, 4, 6);
        node.getRight().setRight(new Node(1));
        BinaryTree tree = new BinaryTree();

        //when
        float result = tree.median(node);

        //then
        Assertions.assertEquals(5.0, result);

    }

    @Test
    public void median_ThrowsNullPointerException_NodeIsNull(){

        //given
        Node node = new Node(null);
        BinaryTree tree = new BinaryTree();

        //when

        //then
        Assertions.assertThrows(NullPointerException.class, () -> tree.median(node));

    }

    @Test
    public void sum_15_TreeNode(){

        //given
        Node node = new Node(6, 2, 3);
        node.getRight().setRight(new Node(2));
        node.getRight().setLeft(new Node(2));
        BinaryTree tree = new BinaryTree();

        //when
        float result = tree.sum(node);

        //then
        Assertions.assertEquals(15, result);

    }

    @Test
    public void sum_ThrowsNullPointerException_NodeIsNull(){

        //given
        Node node = new Node(null);
        BinaryTree tree = new BinaryTree();

        //when

        //then
        Assertions.assertThrows(NullPointerException.class, () -> tree.sum(node));

    }

    @Test
    public void average_15_TreeNode(){

        //given
        Node node = new Node(7, 4, 3);
        node.getRight().setRight(new Node(9));
        node.getRight().setLeft(new Node(7));
        BinaryTree tree = new BinaryTree();

        //when
        float result = tree.average(node);

        //then
        Assertions.assertEquals(6.0, result);

    }

    @Test
    public void average_ThrowsNullPointerException_NodeIsNull(){

        //given
        Node node = new Node(null);
        BinaryTree tree = new BinaryTree();

        //when

        //then
        Assertions.assertThrows(NullPointerException.class, () -> tree.average(node));

    }

}
