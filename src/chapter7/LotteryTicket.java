package chapter7;

import java.util.Arrays;
import java.util.Random;


public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX= 69;

    public static void main(String[] args) {
        int[] ticket= generateNumbers ();
        printTicket(ticket);

    }

        public static int[] generateNumbers () {
            int[] tickets = new int[LENGTH];
            Random random = new Random();
            for (int i = 0; i < LENGTH; i++) {
                tickets[i] = random.nextInt(MAX) + 1;
            }
            return tickets;
        }
        public static void printTicket(int tickets[]){
        for (int i=0; i<LENGTH ;i++){
            System.out.print(tickets[i] + "|") ;
        }
        }

    }