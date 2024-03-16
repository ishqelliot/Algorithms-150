import java.util.Objects;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    int execute(String[] tokens){
        Stack<Integer> operands = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String currentToken = tokens[i];
            if(isOperator(currentToken)){
                Integer operatorB = operands.pop();
                Integer operatorA = operands.pop();
                if(isAdd(currentToken)){
                    operands.push(operatorA+operatorB);
                }else if(isSubtract(currentToken)){
                    operands.push(operatorA-operatorB);
                }else if(isMultiply(currentToken)){
                    operands.push(operatorA*operatorB);
                } else if (isDivision(currentToken)) {
                    operands.push(operatorA/operatorB);
                }
            }else{
                operands.push(Integer.valueOf(currentToken));
            }
        }
        return operands.pop();
    }

    boolean isOperator(String str){
        return (str.equals("/") || str.equals("+") || str.equals("-") || str.equals("*"));
    }

    boolean isAdd(String str){
        return str.equals("+");
    }

    boolean isSubtract(String str){
        return str.equals("-");
    }

    boolean isMultiply(String str){
        return str.equals("*");
    }

    boolean isDivision(String str){
        return str.equals("/");
    }
}
