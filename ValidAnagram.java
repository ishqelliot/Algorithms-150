public class ValidAnagram {
    boolean execute(String s, String t){
        int sLen = s.length();
        if(sLen != t.length()){
            return false;
        }
        int[] charArr = new int[26];
        for(int i=0;i<sLen;i++){
            charArr[s.charAt(i)-'a']++;
            charArr[t.charAt(i)-'a']--;
        }
        for(int num : charArr){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
