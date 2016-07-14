package com.S28even.StackQueue;

import java.util.Stack;
import java.util.StringJoiner;

/**
 * Created by mylnx on 7/13/16.
 */


public class HannuoStack {
    private Stack<Integer> first;
    private Stack<Integer> second;
    private Stack<Integer> third;
    private int num;
    public enum Acc{
        No,L2M,M2L,M2R,R2M
    }
    public HannuoStack(int num){
        first = new Stack<Integer>();
        second = new Stack<Integer>();
        third = new Stack<Integer>();
        this.num = num;
        for(int i = num;i>0;i--){
            first.add(i);
        }
    }

    public int step(Acc a, Acc laststep, Acc thisstep, Stack<Integer> from, Stack<Integer> to, String f, String t){
        if(a!=laststep&&from.peek()<to.peek()){
            to.push(from.pop());
            System.out.println("move "+to.peek()+" from "+f+" to "+t);
            return 1;
        }
        return 0;
    }

    public int path(){
        Acc a = Acc.No;
        int num = 0;
        while(third.size()<num){
            num+= step(a,Acc.L2M,Acc.M2L,second,first,"mid","left");
            num+= step(a,Acc.M2L,Acc.L2M,first,second,"left","mid");
            num+= step(a,Acc.R2M,Acc.M2R,second,third,"mid","right");
            num+= step(a,Acc.M2R,Acc.R2M,third,second,"right","mid");
        }
        return num;
    }
}
