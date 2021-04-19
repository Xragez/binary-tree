package main.java;

public class Node {
    private Node left;
    private Node right;
    private Integer value;


    public Node(Integer value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(Integer value){
        this(value, (Node)null, null);
    }

    public Node(Integer value, Integer left, Integer right){
        this.value = value;
        this.left = new Node(left);
        this.right = new Node(right);
    }

    public void setValue(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }

    public void setLeft(Node node){
        this.left = node;
    }

    public Node getLeft(){
        return this.left;
    }

    public void setRight(Node node){
        this.right = node;
    }

    public Node getRight(){
        return this.right;
    }

}
