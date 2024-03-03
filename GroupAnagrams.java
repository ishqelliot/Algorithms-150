import java.util.*;

public class GroupAnagrams {
    List<List<String>> execute(String[] strs){
        Map<String, List<String>> anagramKeyToGroup = new HashMap<>();
        Arrays.stream(strs).forEach(str -> {
            char[] charsArr = str.toCharArray();
            Arrays.sort(charsArr);
            String sortedStr = new String(charsArr);
            if(anagramKeyToGroup.containsKey(sortedStr)){
                anagramKeyToGroup.get(sortedStr).add(str);
            } else {
                anagramKeyToGroup.put(sortedStr, new ArrayList<>(Arrays.asList(str)));
            }
        });
        return new ArrayList<>(anagramKeyToGroup.values());
    }
}
