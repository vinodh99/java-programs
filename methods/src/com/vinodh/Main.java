package com.vinodh;

public class Main {

    public static void main(String[] args) {
	boolean gameover=true;
	int score = 800;
	int levelcompleted= 5;
	int bonus = 100;

        calculatescore(gameover, score,levelcompleted, bonus);
        System.out.println("the final score is "+ finalscore);

    }

    public static int calculatescore(boolean gameover, int score,int  levelcompleted, int bonus){
        if(gameover){
            int finalscore = score + (levelcompleted * bonus);
            finalscore+=2000;
            return finalscore;
        }
        return -1;
        }
    }
