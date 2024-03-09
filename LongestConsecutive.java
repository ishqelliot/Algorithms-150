import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    int execute(int[] nums){
        if(nums.length == 0) return 0;
        HashSet<Integer> numsHash = new HashSet<Integer>();
        Arrays.stream(nums).forEach(numsHash::add);
        int maxSequence = 1;
        for(int numHash : numsHash){
            if(!numsHash.contains(numHash-1)){
                int localSequence = 1;
                int next = numHash+1;
                while (numsHash.contains(next)){
                    next++;
                    localSequence++;
                }
                maxSequence = Math.max(localSequence, maxSequence);
            }
        }
        return maxSequence;
    }
}
