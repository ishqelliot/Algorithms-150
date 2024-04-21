public class BuyAndSellStock {
    int execute(int[] prices){
        int left = 0;
        int right = 1;
        int max = Integer.MIN_VALUE;
        while(left<right && right<prices.length){
            max = Math.max(max, prices[right]-prices[left]);
            if(prices[left]<prices[right]){
                right++;
            }else{
                left++;
            }
            if(left==right){
                right++;
            }
        }
        return Math.max(max,0);
    }
}
