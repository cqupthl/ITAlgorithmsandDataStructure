package StackAndQueue.two;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        this.stackPush=new Stack<>();
        this.stackPop=new Stack<>();
    }

    public void add(Integer data){
        this.stackPush.push(data);
    }

    public int poll(){
        if(this.stackPush.empty()&&this.stackPop.empty()){
            throw new RuntimeException("空队列");
        }else{
            if(this.stackPop.empty()){
                while(!this.stackPush.empty()){
                    this.stackPop.push(this.stackPush.pop());
                }
            }
        }
        return this.stackPop.pop();
    }
    public int peek(){
        if(this.stackPush.empty()&&this.stackPop.empty()){
            throw  new RuntimeException("空队列");
        }else{
            if(this.stackPop.empty()){
                while(!this.stackPush.empty()){
                    this.stackPop.push(this.stackPush.pop());
                }
            }
        }
        return this.stackPop.peek();
    }


}
