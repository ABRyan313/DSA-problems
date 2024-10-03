public class Main {
    public static void main(String[] args) {
        // Stack অবজেক্ট তৈরি করা হচ্ছে
        Stack stack = new Stack();

        // Stack এ উপাদান যোগ করা হচ্ছে (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println("Top element is " + stack.peek());

       
        System.out.println(stack.pop() + " popped from stack");


        System.out.println("Top element is " + stack.peek());


        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}