public class Main {

    public static void main(String[] args) {
        GenericStackArray<String> myStack = new GenericStackArray<String>();
        myStack.push("abc");
        myStack.push("bcd");
        myStack.push("cdf");
        myStack.push("xyz");

        GenericStackArray<Integer> stackOfArray  = new GenericStackArray<Integer>();
        stackOfArray.push(1);
        stackOfArray.push(3);
        stackOfArray.push(4);
        stackOfArray.push(6);

        System.out.println("*********************Print Strings*********************");
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

        System.out.println("*********************Print integers*********************");
        System.out.println(stackOfArray.peek());
        System.out.println(stackOfArray.pop());
        System.out.println(stackOfArray.peek());
    }

}
