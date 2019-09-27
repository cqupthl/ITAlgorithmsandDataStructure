package StackAndQueue.five;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Sort sort=new Sort();
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        for(int i=0;i<5;i++){
             System.out.println(sort.sort(stack).pop());
        }

    }
}
