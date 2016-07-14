package com.S28even.StackQueue;

/**
 * Created by mylnx on 7/13/16.
 */


public class HannuoRecursion {
    public static int Hannuo(int num){
        if(num<1)
            return -1;
        return process(num,"left","right");
    }


    private static int process(int num,String from, String to){
        if(num==1){
            if(from.equals("mid")||to.equals("mid")){
                System.out.println("move 1 from"+from+"to"+to);
                return 1;
            }
            else{
                System.out.println("move 1 from"+from + "to mid");
                System.out.println("move 1 from mid" + "to" + to);
                return 2;
            }
        }
        else{
            String another = (from.equals("left")||to.equals("left"))?"right":"left";
            if(from.equals("mid")||to.equals("mid")){
                int step1 = process(num-1,from,another);
                int step2 = 1;
                System.out.println("move"+num+"from"+from+"to"+to);
                int step3 = process(num-1, another,to);
                return step1+step2+step3;
            }
            else{
                int step1 = process(num-1,from,to);
                int step2 = 1;
                System.out.println("move"+num+"from "+from+"to "+another);
                int step3 = process(num-1,to,from);
                int step4 = 1;
                System.out.println("move"+ num +"from "+ another +"to "+ to );
                int step5 = process(num-1,from,to);
                return step1+step2+step3+step4+step5;
            }
        }
    }

}
