import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KFrequentElements {
    // better approach - use priority queue instead of sorting the map
    int[] execute(int[] nums, int k){
        Map<Integer, Integer> numToFrequency = new HashMap<>();
        Arrays.stream(nums).forEach(num -> {
            numToFrequency.putIfAbsent(num, 0);
            numToFrequency.computeIfPresent(num, (key, oldValue) -> oldValue+1);
        });
        System.out.println(numToFrequency.toString());

        return numToFrequency.entrySet().stream()
                .sorted((datum1, datum2) -> datum1.getValue().compareTo(datum2.getValue()))
                .limit(2)
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue())).keySet().stream().mapToInt(x->x).toArray();
    }
}
