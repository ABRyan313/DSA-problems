public class StackArray {
    private int stackSize;
    private char [] stack;
    private int top;

    public StackArray(int size){
        this.stackSize = size;
        this.stack = new char[stackSize];
        this.top = -1;
    }

    public void push(char entry){
        this.stack[++top] = entry;
    }

    public char pop(){
        char entry = this.stack[--top];
        return entry;
    }

    public char peek(){
        return stack[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == stackSize - 1);
    }
}
