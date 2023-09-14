package stackQueue;

public class Stack {
    private int maxSize, top;
    private int[] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        stackArray[++top] = value;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize -1);
    }
}
