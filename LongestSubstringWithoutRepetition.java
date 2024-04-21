import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepetition {
    int execute(String s){
        if(s.isEmpty()) return 0;
        char[] charArr = s.toCharArray();
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        int max = 1;
        while(left<=right && right<charArr.length){
            if(charMap.containsKey(charArr[right])){
                max = Math.max(max, charMap.size());
                int newLeft = charMap.get(charArr[right]) + 1;
                while(left<newLeft){
                    charMap.remove(charArr[left]);
                    left++;
                }
                charMap.put(charArr[right], right);
            }else {
                charMap.put(charArr[right], right);
                right++;
            }
            System.out.println(charMap.size());
        }
        return Math.max(max, charMap.size());
    }
}
