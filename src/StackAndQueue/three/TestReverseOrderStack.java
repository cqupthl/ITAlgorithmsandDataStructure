package StackAndQueue.three;

import java.util.Stack;

public class TestReverseOrderStack {
    public static void main(String[] args) {
        ReverseOrderStack reverseOrderStack=new ReverseOrderStack();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println(stack.peek());
        reverseOrderStack.reserve(stack);
        System.out.println(stack.peek());
    }
}
