package stackQueue;

public class App {
    public static void main(String[] args) {
//        Stack stack = new Stack(10);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//
//        System.out.println("Stack output :");
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop() + ", ");
//        }
//
        Queue queue = new Queue(10);
        queue.insert(1);
        queue.insert(16);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println(queue.remove());
        System.out.println(queue.peekFront());
        System.out.println(queue.size());

//        System.out.println("\nQueue output :");
//        while (!queue.isEmpty()){
//            System.out.print(queue.remove() + ", ");
//        }
    }
}
