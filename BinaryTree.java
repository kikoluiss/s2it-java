public class BinaryTree {
    int valor;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int valor) {
        this.valor = valor;
        left = null;
        right = null;
    }

    public static int sumBinaryTree(BinaryTree node) {
        if (node == null) {
            return 0;
        }
        return node.valor + sumBinaryTree(node.left) + sumBinaryTree(node.right);
    }

}
