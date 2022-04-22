package Chapter12.memberEX.collection.arrayList;

import java.util.ArrayList;

class Queue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String dequeue(){
        int len = arrayQueue.size();
        if (len == 0){
            System.out.println("큐가 비었습니다");
            return null;
        }
        return arrayQueue.remove(0);
    }

    public void showInfo(){
        System.out.println(arrayQueue);
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue arrayQueue = new Queue();
        arrayQueue.enQueue("Jin");
        arrayQueue.enQueue("Nicolas");
        arrayQueue.enQueue("Kim");

        arrayQueue.showInfo();
        System.out.println();

        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
    }
}
