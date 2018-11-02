package com.vinodh;

public class Main<finishNumber> {


    public static void main(String[] args) {
/*	int newScore = calculateScore("tim",500);
        System.out.println("new score is "+ newScore);
    }
    public static int calculateScore(String playername,int score){
        System.out.println("player" +playername+"scored"+score+"points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("player" + "unnamed scored" + score + "points");
       return score * 1000;
    }
*/

        int number = 4;
        int finishNumber = 20;
        int count =0;

        while (number <= finishNumber) {
            if (count==5){
                System.out.println("the total number of even numbers are "+count);
                break;
            }
            if (!isevennumber(number)) {
                number++;
                continue;
            }
            System.out.println("even number " + number);
            count ++;
            number++;
        }
}
        public static boolean isevennumber ( int number){
            if (number % 2 == 0) {
                return true;
            }
            return false;
        }

}

