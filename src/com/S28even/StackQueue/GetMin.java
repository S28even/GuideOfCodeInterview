package com.S28even.StackQueue;

import java.util.Stack;

public class GetMin {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public GetMin(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }
    public void push(int newNum){
        if(stackMin.isEmpty()){
            stackMin.push(newNum);
        }
        else if(newNum<=stackMin.peek()){
            stackMin.push(newNum);
        }
        stackData.push(newNum);
    }
    public int pop(){
        if(stackData.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        int m = stackData.pop();
        if(m==this.getmin()){
            stackMin.pop();
        }
        return m;
    }
    public int getmin(){
        return stackMin.peek();
    }

    public static void main(String[] args) {
	// write your code here
        GetMin2 gm = new GetMin2();

    }
}

 class GetMin2{
     private Stack<Integer> stackData ;
     private Stack<Integer> stackMin;
     public GetMin2(){
         this.stackData = new Stack<Integer>();
         this.stackMin = new Stack<Integer>();
     }
     public int getMin(){
         return stackMin.peek();

     }
     public void push(int m){
         if(stackMin.isEmpty()){
             stackMin.push(m);
         }
         else if(m<=stackMin.peek()){
             stackMin.push(m);
         }
         else{
             stackMin.push(stackData.peek());
         }
         stackData.push(m);
     }
     public int pop(){
         stackMin.pop();
         return stackData.pop();
     }


}