import java.util.Arrays;

public class GenericStackArray <T>{

    private static final int MINIMUM_SIZE = 1024;
    private T [] array = (T[]) new Object[MINIMUM_SIZE];
    private int size = 0;

    public boolean push(T value) {
        if (size >= array.length) {
            grow();
            array[size++] = value;
        }
        return true;
    }

        public T pop(){
            if(size <= 0) {
                return null;
            }

            T t = array[--size];
            array [size] = null;

            int shrinkSize = array.length >> 1;
            if(shrinkSize >= MINIMUM_SIZE && size < shrinkSize){
                shrink();
            }
            return t;

        }

        public T peek(){
        if(size < 0) return null;
        T t = array[--size];
        return t;
        }

        public T get(int index){
             if(index > 0 && index < size) {
                 return array[index];
             }
             return null;
        }

        public boolean contains(T value){
        for(int i=0; i<size;i++){
            T obj = array[i];
            if(obj.equals(value)){
                return true;
            }
        }
        return false;
        }

        public boolean remove(T value){
            for(int i=0; i<size;i++){
                T obj = array[i];
                if(obj.equals(value)){
                    return remove(i);
                }
            }
            return false;
        }

    public boolean remove(int index){
        if (index != --size) {
            // Shift the array down one spot
            System.arraycopy(array, index + 1, array, index, size - index);
        }
        array[size] = null;
        int shrinkSize = array.length>>1;
        if(shrinkSize >= MINIMUM_SIZE && size < shrinkSize){
            shrink();
        }
        return true;
    }

        public void grow(){
            int groSize = size + (size<<1);
            array = Arrays.copyOf(array, groSize);
        }

        public void shrink(){
            int shrinkSize = array.length >> 1;
            array = Arrays.copyOf(array, shrinkSize);
        }

    public int size(){
        return size;
    }

    public void clear(){
        size = 0;
    }

    public boolean validate(){
        int localSize = 0;
        for(int i=0; i < array.length; i++){
            T t = array[i];
            if(i < size) {
                if(t==null) return false;
                localSize ++;
            }
            else{
               if (t != null) return false;
            }
        }
        return (localSize == size);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            builder.append(array[i]).append(", ");
        }
        return builder.toString();
    }

}


