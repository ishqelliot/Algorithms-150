import java.util.ArrayList;
import java.util.Arrays;

public class MinStack {
    class Node{
        int val;
        int min;
    }
    ArrayList<Node> arrStack;
    int globalMin;
    MinStack(){
        arrStack = new ArrayList<Node>();
        globalMin = Integer.MAX_VALUE;
    }

    void push(int val){
        Node node = new Node();
        node.val = val;
        boolean bl = val<globalMin;
        if(val<globalMin){
            globalMin = val;
        }
        node.min = globalMin;
        arrStack.add(node);
    }

    void pop(){
        int len = arrStack.size();
        Node topNode = arrStack.get(len-1);
        if(topNode.val == topNode.min && len-2>=0){
            globalMin = arrStack.get(len-2).min;
        }else if(topNode.val == topNode.min){
            globalMin = Integer.MAX_VALUE;
        }
        arrStack.remove(len-1);
    }

    int top(){
        int len = arrStack.size();
        return arrStack.get(len-1).val;
    }

    int getMin(){
        int len = arrStack.size();
        return arrStack.get(len-1).min;
    }
}
