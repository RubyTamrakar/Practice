
public class SortedArrayToBST {
    int lowerBoundary;
    int upperBoundary;


    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node( int value){
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
    public void arrayToTree(int[] array){
        lowerBoundary = 0;
        upperBoundary = array.length-1;
        System.out.println( binaryTree(array, lowerBoundary, upperBoundary));
    }

     Node binaryTree(int[] array, int lowerBoundary, int upperBoundary){
        if (lowerBoundary>upperBoundary) {
            return null;
        }
        int midIndex= (upperBoundary + lowerBoundary)/2;

      Node  node= new Node (array[midIndex]);
       node.left = binaryTree(array, 0, midIndex-1);
       node.right = binaryTree (array, midIndex+1, upperBoundary);
       return node;
    }



}
