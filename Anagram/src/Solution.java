import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String a, String b){

        if(a.length() != b.length()){
            return false;
        }

        char [] aSort = a.toCharArray();
        char [] bSort = b.toCharArray();

        Arrays.sort(aSort);
        Arrays.sort(bSort);

        return Arrays.equals(aSort, bSort);


    }
}
