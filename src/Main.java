public class Main {
    public static void main(String[] args) {
//        StackImpl stack = new StackImpl(6);
//        stack.push(1);
//        stack.push(21);
//        stack.push(13);
//        stack.push(188);
//        System.out.println(stack.peek());
////        stack.pop();
//        System.out.println(stack.search(1889));

//        StackArrayListImpl sl = new StackArrayListImpl();
//        sl.push(6);
//        sl.push(26);
//        sl.push(63);
//        sl.push(644);
//sl.pop();
//        System.out.println(sl.peek());

        StackLinkedListImpl sl = new StackLinkedListImpl();
        sl.push(3);
        sl.push(32);
        sl.push(333);
        sl.push(443);

        System.out.println(sl.pop());
        System.out.println(sl.peek());
    }
}
