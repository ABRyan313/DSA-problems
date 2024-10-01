public class DynamicStack {
    public static void main(String[] args) {

        Stack stack = new Stack(20);

        stack.push(40);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);

        stack.pop(50);

        stack.display();

        System.out.println("Peek is" + " " + stack.peek());
        System.out.println("Stack full:" + " " +stack.isFull());
        System.out.println("Stack empty" + " " + stack.isEmpty());



    }
}
