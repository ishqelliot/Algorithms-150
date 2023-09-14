import java.util.HashMap;

public class ContainsDuplicate {
    boolean execute(int[] nums){
        HashMap<Integer, Integer> uniqueNums = new HashMap<Integer, Integer>();
        for(int i : nums){
            if(uniqueNums.containsKey(i)){
                return true;
            }
            uniqueNums.put(i, 1);
        }
        return false;
    }
}
