public class TwoSumII {
    int[] execute(int[] numbers, int target) {
        int[] res = new int[2];
        int len = numbers.length;
        int i = 0;
        int j = len-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }else if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }
        }
        return new int[]{};
    }
}
