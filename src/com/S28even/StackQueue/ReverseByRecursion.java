package com.S28even.StackQueue;
import java.util.Stack;

/**
 * Created by wangjunp on 2016/7/13.
 */
public class ReverseByRecursion {
    private static int getLastElement(Stack<Integer> stack){
        if(stack.isEmpty()){
            throw new RuntimeException("this stack is empty");
        }
        int first = stack.pop();
        if(stack.isEmpty())
            return first;
        else{
            int last = getLastElement(stack);
            stack.push(first);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int last = getLastElement(stack);
        reverse(stack);
        stack.push(last);
    }

}
