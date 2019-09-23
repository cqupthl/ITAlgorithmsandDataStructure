package StackAndQueue.one;


import java.util.Stack;

public class GetMinOne{

    private Stack<Integer> stackDate;
    private Stack<Integer> stackMin;
    public GetMinOne(){
        this.stackDate=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }

    public void push(int newNumber){
        this.stackDate.push(newNumber);
        if(stackMin.empty()){
            this.stackMin.push(newNumber);
        }else{
          if(newNumber<=this.stackMin.peek()){
              this.stackMin.push(newNumber);
          }
        }
    }
    public int pop(){

        if(this.stackDate.empty()){
            throw new RuntimeException("空棧");
        }
        int value=this.stackDate.pop();
        if(value==this.stackMin.peek()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if(this.stackMin.empty()){
            throw new RuntimeException("空棧");
        }
        return this.stackMin.peek();
    }

    }

