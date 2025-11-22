package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P7;

public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left;  // Nullable
    private BinaryTreeNode right;  // Nullable

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }
    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
