import java.util.LinkedList;

//LinkedList implementation
public class StackLinkedListImpl {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int value){
        stack.add(value);
        System.out.println(stack);
    }

    public int pop(){
       return stack.removeLast();
    }

    public int peek(){
        return stack.getLast();
    }

}
