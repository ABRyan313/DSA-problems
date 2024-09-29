import java.sql.SQLOutput;

public class Stack {
    private int maxSize;
    private int [] stackArray;
    int top;

    public Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int x){
        if (isFull()){
            throw new RuntimeException("Stack is full");
        }
        stackArray[++top] = x;
    }

    public int pop(int x){
        if (isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return stackArray[top--];
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for(int i = 0; i<=top; i++){
                System.out.println (stackArray[i] + " ");
            }
            System.out.println();
        }
    }

}
