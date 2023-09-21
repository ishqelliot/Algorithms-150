import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] res = obj.execute(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(res));
    }
}
