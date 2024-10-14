public class ReverseStringUsingStackDS {

    public String ReverseWord(String word){
        StringBuilder stringBuilder = new StringBuilder();
        int size = word.length();
        StackArray stack = new StackArray(size);

        for(char c: word.toCharArray()){
            stack.push(c);
        }

        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
