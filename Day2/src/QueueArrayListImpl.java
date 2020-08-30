import java.util.ArrayList;

public class QueueArrayListImpl {
    ArrayList<Integer> queue = new ArrayList<>();

    public void enqueue(int value){
        queue.add(value);
    }

    public int dequeue(){
        if(queue.isEmpty()){
            return -1;
        }
       return queue.remove(0);
    }

    public int peek(){
        if(queue.isEmpty()){
            return -1;
        }

        return queue.get(0);
    }

    public int search(int value){
        if(queue.isEmpty()){
            return -1;
        }

        if(queue.contains(value)){
            return queue.indexOf(value);
        }

        return -1;
    }
}
