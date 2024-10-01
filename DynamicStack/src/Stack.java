public class Stack {
    private int maxSize;
    private int [] stackArray;
    private int top;

    public Stack(int initialSize){
        maxSize = initialSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int x){
        if(isFull()){
           resize(maxSize * 2);
        }
        stackArray [++top] = x;
    }

    public int pop(int x){
        if(isEmpty()){
            throw new RuntimeException("Stack is full you Idiot");
        }
        int element = stackArray[--top];
        if(top > 0 && top == maxSize/4){
            resize(maxSize/2);
        }
        return element;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty you Idiot");
        }
        return stackArray[top];
    }

    public void resize(int newSize){

        int [] temp = new int[newSize];
        System.arraycopy(stackArray, 0, temp, 0, top + 1);
        stackArray = temp;
        maxSize = newSize;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return (top == maxSize -1);
    }

    public void display(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty you Idiot");
        }
        for(int i=0; i<=top; i++){
            System.out.println(stackArray[i] + " ");
        }
        System.out.println();
    }

}
