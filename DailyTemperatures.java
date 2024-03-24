import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    int[] execute(int[] temperatures){
        int len = temperatures.length;
        int[] res = new int[len];
        Arrays.fill(res, 0);
        Stack<Integer> decreasingMonotone = new Stack<>();
        for(int i=0;i<len;i++){
            while (!decreasingMonotone.isEmpty() && temperatures[decreasingMonotone.peek()]<temperatures[i]){
                res[decreasingMonotone.peek()] = i - decreasingMonotone.peek();
                decreasingMonotone.pop();
            }
            decreasingMonotone.push(i);
        }
        return res;
        /* Superb Solution
        int n = temperatures.length;
        int hottest = 0;
        int answer[] = new int[n];

        for (int currDay = n - 1; currDay >= 0; currDay--) {
            int currentTemp = temperatures[currDay];
            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue;
            }

            int days = 1;
            while (temperatures[currDay + days] <= currentTemp) {
                // Use information from answer to search for the next warmer day
                days += answer[currDay + days];
            }
            answer[currDay] = days;
        }

        return answer;
         */
    }
}
