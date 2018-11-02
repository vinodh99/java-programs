package com.vinodh;

public class SumOddRange {
    public static boolean isOdd(int number){
        if(number<0) return false;
        if(number==1 || number%2!=0){
            return true;
        }
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        if(end>=start && end>0 && start >0){
            for (int i=start;i<=end;i++){
                sum=sum+i;
            }return sum;
        }return -1;
    }

}



