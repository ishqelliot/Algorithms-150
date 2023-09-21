import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    int[] execute(int[] nums, int target) {
        int size = nums.length;
        int[] copied = new int[size];
        System.arraycopy(nums, 0, copied, 0, size);
        Arrays.sort(nums);
        int num1 = nums[0], num2 = nums[0], i = 0, j = size - 1;
        while(i<size && j>=0){
            int plausibleSum = nums[i] + nums[j];
            if(plausibleSum == target){
                num1 = nums[i];
                num2 = nums[j];
                break;
            }
            else if(plausibleSum<target){
                i++;
            }
            else {
                j--;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(i=0;i<size;i++){
            if(copied[i] == num1 || copied[i] == num2){
                res.add(i);
            }
        }
        int[] actualRes = new int[2];
        actualRes[0] = res.get(0);
        actualRes[1] = res.get(1);
        return actualRes;
    }
}
