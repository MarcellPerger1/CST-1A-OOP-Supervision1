package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P7;

public class SearchSet {
    private int numElements = 0;
    private BinaryTreeNode head;  // Nullable

    public int getNumElements() {
        return numElements;
    }

    void insert(int v) {
        if(head == null) {
            head = new BinaryTreeNode(v);
            ++numElements;
            return;
        }
        BinaryTreeNode n = head;
        while (true) {
            if(v < n.getValue()) {
                BinaryTreeNode l = n.getLeft();
                if (l == null) {
                    n.setLeft(new BinaryTreeNode(v));
                    ++numElements;
                    return;
                }
                n = l;
            } else if (v == n.getValue()) {
                return;  // No duplicates
            } else {
                BinaryTreeNode r = n.getRight();
                if (r == null) {
                    n.setRight(new BinaryTreeNode(v));
                    ++numElements;
                    return;
                }
                n = r;
            }
        }
    }

    boolean contains(int v) {
        BinaryTreeNode n = head;
        while (n != null) {
            if(v < n.getValue()) {
                n = n.getLeft();
            } else if (v == n.getValue()) {
                return true;
            } else {
                n = n.getRight();
            }
        }
        return false;
    }
}
