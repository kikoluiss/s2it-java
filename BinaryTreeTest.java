public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        root.right.left.right = new BinaryTree(8);

        int sum1 = BinaryTree.sumBinaryTree(root);
        System.out.println(sum1);

        int sum2 = BinaryTree.sumBinaryTree(root.left);
        System.out.println(sum2);

    }
}
