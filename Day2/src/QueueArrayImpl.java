import java.lang.reflect.Array;
import java.util.Arrays;

public class QueueArrayImpl {
    Integer[] array;
    private int counter;

    public QueueArrayImpl(int size) {
        array = new Integer[size];
    }

    public void enqueue(int value) {
        if (isEmpty()) {
            array[0] = value;
        } else {
            if (counter == array.length - 1) {
                Integer[] newArray = new Integer[array.length * 2];
                for (int i = 0; i <= counter; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            array[++counter] = value;
        }
        System.out.println(Arrays.toString(array));

    }

    public int dequeue() {
        if (array.length==0) {
            return -1;
        }
        int removedValue = array[0];
        Integer[] newArray = new Integer[counter];
        for (int i = 0; i < counter; i++) {
            newArray[i] = array[i + 1];
        }
        array = newArray;
        --counter;
        System.out.println(Arrays.toString(array));
        return removedValue;
    }

    public boolean isEmpty() {
        return array[0]==null;
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return array[0];
    }

    public int search(int value){
        if(isEmpty()){
            return -1;
        }

        for(int i =0; i<=counter;i++){
            if (array[i]==value){
                return i;
            }
        }
        return -1;
    }



}
