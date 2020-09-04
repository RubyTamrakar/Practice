public class BinaryTreeImpl {

    private class Node{
         int value;
         Node right;
         Node left;

         public Node(int value){
             this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", right=" + right +
                    ", left=" + left +
                    '}';
        }
    }
    private Node root;

    public void insert(int value){
       root= recursiveInsert(root,value);
    }

    private Node recursiveInsert(Node node, int value){
        if (node == null){
            return new Node(value);
        }
        if(value<node.value){
                node.left = recursiveInsert(node.left, value);
            }else{
               node.right = recursiveInsert(node.right, value);
            }
        return node;
    }

    @Override
    public String toString() {
        return "BinaryTreeImpl{" +
                "root=" + root +
                '}';
    }

    public void sort(){
        if (root == null){
            System.out.println("Tree is empty");
        }else{
            recursiveSort(root);
        }
    }


    private void recursiveSort(Node node){
        if (node.left != null){
            recursiveSort(node.left);
        }
        System.out.println(node.value);

        if (node.right != null){
            recursiveSort(node.right);
        }
    }

    public void depthFirst(){
        recursiveDepthFirst(root);
    }

    private void recursiveDepthFirst(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.value);
        recursiveDepthFirst(root.right);
        recursiveDepthFirst(root.left);
    }

    public int height(){
        return recursiveHeight(root);
    }

    private int recursiveHeight(Node root) {
        if (root.left == null && root.right == null) {
            return 0;
        }

        return 1 + Math.max(
                recursiveHeight(root.left),
                recursiveHeight(root.right));
    }

}
