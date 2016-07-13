package com.S28even.StackQueue;

import java.util.Stack;

/**
 * Created by wangjunp on 2016/7/13.
 */
public class Stack2Queue {
    private Stack<Integer> input;
    private Stack<Integer> output;
    public Stack2Queue(){
        this.input = new Stack<Integer>();
        this.output = new Stack<Integer>();
    }
    public void enqueue(int m){
        input.push(m);
    }
    public int dequeue(){
        if(input.isEmpty()&&output.isEmpty()){
            throw new RuntimeException("your queue is empty");
        }
        if(output.isEmpty()){
            exchange();
            return output.pop();
        }
        else{
            return output.pop();
        }
    }
    private void exchange(){
        for (int i = 0; i < input.size(); i++) {
            output.push(input.pop());
        }
    }

    public static void main(String[] args){

    }


}
