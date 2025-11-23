package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P7;

public class FunctionalArray {
    private final int size;
    private BinaryTreeNode root;  // Nullable

    public FunctionalArray(int size) {
        this.size = size;
        this.root = createFromSize(size);
    }

    public int get(int idx) {
        return nodeOfSubtree(root, checkIndex(idx)).getValue();
    }
    public void set(int idx, int value) {
        nodeOfSubtree(root, checkIndex(idx)).setValue(value);
    }

    private static BinaryTreeNode nodeOfSubtree(
            BinaryTreeNode node, int idx) {
        if (idx == 0) return node;
        boolean isRight = (idx & 1) == 0;
        int subindex = (idx - 1) / 2;
        return nodeOfSubtree(
                isRight ? node.getRight() : node.getLeft(), subindex);
    }

    private int checkIndex(int idx) {
        if (0 <= idx && idx < size) return idx;
        throw new IndexOutOfBoundsException(idx);
    }

    private static BinaryTreeNode createFromSize(int size) {
        if (size == 0) return null;
        size -= 1;  // current node
        int rSize = size / 2;  // round down
        int lSize = size - rSize;  // same but round up
        BinaryTreeNode result = new BinaryTreeNode(/*default fill*/0);
        result.setLeft(createFromSize(lSize));
        result.setRight(createFromSize(rSize));
        return result;
    }
}
