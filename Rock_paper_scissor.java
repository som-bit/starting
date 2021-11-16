package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("Welcome to rock paper scissor");
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int p = 0;
        int o = 0;
        while(a<=5) {
            System.out.println("enter \"rock\" or \"paper\" or \"scissor\" to make a move and \"quit\" to leave the game");
            String x = sc.nextLine();
            if(x.equals("quit")){
                break;
            }
            if(!x.equals("rock")&&!x.equals("paper")&&!x.equals("scissor")){
                System.out.println("Your input is invalid");
                break;
            }
            else {
                Random r = new Random();
                int rand = r.nextInt(3);
                String o_move = "";
                if (rand == 0) {
                    o_move = "rock";
                } else if (rand == 1) {
                    o_move = "Paper";
                } else {
                    o_move = "scissor";
                }
                System.out.println("Opponent Move = " +o_move);
                if(x.equals(o_move)){
                    System.out.println("Round :"+a);
                    System.out.println("It's a tie");
                    System.out.println("your point :"+p);
                    System.out.println("opponent point :"+o);
                    a++;
                }
                else if(x.equals("rock") && o_move.equals("scissor")||x.equals("scissor") && o_move.equals("paper")||x.equals("paper") && o_move.equals("rock")){
                    System.out.println("Round :"+a);
                    System.out.println("you won");
                    a++;
                    p++;
                    System.out.println("your point :"+p);
                    System.out.println("opponent point :"+o);
                }
                else{
                    System.out.println("Round :"+a);
                    System.out.println("you lose");
                    a++;
                    o++;
                    System.out.println("your point :"+p);
                    System.out.println("opponent point :"+o);
                }

            }
        }
    }
}
