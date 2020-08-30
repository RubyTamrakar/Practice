import java.util.LinkedList;

public class QueueLinkedListImpl {
    LinkedList queue = new LinkedList();

    public void enqueue(int value){
        queue.add(value);
    }

    public void dequeue(){
        queue.remove(0);
    }

    public int peek(){
        if(queue.isEmpty()){return -1;}
        int value= (int) queue.get(0);
        return value;
    }

    public int search(int value){
        if(queue.isEmpty()){return -1;}

        if(queue.contains(value)){
            return queue.indexOf(value);
        }

        return -1;

    }
}

