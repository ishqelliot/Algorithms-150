public class ValidPalindrome {
    boolean execute(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len = s.length();
        for(int i=0,j=len-1;i<=j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
