public class ProductArrayExceptSelf {

    // first thought - get product of all elements and then in iteration divide by current element to get the rest of product
    // though corner cases like zero then needs to be handled specifically
    int[] execute(int[] nums){
        int[] preProductList = new int[nums.length];
        int[] postProductList = new int[nums.length];
        int preProduct = 1;
        int postProduct = 1;
        for (int i=0, j=nums.length-1; i<nums.length && j>=0; i++, j--){
            if(j+1 > nums.length-1){
                postProduct = 1;
                postProductList[j] = postProduct;
            }
            if(i-1 < 0){
                preProduct = 1;
                preProductList[i] = preProduct;
                continue;
            }
            preProduct = nums[i-1] * preProduct;
            preProductList[i] = preProduct;
            postProduct = nums[j+1] * postProduct;
            postProductList[j] = postProduct;
        }
        int[] result = new int[nums.length];
        for(int i=0;i<preProductList.length;i++){
            result[i] = preProductList[i] * postProductList[i];
        }
        return result;
    }
}
