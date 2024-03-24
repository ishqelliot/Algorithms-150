import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    List<String> execute(int n){
        List<String> res = new ArrayList<>();
        generateParenthesis(res, 0, 0, n, "");
        return res;
    }

    void generateParenthesis(List<String> res, int left, int right, int n, String str){
        if(str.length() == 2*n){
            res.add(str);
            return;
        }
        if(left<n){
            generateParenthesis(res, left+1, right, n, str.concat("("));
        }
        if(right<left){
            generateParenthesis(res, left, right+1, n, str.concat(")"));
        }
    }
}
