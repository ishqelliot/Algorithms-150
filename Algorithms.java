import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        KFrequentElements obj = new KFrequentElements();
        int[] res = obj.execute(new int[]{1,2}, 2);
        System.out.println(Arrays.toString(Arrays.stream(res).toArray()));
    }
}
