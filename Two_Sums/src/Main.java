import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        int [] arr = { 1, 2, 3, 4, 5, 6};
        int target = 6;
        System.out.println(Arrays.toString(s.twoSum(arr, target)));
    }
}