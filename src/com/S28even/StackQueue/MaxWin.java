package com.S28even.StackQueue;

import java.util.LinkedList;

/**
 * Created by mylnx on 7/13/16.
 */
public class MaxWin {
    public static int[] getMaxWindow(int[] arr,int x){
        if(arr==null||arr.length==0||x<1||arr.length<x){
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int index = 0;
        int[] res = new int[arr.length-x+1];
        for (int i = 0; i < arr.length; i++) {
            while(!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst()==i-x){
                qmax.pollFirst();
            }
            if(i>=x-1){
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return arr;
    }
}
