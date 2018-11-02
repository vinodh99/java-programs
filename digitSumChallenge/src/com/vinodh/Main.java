package com.vinodh;

    public class EvenDigitSum {
        public static int getEvenDigitSum(int number){
            int sum=0;
            while(number>0){
                int digit=number%10;
                if(digit%2==0 && digit!=0){
                    sum+=digit;
                }return sum;
            }return -1;
        }
    }