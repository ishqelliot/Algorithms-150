public class LargestRectangleInHistogram {

    //-------------------O(n^2)------------------------------
//    int execute(int[] height){
//        if(height.length==1){
//            return height[0];
//        }
//        int i = 0;
//        int rectangle = 0;
//        while(i<height.length){
//            if(height[i]==0){
//                i++;
//                continue;
//            }
//            int j = i-1;
//            int k = i+1;
//            int histogramCounter = 0;
//            while (j>=0 && height[j]>=height[i]){
//                histogramCounter++;
//                j--;
//            }
//            while (k<height.length && height[k]>=height[i]){
//                k++;
//                histogramCounter++;
//            }
//            int localRectangle = (histogramCounter+1)*height[i];
//            rectangle = Math.max(rectangle, localRectangle);
//            i++;
//        }
//        return rectangle;
//    }

    int execute(int[] heights){
        int[] leftBoundaryIndices = new int[heights.length];
        int[] rightBoundaryIndices = new int[heights.length];
        leftBoundaryIndices[0] = -1;
        rightBoundaryIndices[heights.length-1] = heights.length;
        for(int i=1;i<heights.length;i++){
            int p=i-1;
            while(p>=0 && heights[p]>=heights[i]){
                p = leftBoundaryIndices[p];
            }
            leftBoundaryIndices[i] = p;
        }
        for(int i=heights.length-2;i>=0;i--){
            int p = i+1;
            while (p<heights.length && heights[p]>=heights[i]){
                p = rightBoundaryIndices[p];
            }
            rightBoundaryIndices[i] = p;
        }
        int rectangle = 0;
        for(int i=0;i<heights.length;i++){
            rectangle = Math.max(rectangle, (rightBoundaryIndices[i]-leftBoundaryIndices[i]-1)*heights[i]);
        }
        return rectangle;
    }
}
