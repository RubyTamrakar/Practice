import java.util.ArrayList;

//Arraylist Implementation
public class StackArrayListImpl {
    ArrayList<Integer> stack = new ArrayList<>();
    int count;

    public void push(int value){
        if(stack.isEmpty()){
            count =0;
            stack.add(value);
        }
        stack.add(value);
        System.out.println(stack);
        ++count;
    }

    public void pop (){
        System.out.println(count);
        stack.remove(count-1);
        --count;
        System.out.println(stack);
    }

    public int peek(){
        return stack.get(count);
    }

}
