import java.util.Arrays;
import java.util.HashSet;

public class Algorithms {
    public static void main(String[] args) {
        LongestSubstringWithoutRepetition obj = new LongestSubstringWithoutRepetition();
        String str = " ";
        char[] charArr = str.toCharArray();
        HashSet<Character> charSet = new HashSet<>();
        charSet.add(charArr[0]);
        System.out.println(obj.execute(" "));
    }
}
