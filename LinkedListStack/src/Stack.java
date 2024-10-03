public class Stack {

    private Node top;

    public Stack(){
        this.top = null;
    }

        public void push(int data){
          Node newNode = new Node(data);
          newNode.setNext(top);
          top = newNode;
            System.out.println(data + " pushed to stack");
        }

        public int pop(){
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
             int popped = top.getData();
             top = top.getNext();
           return popped;
        }

        public int peek(){
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.getData();
        }

    public boolean isEmpty() {
        return top == null; // যদি top null হয়, stack খালি
    }
    }

