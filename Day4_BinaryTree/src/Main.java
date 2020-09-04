public class Main {
    public static void main(String[] args) {

        BinaryTreeImpl tree = new BinaryTreeImpl();

        int[] values = {4,5,20,14,6,24,25,16,12,30,31,41,64,72,100,101,200,1,2,2,5,27,27,10};

        for (int i :values) {

            tree.insert(i);
        }

//        System.out.println(tree);
        tree.sort();
        tree.depthFirst();

//        SortedArrayToBST bs = new SortedArrayToBST();
//        int[] s = {1,2,3,4,5,6,7,8,9};
////        bs.arrayToTree(s);
//        int n = s.length;
//        bs.binaryTree(s,0,n-1);
////        System.out.println(bs);
    }
}

 