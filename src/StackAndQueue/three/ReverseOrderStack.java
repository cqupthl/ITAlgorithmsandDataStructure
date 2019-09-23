package StackAndQueue.three;

import java.util.Stack;

public class ReverseOrderStack {

    public void reserve(Stack<Integer> stack){
        if(stack.empty()){
            return;
        }
        int i=getLastNumber(stack);
        reserve(stack);
        stack.push(i);
    }

    private int getLastNumber(Stack<Integer> stack) {
        int result=stack.pop();
        if(stack.empty()){
            return result;
        }
        int last=getLastNumber(stack);
        stack.push(result);
        return last;
    }
}
