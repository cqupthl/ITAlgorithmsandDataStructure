package StackAndQueue.five;

import java.util.Stack;

public class Sort {
    private Stack<Integer> help;
    private int temp;

    public Sort() {
        this.help=new Stack<>();
    }
    public Stack<Integer> sort(Stack<Integer> stack){
        while(!stack.isEmpty()){
             temp=stack.pop();

            if(help.isEmpty()||temp<=help.peek()){
                help.push(temp);
            }else{
                while(!help.isEmpty()&&temp>help.peek()){
                    stack.push(help.pop());
                }
            }

        }
        while(!help.isEmpty()){
            stack.push(help.pop());
        }
        return stack;
    }
}
