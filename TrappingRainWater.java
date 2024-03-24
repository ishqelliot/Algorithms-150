import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater {

    int execute(int[] height){
        int length = height.length;
        int i=0,j=length-1;
        int lMax = height[0],rMax = height[j];
        int res = 0;
        while (i<j){
            if(lMax<rMax){
                i++;
                if(lMax<height[i]){
                    lMax = height[i];
                }else{
                    res += lMax - height[i];
                }
            }else {
                j--;
                if(rMax<height[j]){
                    rMax = height[j];
                }else {
                    res += rMax - height[j];
                }
            }
        }
        return res;
    }
}
