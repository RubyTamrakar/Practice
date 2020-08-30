import java.util.Arrays;

//implementation using Array

public class StackImpl {
    private Integer[] stack;
    private int count = 0;

    public StackImpl(int length){
        stack= new Integer[length];
    }

    public void push(int value) {
        if (isEmpty()) {
            stack[count] = value;
        } else if (stack.length  == count+1) {
            Integer[] newStack = new Integer[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            newStack[++count] = value;
            stack = newStack;
        }else{
        stack[++count] = value;
        }
        System.out.println(Arrays.toString(stack));
        System.out.println(count);
    }

    public boolean isEmpty() {
        if (stack[0] == null) {
            System.out.println("true");
            return true;
        } else {
            return false;
        }
    }

    public void pop(){
        stack[count]=null;
        System.out.println(Arrays.toString(stack));
    }

    public int peek(){
        return stack[count];
    }

    public int search(int value){
        if (isEmpty()){
            return -1;
        }

        for(int i = 0; i<count;i++){
            if(stack[i]==value){
                return i;
            }
        }
        return -1;
    }

}

