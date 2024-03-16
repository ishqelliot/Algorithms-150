import java.text.CollationKey;
import java.util.*;

public class ThreeSum {

    List<List<Integer>> execute(int[] nums){
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> res = new LinkedList<>();
        while(i < nums.length - 2){
            if ( i==0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length - 1;
                while(low<high){
                    int sum = nums[low] + nums[high] + nums[i];
                    if(sum == 0){
//                    List<Integer> triplets =;
                        if(nums[low] == nums[low+1] && low + 1<high){
                            low++;
                            continue;
                        }
                        if (nums[high] == nums[high - 1] && high - 1> low){
                            high--;
                            continue;
                        }
                        res.add( Arrays.asList(nums[low], nums[high], nums[i]));
                        low++;
                        high--;
                    }
                    else if(sum < 0){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
            i++;
        }
        return res;
    }
}
