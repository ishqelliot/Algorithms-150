public class ContainerWithMostWater {

    int execute(int[] height){
        int i = 0;
        int j = height.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int minHeight = Math.min(height[i], height[j]);
            int capacity = minHeight * (j-i);
            max = Math.max(max, capacity);
            if(height[i]<height[j])i++;
            else j--;
        }
        return max;
    }
}
