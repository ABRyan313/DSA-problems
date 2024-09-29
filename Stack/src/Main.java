//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(9);
        stack.push(4);
        stack.push(5);
        stack.display();

        System.out.println("Peek element" + stack.peek());
        System.out.println("pop element" + stack.pop(9));
        System.out.println("Is stack empty?" + stack.isEmpty());
        System.out.println("Is stack full?" + stack.isFull());

    }
}