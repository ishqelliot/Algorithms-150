import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    int execute(int target, int[] position, int[] speed){
        if (position.length == 1) return 1;
        Stack<Double> monotonicStack = new Stack<>();
        int[][] posAndSpeed = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            posAndSpeed[i][0] = position[i];
            posAndSpeed[i][1] = speed[i];
        }

        Arrays.sort(posAndSpeed, java.util.Comparator.comparingInt(o -> o[0]));
        for (int i = posAndSpeed.length - 1; i >= 0; i--) {
            double currentTime = (double) (target - posAndSpeed[i][0]) / posAndSpeed[i][1];
            if (!monotonicStack.isEmpty() && currentTime <= monotonicStack.peek()) {
                continue;
            } else {
                monotonicStack.push(currentTime);
            }
        }
        return monotonicStack.size();
    }
}
