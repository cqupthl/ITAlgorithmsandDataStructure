package StackAndQueue;

import java.util.Stack;

public class GetMinTwo {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinTwo() {
        this.stackData=new Stack<>();
        this.stackMin=new Stack<>();
    }

    public void push(int data){
        this.stackData.push(data);
        if(this.stackMin.empty()){
            this.stackMin.push(data);
        }else{
            if(data<this.stackMin.peek()){
                this.stackMin.push(data);
            }else{
                this.stackMin.push(this.stackMin.peek());
            }
        }
    }
    public int pop(){
        if(this.stackData.empty()){
            throw new RuntimeException("空棧");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }
    public int getMin(){
    if(this.stackMin.empty()){
        throw new RuntimeException("空棧");
    }
    return this.stackMin.peek();
    }
}
