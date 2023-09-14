package stackQueue;

public class Queue {
    private int maxSize, front, rear, nItems;
    private int[] queueArray;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value){
        if (rear == maxSize -1) rear = -1;

        queueArray[++rear] = value;
        nItems++;
    }

    public int remove(){
        int temp = queueArray[front++];
        if (front == maxSize) front = 0;

        nItems--;
        return temp;
    }

    public int peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public int size(){
        return nItems;
    }
}
